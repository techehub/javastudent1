package enumtest;

public enum OrderStatus {
    PENDING ("001", "Pending"),
    REJECTED ("002", "Rejected");

    String status;
    String desc;

    OrderStatus(String status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
