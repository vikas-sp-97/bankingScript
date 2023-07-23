package banking;

import java.util.Date;
import banking.AccountTypes.AccountType;

public class SavingsAccount extends Account{

    public SavingsAccount(int accountId, String name, Date dateOfBirth) {
        super(accountId, name, dateOfBirth);
        setAccountType(AccountType.SAVINGS);
    }

    public void depositAmount(double amount){
        double oldBalance = this.getBalance();
        this.setBalance(oldBalance + amount);
        System.out.println("Amount depostied: "+ amount);
    }

    public void checkBalance(){
        System.out.println("Account balance: "+ this.getBalance());
    }

    public void withdrawAmount(double amount){
        double oldBalance = this.getBalance();
        if (oldBalance > amount) {
            this.setBalance(oldBalance - amount);
            System.out.println("Amount withdrawed successfully!");
        }
        else{
            System.out.println("Insufficient balance, current balance is :"+ oldBalance);
        }
    }

    public String toString(){
        return "AccountID: "+ this.getAccountId() + "\nName: " + this.getName() +
                "\nAccountType: "+ this.getAccountType();
    }
}
