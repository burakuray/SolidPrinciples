package liskov.good;

public class PermanentEmployee extends Employee implements IBonus{
    PermanentEmployee(Long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double getBonusAmount() {
        return this.getSalary() * 0.7;
    }
}
