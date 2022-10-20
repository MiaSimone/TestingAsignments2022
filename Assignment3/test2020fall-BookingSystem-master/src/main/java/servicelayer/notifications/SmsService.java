package servicelayer.notifications;

import dto.SmsMessage;

public interface SmsService {
    /**
     * Sends an sms message.
     * @param message
     * @return true if success, false otherwise
     */
    boolean sendSms(SmsMessage message);
}
