package ru.kotadmi.Laba1.Pr_18;

public class ExceptionDemo implements Runnable {
    @Override
    public void run() {
        int a = 2 / 0;
    }

    public void check() {
        double a = 2d / 0;
    }
}
