package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder a1= new AccountHolder("Andrea", "Rossi", 1);
        a1.toString();

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder a2= new AccountHolder("Alex", "Bianchi", 2);
        a2.toString();

        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount s1=new SimpleBankAccount(1, 50);
        SimpleBankAccount s2= new SimpleBankAccount(2, 10000);

        // 4) Effettuare una serie di depositi e prelievi
        s1.deposit(1, 90.5);
        s1.depositFromATM(1, 12.9);
        s1.withdraw(1, 54.7);
        s1.withdrawFromATM(1, 76.2);

        s2.deposit(2, 300);
        s2.depositFromATM(2, 55);
        s2.withdraw(2, 150.5);
        s2.withdrawFromATM(2, 15.5);

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println(s1.getBalance());
        System.out.println(s2.getBalance());

        // 6) Provare a prelevare fornendo un id utente sbagliato
        s1.withdraw(2, 55);
        s2.withdrawFromATM(1, 356.90);

        // 7) Controllare nuovamente l'ammontare
        System.out.println(s1.getBalance());
        System.out.println(s2.getBalance());

    }
}
