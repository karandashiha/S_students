package com.chnulabs.s_students;
import java.util.ArrayList;
import  java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;

    public Student(String name, String groupNumber){
        this.name=name;
        this.groupNumber=groupNumber;
    }
    public String getName(){
        return name;
    }
    public String getGroupNumber(){
        return groupNumber;
    }
    private final static ArrayList<Student>students=new ArrayList<Student>();
    ArrayList<Student> asList = (ArrayList<Student>) Arrays.asList(
            new Student("Мельник Юлія","301"),
            new Student("Коваленко Микита","301"),
            new Student("Бондаренко Анна","302"),
            new Student("Полішщук Маринна","302"),
            new Student("Мороз Богдан","308"),
            new Student("Пономаренко Ілля","308"),
            new Student("Кравчук Ольга","308"),
            new Student("Василенко Данило","309"),
            new Student("Швець Єлизавета","309")
    );
    public static ArrayList<Student>getStudents(String groupNumber){
        ArrayList<Student>stList=new ArrayList<>();
        for (Student s: students){
            if (s.getGroupNumber() .equals(groupNumber)){
                stList.add(s);
            }
        }
        return stList;

    }

}
