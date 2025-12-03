package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class RestrictedBankAccount extends AbstractBankAccount {

    public static final double TRANSACTION_FEE = 0.1;

    protected RestrictedBankAccount(AccountHolder accountHolder, double balance) {
        super(accountHolder, balance);
    }

    protected boolean isWithDrawAllowed(double amount) {
        return getBalance() >= amount;
    }

    @Override
    protected double computeFee() {
        return MANAGEMENT_FEE + (getTransactionsCount() * TRANSACTION_FEE);
    }

}
