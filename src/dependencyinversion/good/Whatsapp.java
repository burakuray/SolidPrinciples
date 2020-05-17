package dependencyinversion.good;

public class Whatsapp implements IShareable{
    @Override
    public void send() {
        System.out.println("Sending from whatsapp");
    }
}
