package openclosed.good;

public class ShippingInvoice extends OrderReport {
    private String address;

    public ShippingInvoice(String customer, int total, String address) {
        super(customer, total);
        this.address = address;
    }

    public void generateShippingReport() {
        System.out.println("---- Shipping Report ----");
        System.out.println("Customer: " + this.getCustomer());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Total: " + this.getTotal());
        System.out.println("-------------------------");
    }
    public String getAddress() {
        return address;
    }
}
