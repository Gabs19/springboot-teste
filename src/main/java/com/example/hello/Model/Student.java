package com.example.hello.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Student {
    private  String name;
    private int id;
    public static List<Student> studentList;


    static {
        studentRepository();
    }

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    public Student(String name,int id) {
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static  void studentRepository(){
        studentList = new ArrayList<>(asList(new Student("Deku",1), new Student("Todoroki",2)));

    }
}
