package dto;

public class Booking {
    private final int id;
    private final int customerId;
    private final int employeeId;
    private final String date;
    private final String start;
    private final String end;

    public Booking(int id, int customerId, int employeeId, String date, String start, String end) {
        this.id = id;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.date = date;
        this.start= start;
        this.end= end;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDate() {
        return date;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }
}
