package dto;

public class BookingCreation {
    public final int customerId;
    public final int employeeId;
    public final String date;
    public final String start;
    public final String end;

    public BookingCreation(int customerId, int employeeId, String date, String start, String end) {
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.date = date;
        this.start = start;
        this.end = end;
    }

}
