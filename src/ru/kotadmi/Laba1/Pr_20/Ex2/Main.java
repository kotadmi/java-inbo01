package ru.kotadmi.Laba1.Pr_20.Ex2;

public class Main<T> {

    private T[] array;

    public Main(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T value) {
        array[index] = value;
    }
}
