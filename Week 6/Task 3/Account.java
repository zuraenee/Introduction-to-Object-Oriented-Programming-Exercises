public abstract class Account {
    private String dateCreated;
    private double accountNumber, balance, annualInterestRate;
    public Account(){
        this.dateCreated = "01/01/2000";
        this.accountNumber = 4261823;
        this.balance = 901123;
        this.annualInterestRate = 120;
    }
    public Account(String dateCreated, double accountNumber, double balance, double annualInterestRate){
        this.dateCreated = dateCreated;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public double withdraw(double amount){
        return balance -= amount;
    }
    public double deposit(double amount){
        return balance += amount;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public String getDateCreated(){
        return dateCreated;
    }
    public double getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setDateCreated(String dateCreated){
        this.dateCreated = dateCreated;
    }
    public void setAccountNumber(double accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public abstract double withdraw(double amount, double overdraftLimit);

    public String toString(){
        return "Date Created: " + dateCreated + " Account Number: " + accountNumber + " Balance: " + balance + " Annual Interest Rate: " + annualInterestRate;
    }
}
