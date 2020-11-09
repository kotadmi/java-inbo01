package ru.kotadmi.Laba1.Pr_13.Ex3;
import ru.kotadmi.Laba1.Pr_13.Ex1.Student;
import java.util.*;

class List {
    Student[] st1 = {
            new Student(3, "Mikky", 20, new double[] {5, 4, 5}),
            new Student(2, "Blaze", 19, new double[] {2, 4, 2}),
            new Student(1, "Kelly", 19, new double[] {5, 3, 3})
    };
    Student[] st2 = {
            new Student(3, "Archi", 20, new double[] {3, 4, 5}),
            new Student(2, "Barry", 19, new double[] {5, 5, 3}),
            new Student(1, "Clay", 19, new double[] {5, 4, 2})
    };
    /*public void merge(){
        List <Student> list_of_st1 = new ArrayList<Student>(Arrays.asList(st1));
        List <Student> list_of_st2 = new ArrayList<Student>(Arrays.asList(st2));
        List <Student> list_of_res = new ArrayList<Student>();

        list_of_res.addAll(list_of_st1);
        list_of_res.addAll(list_of_st2);
        Collections.sort(list_of_res, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getName().compareTo(st2.getName());
            }
        });
        System.out.println(list_of_res.toString());
    }*/
}
