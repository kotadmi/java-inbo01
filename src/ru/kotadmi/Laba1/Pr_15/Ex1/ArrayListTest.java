package ru.kotadmi.Laba1.Pr_15.Ex1;

import ru.kotadmi.Laba1.Pr_13.Ex1.Student;

import java.util.ArrayList;

public class ArrayListTest extends ListTest<ArrayList<Student>> {

    public ArrayListTest() {
        super(ArrayList::new);
    }

    public static void main(String[] args) {
        new ArrayListTest().run();
    }

}
