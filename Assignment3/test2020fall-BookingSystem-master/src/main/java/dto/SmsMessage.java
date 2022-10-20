package dto;

import java.util.Objects;

public class SmsMessage {
    /**
     * The recipient number including country code
     */
    private final String recipient;
    private final String message;

    public SmsMessage(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsMessage that = (SmsMessage) o;
        return Objects.equals(recipient, that.recipient) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipient, message);
    }
}
