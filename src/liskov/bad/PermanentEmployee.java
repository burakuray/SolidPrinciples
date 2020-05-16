package liskov.bad;

import java.math.BigDecimal;

public class PermanentEmployee extends Employee {
    PermanentEmployee(Long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double getBonusAmount() {
        return this.getSalary() * 0.7;
    }
}
