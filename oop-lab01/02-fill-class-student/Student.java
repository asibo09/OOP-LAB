class Student {
    String nome= new String();
    String cognome=new String();
    int id;
    int matriculationYear;
    // È buona pratica mettere i campi in testa alla classe
    

    void build(String n, String c, int i, int m) {
        /*
         * Completare il corpo del metodo
         */
        this.nome = n;
        this.cognome = c;
        this.id = i;
        this.matriculationYear = m;
    }

    void printStudentInfo() {
        /*
         * Completare il corpo del metodo
         */
        System.out.println(this.nome);
        System.out.println(this.cognome);
        System.out.println(this.id);
        System.out.println(this.matriculationYear);
    }
}
