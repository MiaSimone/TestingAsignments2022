package unit.servicelayer.customer;
import dto.SmsMessage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import servicelayer.notifications.SmsService;
import servicelayer.notifications.SmsServiceMock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("unit")
public class SendMessageTest {

    @Test
    public void mustSendMessage() {
        SmsServiceMock smsService= new SmsServiceMock();
        boolean sendsMessage=smsService.sendSms(new SmsMessage("+45 60606060","You have a booking 7/7 from: 9pm to 10pm"));
        assertEquals(true,sendsMessage);
    }
}
