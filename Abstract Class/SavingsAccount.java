//BS'D
/*
Design a SavingsAccount class that extends the BankAccount class. The SavingsAccount
class should have a status field to represent an active or inactive account. If the balance of a
savings account falls below $25, it becomes inactive. (The status field could be a boolean
variable.) No more withdrawals may be made until the balance is raised above $25, at
which time the account becomes active again. The savings account class should have the
following methods:

withdraw: A method that determines whether the account is inactive before a
withdrawal is made. (No withdrawal will be allowed if the account
is not active.) A withdrawal is then made by calling the superclass
version of the method.
deposit: A method that determines whether the account is inactive before a
deposit is made. If the account is inactive and the deposit brings the
balance above $25, the account becomes active again. A deposit is
then made by calling the superclass version of the method.
monthlyProcess: This method checks the number of withdrawals. If the number of withdrawals for the month is
more than 4, a service charge of $1 for each withdrawal above 4
is added to the superclass field that holds the monthly service charges.
Then the method the monthly service charges from the balance, calls the calcInterest method, and then sets the variables that
hold the number of withdrawals, number of deposits, and monthly
service charges to zero
(Don’t forget to check the account balance after the service charge is
taken. If the balance falls below $25, the account becomes inactive.)
 */
public class SavingsAccount extends BankAccount {
    private boolean activityStatus;

    public SavingsAccount(double balance, double annualRate){
        super(balance,annualRate);
        this.activityStatus = false;
    }

    private void isActive() {
        if(super.getBalance() >= 25)
            activityStatus = true;
        else
            activityStatus = false;
        return;
    }

    @Override
    public void deposit(double deposit) {
        isActive();
        if(activityStatus == false && super.getBalance()+deposit >= 25){
            activityStatus = true;
        }
        super.deposit(deposit);
        return;
    }

    @Override
    public void withdraw(double withdraw) {
        isActive();
        if(activityStatus == true)
            super.withdraw(withdraw);
        else
            System.out.println("Account inactive, please bring balance above 25$ before attempting another withdrawal");
        return;
    }

    @Override
    public void monthlyProcess(double serviceCharge) {

        if(super.getNumWithdrawals() > 4)
            super.setMonthlyServiceCharges(serviceCharge + (super.getNumWithdrawals() - 4));
        else
            super.setMonthlyServiceCharges(serviceCharge);

        super.setBalance(super.getBalance()-super.getMonthlyServiceCharges());
        super.calcInterest();
        super.setNumDepositsThisMonth(0);
        super.setNumWithdrawals(0);
        super.setMonthlyServiceCharges(0);

        isActive();

    }

    public boolean getActivityStatus() {
        return activityStatus;
    }

    public String toString() {
        return "Account balance: " + super.getBalance() + " Annual Rate: " + super.getAnnualRate();
    }
}
