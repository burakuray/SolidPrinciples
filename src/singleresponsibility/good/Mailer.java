package singleresponsibility.good;

public class Mailer {

    public static void sendEmail(String content) {
        System.out.println("Sending email...");
        System.out.println(content);
    }
}
