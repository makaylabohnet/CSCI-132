package employeedriver;

public class CommissionBase extends Commissioned {
    private int base;



    public CommissionBase(String firstName, String lastName, double comRate, int grossSales, int base){
        super(firstName, lastName, comRate, grossSales );
        this.base = base;

    }
    public CommissionBase(){}

}
