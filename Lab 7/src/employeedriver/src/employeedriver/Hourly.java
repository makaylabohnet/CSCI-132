package employeedriver;

public class Hourly extends Employee {
    private double wage;
    private int hours;

    public Hourly(String firstName, String lastName, double wage, int hours) {
        super(firstName, lastName);
        this.wage = wage;
        this.hours = hours;

    }

    public Hourly() {
    }

    public String toString() {
        return firstName + lastName + idNum;

    }
}

