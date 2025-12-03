package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student s1 = new Student(1, "Pietro", "Siboni", "Futbol", 2023);
        Student s2 = new Student(2, "Ale", "Siboni", "boh", 2026);
        Student s3 = new Student(3, "Marco", "Fabbri", "fisio", 2010);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        // 2)Creare 2 docenti a piacere
        Professor p1= new Professor(1, "Vittorio", "Ghini", "systemcalls", new String []{" SISOP "});
        Professor p2=new Professor(2, "Mirko", "Viroli", "Object", new String []{" OOP "," PPS ","PC"});

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom r1= new ExamRoom(100, "OOP", false, false);
        ExamRoom r2= new ExamRoom(80, "SISOP", false, false);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam e1= new Exam(1, 10, 0, "OOP", r1);
        Exam e2=new Exam(2, 2, 0, "SISOP", r2);
        // 5) Iscrivere tutti e 3 gli studenti agli esami
        e1.registerStudent(s1);
        e1.registerStudent(s2);
        e1.registerStudent(s3);

        e2.registerStudent(s1);
        e2.registerStudent(s2);
        e2.registerStudent(s3);
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
