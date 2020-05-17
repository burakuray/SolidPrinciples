package dependencyinversion.good;

public class Viber implements IShareable{
    @Override
    public void send() {
        System.out.println("Sending from Viber");
    }
}
