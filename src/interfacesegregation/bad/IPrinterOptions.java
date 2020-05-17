package interfacesegregation.bad;

//properties of printer
public interface IPrinterOptions {
    boolean printContent(String content);
    boolean faxContent(String content);
    boolean photocopyContent(String content);
}
