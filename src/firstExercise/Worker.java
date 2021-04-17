package firstExercise;

public class Worker extends Human{
    private double wage;
    private double workedHours;

    public Worker(String firstName, String lastName, double wage, double workedHours) {
        super(firstName, lastName);
        this.wage = wage;
        this.workedHours = workedHours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public double getWagePerHour (){
        return wage/workedHours;
    }
}
