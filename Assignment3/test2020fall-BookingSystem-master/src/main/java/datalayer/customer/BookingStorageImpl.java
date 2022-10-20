package datalayer.customer;

import dto.Booking;
import dto.BookingCreation;
import dto.BookingStorageException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookingStorageImpl implements BookingStorage {
    private String connectionString;
    private String username, password;

    public BookingStorageImpl(String conStr, String user, String pass){
        connectionString = conStr;
        username = user;
        password = pass;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionString, username, password);
    }

    @Override
    public int createBooking(BookingCreation bookingCreation) throws BookingStorageException {
        var sql = "INSERT INTO Booking (customerId, employeeId, date, start,end) VALUES (?, ?, ?, ?,?)";
        try (var connection = getConnection();
             var preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setInt(1, bookingCreation.customerId);
            preparedStatement.setInt(2, bookingCreation.employeeId);
            preparedStatement.setString(3, bookingCreation.date);
            preparedStatement.setString(4, bookingCreation.start);
            preparedStatement.setString(5, bookingCreation.end);
            preparedStatement.execute();
            try (var resultSet = preparedStatement.getGeneratedKeys()) {
                resultSet.next();
                int newId = resultSet.getInt(1);
                return newId;
            }

        } catch (Exception e) {
            throw new BookingStorageException(e.getMessage());
        }
    }

    @Override
    public List<Booking> getBookingsForCustomer(int customerId) throws BookingStorageException {
        var sql = "SELECT * FROM Booking WHERE customerId = ?";
        try (var connection = getConnection();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, customerId);
            try (var resultSet = preparedStatement.executeQuery()) {
                var bookingList = new ArrayList<Booking>();
                while (resultSet.next()) {
                    var id = resultSet.getInt("id");
                    var employeeId = resultSet.getInt("employeeId");
                    var date = resultSet.getString("date");
                    var start = resultSet.getString("start");
                    var end = resultSet.getString("end");
                    var booking = new Booking(id, customerId, employeeId, date, start,end);
                    bookingList.add(booking);
                }
                return bookingList;
            }
        } catch (Exception e) {
            throw new BookingStorageException(e.getMessage());
        }
    }

    @Override
    public List<Booking> getBookingsForEmployee(int employeeId) throws BookingStorageException {
        var sql = "SELECT * FROM Booking WHERE employeeId = ?";
        try (var connection = getConnection();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, employeeId);
            try (var resultSet = preparedStatement.executeQuery()) {
                var bookingList = new ArrayList<Booking>();
                while (resultSet.next()) {
                    var id = resultSet.getInt("id");
                    var customerId = resultSet.getInt("customerId");
                    var date = resultSet.getString("date");
                    var start = resultSet.getString("start");
                    var end = resultSet.getString("end");
                    var booking = new Booking(id, customerId, employeeId, date, start,end);
                    bookingList.add(booking);
                }
                return bookingList;
            }
        } catch (Exception e) {
            throw new BookingStorageException(e.getMessage());
        }
    }

}
