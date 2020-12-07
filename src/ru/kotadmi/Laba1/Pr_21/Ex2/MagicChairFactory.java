package ru.kotadmi.Laba1.Pr_21.Ex2;



public class MagicChairFactory implements AbstractChairFactory {

    @Override
    public Chair create() {
        return new MagicChair();
    }

}