package employeedriver;
public class Commissioned extends Employee {

    private double comRate;
    private int grossSales;


    public Commissioned( String firstName, String lastName, double comRate, int grossSales){
        super(firstName, lastName);
        this.comRate = comRate;
        this.grossSales = grossSales;
    }
    public Commissioned(){}

}

