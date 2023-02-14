package rca.ac.rw.bank.threads;

public class BankAccount {
    private double balance;
    public BankAccount(){
        balance = 0;
    }

    public void deposit(double amount){
        System.out.println("Depotisiting " + amount);
        double newBalance  = balance + amount;
        System.out.println(", New balance is " + newBalance);

        balance = newBalance;
    }

    public  void withdraw (double amount) {
        System.out.println("withdrawing" + amount);
        double newBalance  = balance - amount;
        System.out.println("new balance is " + newBalance);
        balance = newBalance;
    }
}
