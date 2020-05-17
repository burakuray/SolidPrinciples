package interfacesegregation.good;

public class HPPrinter implements IPrint, IPhotocopy {
    private String name;
    private String brand;

    public HPPrinter(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public boolean photocopyContent(String content) {
        return false;
    }

    @Override
    public boolean printContent(String content) {
        return false;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
}
