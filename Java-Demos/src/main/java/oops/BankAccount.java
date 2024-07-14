package oops;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //getter
    public String getAccountNumber() {
        return accountNumber;
    }
//    //setter
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    public double getBalance() {
        return balance;
    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void deposit(double amount) {
        if(amount>0){
            balance+=amount;//balance=balance+amount
            System.out.println("Deposited: "+amount+"New balance: "+balance);
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if(amount>0 && amount<=balance){
            balance-=amount;//balance=balance+amount
            System.out.println("Withdrew: "+amount+"New balance: "+balance);
        }else{
            System.out.println("Invalid amount or insufficient funds");
        }
    }
}
