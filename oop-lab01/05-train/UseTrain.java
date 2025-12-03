class UseTrain {
    public static void main(String[] args) {
        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         *
         *
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere per i parametri
         *
         * 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente
         *
         * 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe.
         *
         * 4) Cancellare tutte le prenotazioni
         *
         * 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
         * occupazione
         */


        Train t1= new Train();
        t1.build(250, 50, 200, 15, 50);
        t1.reserveFirstClassSeats(32);
        t1.reserveSecondClassSeats(123);
        t1.getTotOccupancyRatio();
        t1.getFirstClassOccupancyRatio();
        t1.getSecondClassOccupancyRatio();
        t1.deleteAllReservations();

        Train t2=new Train();
        t2.build(500, 100, 400, 76, 387);
        t2.reserveFirstClassSeats(12);
        t2.reserveSecondClassSeats(19);
        t2.getTotOccupancyRatio();
        t2.getFirstClassOccupancyRatio();
        t2.getSecondClassOccupancyRatio();
        t2.deleteAllReservations();



    }
}
