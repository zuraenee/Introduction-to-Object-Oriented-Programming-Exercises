public class AccountInheritanceTest {
    public static void main(String[] args){
        Account[] accounts = new Account[5];
        accounts[0] = new SavingsAccount("1/1/2019", 1122, 4.5, 20000, true);
        accounts[1] = new CheckingAccount("1/1/2019", 1123, 4.5, 20000, 1000);
        accounts[2] = new SavingsAccount("1/1/2019", 1124, 4.5, 20000, false);
        accounts[3] = new CheckingAccount("1/1/2019", 1125, 4.5, 20000, 1000);
        accounts[4] = new SavingsAccount("1/1/2019", 1126, 4.5, 20000, true);
        for(Account account: accounts){
            System.out.println(account.toString());
        }
        CheckingAccount checkingaccount = new CheckingAccount("1/1/2019", 1123, 4.5, 20000, 1000);
        checkingaccount.withdraw(1000,100);
        System.out.println(checkingaccount.toString());
        checkingaccount.deposit(1000);
        System.out.println(checkingaccount.toString());
        SavingsAccount savingsaccount = new SavingsAccount("1/1/2019", 1122, 4.5, 20000, true);
        savingsaccount.withdraw(1000);
        System.out.println(savingsaccount.toString());
    }
}
