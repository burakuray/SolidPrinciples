package dependencyinversion.good;

public class Twitter implements IShareable{
    @Override
    public void send() {
        System.out.println("Sending from Twitter");
    }
}
