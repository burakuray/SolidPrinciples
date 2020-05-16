package openclosed.good;

public class Invoice extends OrderReport {
    public Invoice(String customer, int total) {
        super(customer, total);
    }

    public void generateInvoice() {
        System.out.println("---- Invoice ----");
        System.out.println("Customer: " +
                this.getCustomer());
        System.out.println("Total: " + this.getTotal());
        System.out.println("-----------------");
    }
}
