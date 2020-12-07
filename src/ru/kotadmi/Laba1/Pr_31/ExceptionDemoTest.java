package ru.kotadmi.Laba1.Pr_31;

import org.junit.Test;
import ru.kotadmi.Laba1.Pr_18.ExceptionDemo;

import static org.junit.Assert.*;

public class ExceptionDemoTest {

    @Test(expected = ArithmeticException.class)
    public void run() {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.run();
    }

    @Test
    public void check() {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.check();
    }
}