package liskov.good;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //Adding employees
        TemporaryEmployee a = new TemporaryEmployee(1L,"temporary employee",50000);
        PermanentEmployee b = new PermanentEmployee(1L,"temporary employee",60000);
        ContractEmployee c = new ContractEmployee(1L,"temporary employee",70000);

        List<IBonus> employees = new ArrayList<>();
        //employees.add(a); Compile error TemporaryEmployee doesnt implement IBonus interface
        employees.add(b);
        employees.add(c);

        for(IBonus e:employees){
            System.out.println(e.getBonusAmount());
        }
    }
}
