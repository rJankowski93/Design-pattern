package pattern.composite;

public class Employee implements Component {
    private String name;
    private String surname;
    private float salary;

    public Employee(String name, String surname, float salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public void show() {
        System.out.println("[Name: " + name + ", Surname: " + surname + ", salary: " + salary + "]");
    }

    @Override
    public void changeSalary(float percent) {
        salary = salary + (salary * percent / 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
