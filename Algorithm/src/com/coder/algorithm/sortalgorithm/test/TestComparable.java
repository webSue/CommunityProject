package com.coder.algorithm.bubble.test;

import com.coder.algorithm.bubble.sort.Student;

public class TestComparable {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("mike");
        student1.setAge(19);
        student2.setName("mary");
        student2.setAge(21);
        System.out.println(getMax(student1,student2));

    }
    public static Comparable getMax(Comparable a,Comparable b){
        int result = a.compareTo(b);
        return result>0 ? a : b ;
    }
}
