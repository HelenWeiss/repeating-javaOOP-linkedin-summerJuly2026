// Subclass of a Superclass EmployeeSuperClass

public class Analyst extends EmployeeSuperClass {

    public Analyst (String name, double salary, int age) {
        super(name, salary, age);  // would be red line in a brackets without "extends EmployeeSuperClass"
    }

    public double getAnnualBonus(){
        return super.salary* .05;
    }
}
