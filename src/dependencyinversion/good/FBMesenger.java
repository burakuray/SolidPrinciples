package dependencyinversion.good;

public class FBMesenger implements IShareable{
    @Override
    public void send() {
        System.out.println("Sending from Facebook");
    }
}
