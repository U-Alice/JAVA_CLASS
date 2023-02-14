package org.safeBank;

public class DepositRunnable implements Runnable {
    private static final int DELAY = 1;
    private BankAccount account;

    private Double amount ;
    private int count;


    public DepositRunnable(BankAccount anAccount, double anAmount, int aCount){
        account = anAccount;
        amount = anAmount;
        count  = aCount;
    }
    public void run(){
        try{
            for(int i=1 ; i<=count; i++){
                account.deposit(amount);
                Thread.sleep(DELAY);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
