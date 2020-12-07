package ru.kotadmi.Laba1.Pr_13.Ex3;

import java.util.*;


public class MergeLists {
    Student[] studentsm = {
            new Student( "Archi", 1,20, 4.5),
            new Student( "Barry", 2, 19, 3.6),
            new Student("Clay", 3, 19, 5),
    };
    Student[] studentsf = {
            new Student( "Lex", 4,18, 4.5),
            new Student( "Betty", 5, 18, 3.6),
            new Student( "Kate", 6, 19, 5),
    };
    public void merge(){
        List <Student> list_of_studm = new ArrayList<Student>(Arrays.asList(studentsm));
        List <Student> list_of_studmf = new ArrayList<Student>(Arrays.asList(studentsf));
        List <Student> list_of_res = new ArrayList<Student>();
        list_of_res.addAll(list_of_studm);
        list_of_res.addAll(list_of_studmf);
        Collections.sort(list_of_res, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(list_of_res.toString());
    }
}

