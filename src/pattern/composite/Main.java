package pattern.composite;

public class Main {
    public static void main(String[] args) {
        Component employee1 = new Employee("John", "John",1000);
        Component employee2 = new Employee("Jack", "Jack",1200);
        Component employee3 = new Employee("Charlie", "Charlie",1300);
        Component employee4 = new Employee("James", "James",1400);
        Component employee5 = new Employee("Jacob", "Jacob",1500);

        Component composite = new Composite();
        composite.add(employee1);
        composite.add(employee2);
        composite.add(employee3);
        composite.add(employee4);
        composite.add(employee5);

        composite.show();
        composite.changeSalary(10);
        composite.show();
    }
}
