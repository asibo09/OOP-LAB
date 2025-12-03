package it.unibo.constructors;

class Student {

    final String name;
    final String surname;
    final int id;
    final int matriculationYear;

    Student(String nome, String cognome, int id, int matr){
        this.name=nome;
        this.surname=cognome;
        this.id=id;
        this.matriculationYear=matr;
    }

    void printStudentInfo() {
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student surname: " + this.surname);
        System.out.println("Student matriculationYear: " + this.matriculationYear + "\n");
    }

    
}
