package servicelayer.booking;

import datalayer.customer.BookingStorage;
import dto.BookingCreation;
import dto.BookingStorageException;
import dto.SmsMessage;
import servicelayer.notifications.SmsService;

import java.util.Collection;

public class BookingServiceImpl implements BookingService{
    private BookingStorage bookingStorage;
    public BookingServiceImpl(BookingStorage bookingStorage) {
        this.bookingStorage = bookingStorage;
    }

    @Override
    public int createBooking(int customerId, int employeeId, String date, String time, String end) throws BookingServiceException {
        try {
            SmsService smsService = null;
            boolean didSend=smsService.sendSms(new SmsMessage("60606060","You have a booking "+date+" from:"+time+"to"+end));// g
            if(didSend){
                return bookingStorage.createBooking(new BookingCreation(customerId,employeeId,date,time,end));
            }
            else {
                throw new BookingServiceException("Could not send sms");
            }
            // et bookingID from show - list
        } catch (Exception e) {
            throw new BookingServiceException(e.getMessage());
        } catch (BookingStorageException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Collection getBookingsForCustomer(int customerId) throws BookingServiceException {
        try {
            return bookingStorage.getBookingsForCustomer(customerId);
        } catch (Exception e) {
            throw new BookingServiceException(e.getMessage());
        } catch (BookingStorageException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public Collection getBookingsForEmployee(int employeeId) throws BookingServiceException {
        try {
            return bookingStorage.getBookingsForEmployee(employeeId);
        } catch (Exception e) {
            throw new BookingServiceException(e.getMessage());
        } catch (BookingStorageException e) {
            e.printStackTrace();
        }
        return null;
    }
}
