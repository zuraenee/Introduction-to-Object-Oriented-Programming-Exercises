class User {
    private String accountNum;
    private double balance;

    public void introduce() {
        System.out.println(this.accountNum + " " + this.balance);
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountNum() {
        return this.accountNum;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        this.balance -= withdraw;
    }
}

public class UserTest {
    public static void main(String[] args) {
        User first = new User();
        first.setAccountNum("1444-4345-4423-2322");
        first.setBalance(499);
        first.introduce();
        System.out.println(first.getAccountNum() + " Account has initial balance of " + first.getBalance());
        first.deposit(500);
        System.out.println(first.getAccountNum() + " Account balance after deposit is " + first.getBalance());
        first.withdraw(34);
        System.out.println(first.getAccountNum() + " Account balance after withdrawn is " + first.getBalance());
    }
}
