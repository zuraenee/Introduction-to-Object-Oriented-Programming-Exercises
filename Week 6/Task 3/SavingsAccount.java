public class SavingsAccount extends Account{
    private boolean ifOverdrawn;
    public SavingsAccount(String dateCreated,double accountNumber, double annualInterestRate, double balance, boolean ifOverdrawn){
        super(dateCreated, accountNumber, balance, annualInterestRate);
        this.ifOverdrawn= ifOverdrawn;
    }
    public boolean getIfOverdrawn(){
        return ifOverdrawn;
    }
    public void setIfOverdrawn(boolean ifOverdrawn){
        this.ifOverdrawn= ifOverdrawn;
    }

    @Override
    public double withdraw(double amount, double overdraftLimit) {
        return 0;
    }

    public String toString(){
        return super.toString() + " If Overdrawn: " + ifOverdrawn;
    }
}
