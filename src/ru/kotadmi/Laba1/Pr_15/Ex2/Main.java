package ru.kotadmi.Laba1.Pr_15.Ex2;

import ru.kotadmi.Laba1.Pr_13.Ex1.Student;
import ru.kotadmi.Laba1.Pr_15.Ex1.ListTest;

import java.util.LinkedList;

public class Main extends ListTest<LinkedList<Student>> {

    public Main() {
        super(LinkedList::new);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
