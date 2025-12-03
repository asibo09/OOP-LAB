package it.unibo.composition;

import java.util.Arrays;

public class Professor implements User {

    private final int id;
    private final String name;
    private final String surname;
    private final String password;
    private String[] courses;

    

    public Professor(int id, String name, String surname, String password, String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public int getId() {
        return this.id;
    }

    public String getSurname() {
        return this.surname;
    }

    public String[] getCourses() {
        return Arrays.copyOf(this.courses, this.courses.length);
    }

    public String getUsername() {
       return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return this.courses.toString();
    }
    
    public void replaceCourse(String replace, int index){
        this.courses[index]=replace;
    }

    public void replaceAllCourses(String[] newCourses){
        this.courses = Arrays.copyOf(newCourses, newCourses.length);
    }

    @Override
    public String toString() {
        return "Professor [id=" + this.id + ", name=" + this.name + ", surname=" + this.surname + ", password=" + this.password
                + ", courses=" + Arrays.toString(this.courses) + "]";
    }
    
}
