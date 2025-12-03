package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;
import it.unibo.inheritance.api.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {
    
    public static final double ATM_TRANSACTION_FEE = 1;
    public static final double MANAGEMENT_FEE = 5;

    private final AccountHolder holder;
    private double balance;
    private int transactions;

    protected AbstractBankAccount(final AccountHolder accountHolder, final double balance) {
        this.holder = accountHolder;
        this.balance = balance;
        this.transactions = 0;
    }


    public final  void chargeManagementFees(final int id) {
        final double feeAmount = computeFee();
        if (checkUser(id) && isWithDrawAllowed(feeAmount)) {
            balance -= feeAmount;
            resetTransactions();
        }
    }

    public final  void deposit(final int id, final double amount) {
        this.transactionOp(id, amount);
    }

    public final  void depositFromATM(final int id, final double amount) {
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    public final double getBalance() {
        return this.balance;
    }

    protected final  void setBalance(final double balance) {
        this.balance = balance;
    }

    public final int getTransactionsCount() {
        return this.transactions;
    }

    public AccountHolder getAccountHolder() {
        return this.holder;
    }

    public final void withdraw(final int id, final double amount) {
        if (isWithDrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    public final void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    }

    protected boolean checkUser(final int id) {
        return this.holder.getUserID() == id;
    }

    protected final void incrementTransactions() {
        this.transactions++;
    }

    protected void resetTransactions() {
        this.transactions = 0;
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

    protected abstract boolean isWithDrawAllowed( double d);

    protected abstract double computeFee();
}

