package openclosed.good;

//Base class and also should be support SRP
public class OrderReport {
    private String customer;
    private int total;

    public OrderReport(String customer, int total) {
        this.customer = customer;
        this.total = total;
    }

    public String getCustomer() {
        return customer;
    }

    public int getTotal() {
        return total;
    }
}
