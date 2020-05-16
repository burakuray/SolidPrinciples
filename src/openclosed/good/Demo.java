package openclosed.good;

public class Demo {
    public static void main(String[] args) {
        //Create an Invoice object becuase we want to generate an invoice
        Invoice inv = new Invoice("Burak", 1000);
        inv.generateInvoice();

        //Let's create a shipping report for "Burak"
        String customer = inv.getCustomer();
        int total = inv.getTotal();

        ShippingInvoice sh = new ShippingInvoice(customer, total, "123th street Istanbul/Turkey");
        sh.generateShippingReport();
    }
}
