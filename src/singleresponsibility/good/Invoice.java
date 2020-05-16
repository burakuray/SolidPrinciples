package singleresponsibility.good;

public class Invoice {
    private String customer;
    private int total;

    public Invoice(String customer, int total) {
        this.customer = customer;
        this.total = total;
    }

    //Getters & Setters
    public String getDetails() {
        return this.getCustomer() + ", "+ this.getTotal();
    }

    //Getters
    public String getCustomer() {
        return customer;
    }

    public int getTotal() {
        return total;
    }
}
