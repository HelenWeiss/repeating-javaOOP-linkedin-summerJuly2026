public class Employee {

    // non-static attributes
    String name;
    int age;
    double salary;
    String location;

    // constructor
    Employee (String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public void raiseSalary() {
        this.salary = this.salary * 1.5;
    }
}
