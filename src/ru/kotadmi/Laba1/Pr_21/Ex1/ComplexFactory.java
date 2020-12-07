package ru.kotadmi.Laba1.Pr_21.Ex1;

public class ComplexFactory implements ComplexAbstractFactory {
    @Override
    public Complex create(double real, double img) {
        return new Complex(real, img);
    }
}
