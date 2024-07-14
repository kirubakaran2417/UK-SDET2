package oops;

public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car("Red","swift",100);
//
//        myCar.drive();
//        myCar.stop();

        BankAccount account = new BankAccount("1227101033337", 1000);
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(1000);
        account.withdraw(500);
    }
}
