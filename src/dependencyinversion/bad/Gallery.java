package dependencyinversion.bad;
/**
 * Problem
 * We need to implement n different apps
 * We can change send method
 * Even we dont need all app, we have to use them all with new keyword
 * New app means new if conditions etc.
 */

//Choose and image from gallery and share an application
public class Gallery {
    private Whatsapp whatsapp = new Whatsapp();
    private FBMessenger fbmsgr = new FBMessenger();
    private Twitter twitter = new Twitter();
    private Viber viber = new Viber();

    public void shareImg(String type) {
        if ("FB".equalsIgnoreCase(type)) {
            fbmsgr.send();
        } else if ("WP".equalsIgnoreCase(type)) {
            whatsapp.send();
        } else if("TW".equalsIgnoreCase(type)){
            twitter.send();
        } else {
            viber.send();
        }
    }
}
