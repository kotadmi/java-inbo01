package ru.kotadmi.Laba1.Pr10;
import java.util.Scanner;
public class Ex16 {
    public static void rec(int max, int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                rec(n, 1);
            } 
            else if (n == max) {
                rec(max, ++count);
            } 
            else {
                rec(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    public static void main(String []args){
        rec(0,0);
    }
}
