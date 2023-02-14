package org.safeBank;

public class WithdrawRunnable implements  Runnable{

    public static final int DELAY = 1;
    int amount;
    BankAccount account;

    int count;

    public WithdrawRunnable(int amount, int acount, int account) {
        this.amount = amount;
        this.count = acount;
        this.count = account;
    }

    public void run(){
        try{
            for (int i = 0; i <= count; i++) {
                account.withdraw(amount);
                Thread.sleep(DELAY);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
