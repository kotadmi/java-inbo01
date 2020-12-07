package ru.kotadmi.Laba1.Pr_19.Ex2;

import java.util.List;
import ru.kotadmi.Laba1.Pr_14.Ex3.Student;

public class Students {
    public static boolean Search(List<Student> s, String name) {
        for (Student s1 : s) {
            if (s1.compareTo(name)) {
                return true;
            }
        }
        return false;
    }
}