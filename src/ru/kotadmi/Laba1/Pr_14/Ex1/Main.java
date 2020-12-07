package ru.kotadmi.Laba1.Pr_14.Ex1;

public class Main {
    public static void main(String []args){
        Search src = new Search();
        Student[] students = {
                new Student( "Archi", 1,20, 4.5),
                new Student( "Barry", 2, 19, 3.6),
                new Student("Clay", 3, 19, 5),
        };
        System.out.println(src.search(students, "Иванов").toString()+"\n");
        students = src.sort(students);
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
