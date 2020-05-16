package liskov.bad;

public class Demo {
    public static void main(String[] args){

        //Adding employees
        Employee a = new PermanentEmployee(1L, "permanent employee", 50000);
        Employee b = new TemporaryEmployee(1L, "temporary employee", 60000);
        Employee c = new ContractEmployee(1L, "contract employee", 70000);

        Employee[] employees = {a, b, c};
        for(Employee e : employees) {
            try {
                e.getBonusAmount(); //Throws exception for TemporaryEmployee
            } catch (InvalidEmployeeException ex) {
                ex.printStackTrace();
            }
        }
    }
}
