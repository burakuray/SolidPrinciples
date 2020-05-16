package liskov.bad;

public class InvalidEmployeeException extends Exception{
    public InvalidEmployeeException(String expMessage){
        super(expMessage);
    }
}
