package ru.kotadmi.Laba1.Pr_13.Ex2;
import ru.kotadmi.Laba1.Pr_13.Ex1.Student;
public class Main {
    public static void main(String []args) {
        Student[] students = {
                new Student(3, "Mikky", 20, new double[] {5, 4, 5}),
                new Student(2, "Blaze", 19, new double[] {2, 4, 2}),
                new Student(1, "Kelly", 19, new double[] {5, 3, 3})

        };
        SortingStudentsByGPA srt = new SortingStudentsByGPA();
        srt.sort(students);
    }
}
