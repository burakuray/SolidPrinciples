package singleresponsibility.bad;

/**
 * For refactoring
 * Mailer — handles the emailing
 * Sales Tax — handles the sales tax calculation
 * Invoice — handles the invoice info
 */
public class Invoice {
    private String customer;
    private String state;
    private int total;

    public Invoice(String customer, String state, int total) {
        this.customer = customer;
        this.state = state;
        this.total = total;
    }

    //Getters & Setters
    public String getDetails() {
        return this.getCustomer() + ", " + this.getTotal();
    }

    public void emailInvoice() {
        System.out.println("Sending email...");
        //System.out.println(this.details());
    }

    public double determineTax() {
        switch (this.state) {
            case "VIC":
                return 0.3;
            case "NSW":
                return 0.5;
            default:
                return 0.0;
        }
    }

    //Getters
    public String getCustomer() {
        return customer;
    }

    public int getTotal() {
        return total;
    }
}

