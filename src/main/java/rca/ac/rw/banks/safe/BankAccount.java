package rca.ac.rw.banks.safe;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private Lock balanceChangeLock;

    private Condition sufficientFundsCondition;

    public BankAccount(){
     balance =  0;
     balanceChangeLock =  new ReentrantLock();
     sufficientFundsCondition = balanceChangeLock.newCondition();
    }
}
