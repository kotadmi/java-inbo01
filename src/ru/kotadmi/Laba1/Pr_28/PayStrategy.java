package ru.kotadmi.Laba1.Pr_28;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();

}
