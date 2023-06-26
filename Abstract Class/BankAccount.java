//BS'D
/*
Design an abstract class named BankAccount to hold the following data for a bank account:
•	 Balance
•	 Number of deposits this month
•	 Number of withdrawals
•	 Annual interest rate
•	 Monthly service charges
The class should have the following methods:
Constructor: The constructor should accept arguments for the balance and annual
interest rate.
deposit: A method that accepts an argument for the amount of the deposit.
The method should add the argument to the account balance. It
should also increment the variable holding the number of deposits.
withdraw: A method that accepts an argument for the amount of the withdrawal.
The method should subtract the argument from the balance. It should
also increment the variable holding the number of withdrawals.
calcInterest: A method that updates the balance by calculating the monthly interest earned by the account, and adding this interest to the balance.
This is performed by the following formulas:
 Monthly Interest Rate 5 (Annual Interest Rate / 12)
 Monthly Interest 5 Balance * Monthly Interest Rate
 Balance 5 Balance 1 Monthly Interest
monthlyProcess: Abtract Method
 */
public abstract class BankAccount {
    private double balance;
    private int numDepositsThisMonth;
    private int numWithdrawals;
    private double annualRate;
    private double monthlyServiceCharges;

    public BankAccount(double balance, double annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
        this.numDepositsThisMonth = 0;
        this.numWithdrawals = 0;
        this.monthlyServiceCharges = 0;
    }

    protected void deposit(double deposit) {
        balance += deposit;
        numDepositsThisMonth++;
        return;
    }

    protected void withdraw(double withdraw) {
        balance -= withdraw;
        numWithdrawals++;
        return;
    }

    protected void calcInterest() {
        double monthlyRate = annualRate/12;
        double monthlyInterest = balance * monthlyRate;
        balance += monthlyInterest;
        return;
    }

    public abstract void monthlyProcess(double serviceCharge);

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public int getNumDepositsThisMonth() {
        return numDepositsThisMonth;
    }

    protected void setNumDepositsThisMonth(int numDepositsThisMonth) {
        this.numDepositsThisMonth = numDepositsThisMonth;
    }

    public int getNumWithdrawals() {
        return numWithdrawals;
    }

    protected void setNumWithdrawals(int numWithdrawals) {
        this.numWithdrawals = numWithdrawals;
    }

    protected void setMonthlyServiceCharges(double monthlyServiceCharges) {
        this.monthlyServiceCharges = monthlyServiceCharges;
    }

    public double getMonthlyServiceCharges() {
        return monthlyServiceCharges;
    }
}
