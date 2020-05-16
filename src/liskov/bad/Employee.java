package liskov.bad;
/**
 * For refactoring
 * Convert Employee to a concrete class
 * Create an IBonus interface with the getBonusAmount() method
 * Have only the classes that are eligible to receive a bonus to implement IBonus
 * */
//Different types of employees: Permanent, Temporary, Contract
//Only Permanent & Contract employees are entitled to a bonus
public abstract class Employee {
    private Long id;
    private String name;
    private double salary;

    Employee(Long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract double getBonusAmount() throws InvalidEmployeeException;

    //Getters
    public Long getId() {
        return id;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
