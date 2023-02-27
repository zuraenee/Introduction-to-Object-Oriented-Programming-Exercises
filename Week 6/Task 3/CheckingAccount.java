public class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount(String dateCreated,double accountNumber, double annualInterestRate, double balance, double overdraftLimit){
        super(dateCreated, accountNumber, balance, annualInterestRate);
        this.overdraftLimit= overdraftLimit;
    }
    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    @Override
    public double withdraw(double amount){

        if (this.getBalance()-amount<overdraftLimit){
            System.out.println("You have exceeded your overdraft limit");

        }
        else{
            this.setBalance(this.getBalance()-amount);
        }
        return this.getBalance();
    }

    @Override
    public double withdraw(double amount, double overdraftLimit) {
        return 0;
    }

    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit= overdraftLimit;
    }
    public String toString(){
        return super.toString() + " Overdraft Limit: " + overdraftLimit;
    }
}
