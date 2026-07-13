// Superclass (parent) for Subclasses (child classes) Salesperson and Analyst
public class EmployeeSuperClass {

    private String name;
    protected double salary;
    private int age;

    EmployeeSuperClass(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary() {
        this.salary = this.salary + 1.2;
    }
}
