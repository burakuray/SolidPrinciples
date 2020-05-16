package liskov.good;

public class ContractEmployee extends Employee implements IBonus{
    ContractEmployee(Long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double getBonusAmount() {
        return this.getSalary() * 0.5;
    }
}
