package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private final int id;
    private final int maxStudents;
    private int registeredStudents;
    private final String courseName;
    private ExamRoom room;
    private  Student[] students;
    
    public Exam(int id, int maxStudents, int registeredStudents, String courseName, ExamRoom room) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = registeredStudents;
        this.courseName = courseName;
        this.room = room;
    }

    public int getId() {
        return this.id;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public int getRegisteredStudents() {
        return this.registeredStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public ExamRoom getRoom() {
        return this.room;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(this.students, this.students.length);
    }

    public void registerStudent(Student student){
        if (maxStudents > registeredStudents) {
            Student[] newStudents=Arrays.copyOf(this.students, this.students.length+1);
            newStudents[this.students.length+1]=student;
            this.students=Arrays.copyOf(newStudents, newStudents.length);
        }    
    }

    @Override
    public String toString() {
        return "Exam [id=" + this.id + ", maxStudents=" + this.maxStudents + ", registeredStudents=" + this.registeredStudents
                + ", courseName=" + this.courseName + ", room=" + this.room + ", students=" + Arrays.toString(this.students) + "]";
    }

    

    

    
}
