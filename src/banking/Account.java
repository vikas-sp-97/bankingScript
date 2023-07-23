package banking;

import java.util.*;
import java.lang.*;
import banking.AccountTypes.AccountType;

class Account{
    private final int accountId;
    private final String name;
    private final Date dateOfBirth;
    private String email;
    private String address;
    AccountType accountType;
    private double balance;

    public Account(int accountId, String name, Date dateOfBirth){
        this.accountId = accountId;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if(balance > 0){
            this.balance = balance;
        }
        else{
            this.balance = 0;
            System.out.println("Invalid balance being set!");
        }
    }
}

