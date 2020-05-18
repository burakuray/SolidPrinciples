package dependencyinversion.good;

public class Demo {
    public static void main(String[] args) {
        FBMesenger fbMesenger = new FBMesenger();
        Twitter twitter = new Twitter();
        Viber viber = new Viber();

        Galery galery = new Galery();
        //Twitter
        galery.setShareableApp(twitter);
        galery.send();
        //Mesenger
        galery.setShareableApp(fbMesenger);
        galery.send();
        //Viber
        galery.setShareableApp(viber);
        galery.send();
    }
}
