// Subclass of a Superclass EmployeeSuperClass

public class Salesperson extends EmployeeSuperClass {

    private double commissionPercentage;

    // constructor
    public Salesperson(String name, double salary, int age,
                       double commissionPercentage) {
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }

    public double commissionPercentage(){
        return this.commissionPercentage;
    }

    public void raiseCommission(){
        if (this.commissionPercentage < .30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }

}
