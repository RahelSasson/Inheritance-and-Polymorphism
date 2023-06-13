//BS'D
/*
In a particular factory, a team leader is an hourly paid production worker that leads a small
team. In addition to hourly pay, team leaders earn a fixed monthly bonus. Team leaders are
required to attend a minimum number of hours of training per year. Design a TeamLeader
class that extends the ProductionWorker class you designed in Programming Challenge 1.
The TeamLeader class should have fields for the monthly bonus amount, the required number of training hours, and the number of training hours that the team leader has attended.
Write one or more constructors and the appropriate accessor and mutator methods for the
class. D
 */
public class TeamLeader extends ProductionWorker {
    private final double monthlyBonusAmount = 500.00;
    private final int requiredTrainingHours = 10;
    private int trainingHoursWorked;


    public TeamLeader(String employeeName, String employeeNumber, String date, int shift, double payRate, int trainingHoursWorked) {
        super(employeeName,employeeNumber,date,shift,payRate);
        this.trainingHoursWorked = trainingHoursWorked;
    }

    public TeamLeader(ProductionWorker wk, int trainingHoursWorked) {
        super(wk.getEmployeeName(), wk.getEmployeeNumber(), wk.hireDateString(), wk.shift,wk.getPayRate());
        this.trainingHoursWorked = trainingHoursWorked;
    }

    public TeamLeader(ProductionWorker wk) {
        super(wk.getEmployeeName(), wk.getEmployeeNumber(), wk.hireDateString(), wk.shift,wk.getPayRate());
        this.trainingHoursWorked = 0;
    }

    public void setTrainingHoursWorked(int trainingHoursWorked) {
        this.trainingHoursWorked = trainingHoursWorked;
    }

    public int getTrainingHoursWorked() {
        return trainingHoursWorked;
    }

    public double getMonthlyBonus() {
        if(this.getTrainingHoursWorked() >= this.requiredTrainingHours)
            return monthlyBonusAmount;

        return 0.0;
    }
}
