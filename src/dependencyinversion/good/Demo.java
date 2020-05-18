package dependencyinversion.good;

public class Demo {
    public static void main(String[] args) {
        FBMesenger fbMesenger = new FBMesenger();
        Twitter twitter = new Twitter();

        Galery galery = new Galery();
        galery.setShareableApp(twitter);
        galery.send();

        galery.setShareableApp(fbMesenger);
        galery.send();
    }
}
