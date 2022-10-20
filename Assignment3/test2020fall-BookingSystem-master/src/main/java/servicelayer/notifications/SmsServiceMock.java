package servicelayer.notifications;

import dto.SmsMessage;

public class SmsServiceMock implements  SmsService {
    @Override
    public boolean sendSms(SmsMessage message) {
        return true;
    }
}
