package dependencyinversion.good;

public class Galery {
    IShareable shareableApp;

    public void setShareableApp(IShareable shareableApp) {
        this.shareableApp = shareableApp;
    }

    public void send(){
        shareableApp.send();
    }
}
