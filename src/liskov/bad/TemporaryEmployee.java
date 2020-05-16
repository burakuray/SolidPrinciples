package liskov.bad;

public class TemporaryEmployee extends Employee{
    TemporaryEmployee(Long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double getBonusAmount() throws InvalidEmployeeException {
        throw new InvalidEmployeeException(this.getName() + " cannot take a bonus because of employee type.");
    }
}
