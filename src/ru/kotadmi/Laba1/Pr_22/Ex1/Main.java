package ru.kotadmi.Laba1.Pr_22.Ex1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Student student = new Student("Kate", 19, 3, 4.5,
                dateFormat.parse("23-09-2020"));
        System.out.println(student.getBirthDate("full"));
    }

}