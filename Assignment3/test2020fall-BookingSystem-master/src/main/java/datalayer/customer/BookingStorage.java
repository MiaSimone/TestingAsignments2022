package datalayer.customer;

import dto.Booking;
import dto.BookingCreation;
import dto.BookingStorageException;

import java.util.List;

public interface BookingStorage {
    public int createBooking(BookingCreation bookingCreation) throws BookingStorageException;
    public List<Booking> getBookingsForCustomer(int customerId) throws BookingStorageException;
    public List<Booking> getBookingsForEmployee(int employeeId) throws BookingStorageException;
}
