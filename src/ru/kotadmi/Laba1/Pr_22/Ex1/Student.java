package ru.kotadmi.Laba1.Pr_22.Ex1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
    private String name;
    private int age;
    private int iDNumber;
    private double gpa;
    private Date birthDate;

    public Student(String name, int age, int iDNumber, double gpa, Date birthDate) {
        this.name = name;
        this.age = age;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iDNumber=" + iDNumber +
                ", gpa=" + gpa +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBirthDate(String format) {
        if (format.equals("small")) {
            DateFormat dateFormat = new SimpleDateFormat("dd MM");
            return dateFormat.format(birthDate);
        }
        if (format.equals("medium")) {
            DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            return dateFormat.format(birthDate);
        }
        if (format.equals("full")) {
            DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
            return dateFormat.format(birthDate);
        }
        throw new IllegalArgumentException("Unknown argument: " + format);
    }
}

