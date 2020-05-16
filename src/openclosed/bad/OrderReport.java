package openclosed.bad;

/**
 * For refactoring
 * OrderReport is the parent class.
 * Invoice and ShippingReport will both be sub-classes that have their own unique purpose.
 * */
public class OrderReport {
    private String customer;
    private int total;

    public OrderReport(String customer, int total) {
        this.customer = customer;
        this.total = total;
    }

    //Getters & Setters
    public void generateInvoice() {
        System.out.println("---- Invoice ----");
        System.out.println("Customer: " + this.getCustomer());
        System.out.println("Total: " + this.getTotal());
        System.out.println("-----------------");
    }

    public void generateShippingReport() {
        System.out.println("---- Shipping Report ----");
        System.out.println("Customer: " + this.getCustomer());
        System.out.println("Total: " + this.getTotal());
        System.out.println("-------------------------");
    }

    //Getters
    public String getCustomer() {
        return customer;
    }

    public int getTotal() {
        return total;
    }
}
