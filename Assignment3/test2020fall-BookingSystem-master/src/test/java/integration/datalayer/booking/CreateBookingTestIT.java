package integration.datalayer.booking;

import datalayer.booking.BookingStorage;
import datalayer.booking.BookingStorageImpl;
import dto.BookingCreation;
import dto.BookingStorageException;
import integration.ContainerizedDbIntegrationTestIT;
import org.junit.jupiter.api.*;
import servicelayer.booking.BookingServiceException;
import servicelayer.booking.BookingServiceImpl;

import java.sql.SQLException;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("integration")
public class CreateBookingTestIT extends ContainerizedDbIntegrationTestIT {
    private BookingStorage bookingStorage;

    @BeforeAll
    public void Setup() throws SQLException {
        runMigration(3);
        bookingStorage = new BookingStorageImpl(getConnectionString(), "root", getDbPassword());
    }

    @Test
    public void mustSaveBooking() throws SQLException, BookingStorageException, BookingServiceException {
//        int bookingId=bookingStorage.createBooking(new BookingCreation(1, 1, "2021-01-02","16","17"));
//        var bookings = bookingStorage.getBookingsForCustomer(1);
//        assertTrue(bookings.stream().anyMatch(x -> x.getId() == bookingId));

        var bookingService = new BookingServiceImpl(bookingStorage);
        int bookingId = bookingService.createBooking(1, 1, "2021-01-02","16","17");
        var bookings = bookingStorage.getBookingsForCustomer(1);
        assertTrue(
                bookings.stream().anyMatch(x ->
                        x.getId() == bookingId));
    }

    @Test
    public void mustReturnLatestId() throws SQLException, BookingStorageException {
        // Arrange
        // Act
        var id1 = bookingStorage.createBooking(new BookingCreation(1, 1, "2021-01-02","16","17"));
        var id2 = bookingStorage.createBooking(new BookingCreation(1, 1, "2021-01-02","16","17"));

        // Assert
        assertEquals(1, id2 - id1);
    }
}
