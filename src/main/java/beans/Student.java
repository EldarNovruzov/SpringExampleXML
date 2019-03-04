/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Acer
 */
public class Student {
    private String name;
    private Teacher teacher;

    public Student() {
        System.out.println("CONSTRUCTOR CALLED");
    }

    public Student(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("User name:"+getName());
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", teacher=" + teacher + '}';
    }
    
    
    
}
