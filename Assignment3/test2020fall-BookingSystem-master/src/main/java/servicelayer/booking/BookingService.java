package servicelayer.booking;

import java.util.Collection;

public interface BookingService {
    int createBooking(int customerId, int employeeId, String date, String time,String end) throws BookingServiceException;
    Collection getBookingsForCustomer(int customerId) throws BookingServiceException;
    Collection getBookingsForEmployee(int employeeId) throws BookingServiceException;
}
