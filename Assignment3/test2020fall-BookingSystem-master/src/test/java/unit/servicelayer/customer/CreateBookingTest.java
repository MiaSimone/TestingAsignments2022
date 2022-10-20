package unit.servicelayer.customer;

import datalayer.customer.BookingStorage;
import dto.BookingStorageException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import servicelayer.booking.BookingService;
import servicelayer.booking.BookingServiceImpl;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("unit")
public class CreateBookingTest {
    private BookingService bookingService;
    private BookingStorage storageMock;

    @BeforeAll
    public void beforeAll(){
        storageMock = mock(BookingStorage.class);
        bookingService = new BookingServiceImpl(storageMock);
    }

    @Test
    public void mustCallStorageWhenCreatingBooking() throws Exception, BookingStorageException {
        // Arrange
        // Act
        var customerId = 1;
        var employeeId = 1;

        bookingService.createBooking(customerId, employeeId, "2021-01-02","16","17");

        verify(storageMock, times(1))
                .createBooking(
                        argThat(x -> x.customerId == customerId &&
                                x.employeeId == employeeId));
    }
}
