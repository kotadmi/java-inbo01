package ru.kotadmi.Laba1.Pr_26.Ex1;

public interface Queue<E> {
    void enqueue(E element);
    E element();
    E dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
