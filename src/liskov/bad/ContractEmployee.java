package liskov.bad;

public class ContractEmployee extends Employee {
    ContractEmployee(Long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double getBonusAmount(){
        return this.getSalary() * 0.5;
    }
}
