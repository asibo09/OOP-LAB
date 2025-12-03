package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount {

    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(int id, double balance) {
        super(id, balance);
    }

    public void chargeManagementFees(final int id){
    // Calcolo delle spese di gestione
    final double feeAmount = MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
    if (checkUser(id) && isWithdrawAllowed(feeAmount)) {
            setBalance(getBalance()-feeAmount);
            resetTransactions();
        }
    }

    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            super.withdraw(id, amount);
        }
    }

    private boolean isWithdrawAllowed(final double amount) {
        return getBalance() >= amount;
    }

    protected boolean checkUser(final int id) {
        return getid()==id;
    }

    public void deposit(final int id, final double amount){
    }

    public void depositFromATM(final int id, final double amount) {
    }


    public void withdrawFromATM(final int id, final double amount) {
    }


    protected void incrementTransactions() {
    }

    protected void resetTransactions() {
    }

}
