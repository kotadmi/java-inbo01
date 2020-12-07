package ru.kotadmi.Laba1.Pr_21.Ex2;



public class MultifunctionalChairFactory implements AbstractChairFactory {

    @Override
    public Chair create() {
        return new MultifunctionalChair();
    }

}
