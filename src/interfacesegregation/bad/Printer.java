package interfacesegregation.bad;

//Printer class has a name and brand
//IPrinterOptions is an interface with the operations printers can perform

/**
 * Problem
 * We want to add a new method to IPrinterOptions.
 * We will have to modify every object that implements the interface.
 * If n objects implement it, then thats n files that we have to change. That’ll take some time.*/

public class Printer implements IPrinterOptions {
    private String name;
    private String brand;

    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean faxContent(String content) {
        return false;
    }

    @Override
    public boolean photocopyContent(String content) {
        return false;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
}
