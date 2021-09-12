package employeedriver;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected int idNum;


    public Employee(String firstName, String lastName, int idNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;

    }

    public Employee(String firstName, String lastName) {
        this.firstName =firstName;
        this.lastName = lastName;
    }
    public Employee(){}
    public String toString(){
         return firstName + lastName + idNum;

    }

}
