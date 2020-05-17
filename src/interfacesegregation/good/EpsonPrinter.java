package interfacesegregation.good;

public class EpsonPrinter implements IPrint, IFax{
    private String name;
    private String brand; //We can create a Printer class and inherit name&brand from base class

    public EpsonPrinter(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public boolean faxContent(String content) {
        return false;
    }

    @Override
    public boolean printContent(String content) {
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
