package ru.kotadmi.Laba1.Pr10;

public class Ex07 {
    public static void rec(int n){
        int m=2;
        while(m<=n){
            if(n%m==0) {
                System.out.print(m + " ");
                if (m == n) {
                    return;
                }
                break;
            }
            m++;
        }
        rec(n/m);
    }
    public static void main(String []args){
        int n=10;
        rec(10);
    }
}
