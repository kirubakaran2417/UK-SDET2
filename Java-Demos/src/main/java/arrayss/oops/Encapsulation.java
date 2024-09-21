package arrayss.oops;
//Steps to implement encapsulation
//private data members
//public getter and setter methods

class BanAccount{

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BanAccount(String accountNumber, String accountHolderName, double balance){

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositBalance(double amount){
        if(amount>0){
            balance = balance + amount;
            System.out.println("Amount deposited successfully");
        }else{
            System.out.println("Invalid amount");
        }
    }

}
public class Encapsulation {

    public static void main(String[] args) {
        BanAccount banAccount = new BanAccount("1234567890", "Dijo", 1000.0);
        banAccount.depositBalance(500.0);
        System.out.println("Balance: " + banAccount.getBalance());

        banAccount.setAccountHolderName("Dijo johnson");
        System.out.println("Account holder name: " + banAccount.getAccountHolderName());
    }

}
