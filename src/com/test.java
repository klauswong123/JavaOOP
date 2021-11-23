package com;
import student.Student;

public class test {
    public static void main(String[] args) {
        Student klaus = new Student("klaus",23,"male",1234);
        System.out.println(klaus.getName());
        System.out.println(klaus.getAge());
        System.out.println(klaus.getGender());
        System.out.println(klaus.getId());
    }
}
