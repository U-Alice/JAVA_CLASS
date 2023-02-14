package rca.ac.rw.bank.threads;

import org.safeBank.BankAccount;

public class BankAccountThreadReader {
    public static void main(String[] args) {
        org.safeBank.BankAccount account =  new BankAccount();
        final  double Amount  = 100;
        final  int REPETITIONS  = 100;
        final int THREADS  = 100;

        for (int i = 0;i<=THREADS;i++){
            DepositRunnable d = new DepositRunnable(
                    account, Amount, REPETITIONS
            );
            WithdrawRunnable w = new WithdrawRunnable(
                    account, Amount , REPETITIONS
            );

            Thread dt = new Thread((Runnable) d);
            Thread wt = new Thread(w);

            dt.start();
            wt.start();
        }
    }
}