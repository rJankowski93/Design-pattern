package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    List<Employee> employees = new ArrayList<>();

    @Override
    public void add(Component component) {
        employees.add((Employee) component);
    }

    @Override
    public void remove(Component component) {
        employees.remove(component);
    }

    @Override
    public void show() {
        for (Employee employee : employees) {
            employee.show();
        }
    }

    @Override
    public void changeSalary(float percent) {
        for (Employee employee : employees) {
            employee.changeSalary(percent);
        }
    }
}
