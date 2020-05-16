package singleresponsibility.good;

public class Demo {
    public static void main(String[] args) {
        //Create a new invoice
        Invoice invoice = new Invoice("Burak URAY", 500);
        //Create a tax object
        SalesTax tax = new SalesTax("VIC");
        tax.determineTax(); //returns 0.3
        //Print out the details
        String details = invoice.getDetails();
        System.out.println(details); //Outputs; "Burak URAY, 500"
        //Let's email the invoice
        Mailer.sendEmail(details);

    }
}
