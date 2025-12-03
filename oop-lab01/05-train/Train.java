class Train {
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    void build(int n1, int n2, int n3, int n4, int n5)
    {
        this.nTotSeats=n1;
        this.nFirstClassSeats=n2;
        this.nSecondClassSeats=n3;
        this.nFirstClassReservedSeats=n4;
        this.nSecondClassReservedSeats=n5;
    }

    void reserveFirstClassSeats(int a) //(consente di riservare dei posti in prima classe)
    {
        this.nFirstClassReservedSeats+=a;
    }
    void reserveSecondClassSeats(int b) //(consente di riservare dei posti in seconda classe)
    {
        this.nSecondClassReservedSeats+=b;
    }
    
    double getTotOccupancyRatio() //(percentuale globale di posti occupati)
    {
        return (this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) / this.nTotSeats *100;
    }
    double getFirstClassOccupancyRatio() //(percentuale posti occupati in prima classe)
    {
        return this.nFirstClassReservedSeats / this.nFirstClassSeats*100;
    }
    double getSecondClassOccupancyRatio()// (percentuale posti occupati in seconda classe)
    {
        return this.nSecondClassReservedSeats / this.nSecondClassSeats*100;
    }
    void deleteAllReservations()// (annulla tutte le prenotazioni)
    {
        this.nFirstClassReservedSeats=0;
        this.nSecondClassReservedSeats=0;
    }
}
