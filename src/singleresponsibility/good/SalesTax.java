package singleresponsibility.good;

public class SalesTax {
    private String state;

    public SalesTax(String state) {
        this.state = state;
    }

    //Getters & Setters
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
}
