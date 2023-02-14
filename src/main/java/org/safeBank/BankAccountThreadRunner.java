package org.safeBank;

import rca.ac.rw.bank.threads.DepositRunnable;
import rca.ac.rw.bank.threads.WithdrawRunnable;

public class BankAccountThreadRunner {
    public static void main(String[] args){
        BankAccount  account = new BankAccount();
        final double amount =  100;
        final int repetitions = 100;
        final int threads = 100;
        for (int i = 0; i <= threads; i++) {
            DepositRunnable d  = new DepositRunnable(account, amount, repetitions);
            WithdrawRunnable w =  new WithdrawRunnable(account, amount, repetitions);

            Thread dt = new Thread(d);
            Thread wt = new Thread(w);
            dt.start();
            wt.start();

        }
    }
}
