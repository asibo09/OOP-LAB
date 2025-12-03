package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {


    public ClassicBankAccount(final AccountHolder accountHolder, final double balance) {
        super(accountHolder, balance);
    }

    protected boolean isWithDrawAllowed(double d) {
        return true;
    }

    protected double computeFee() {
        
        return MANAGEMENT_FEE;
    }

    
}
