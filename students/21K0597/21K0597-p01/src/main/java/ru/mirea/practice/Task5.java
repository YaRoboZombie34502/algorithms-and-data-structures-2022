package ru.mirea.practice;


import java.util.Scanner;

public class Task5 {

    public static int factorial(int a){
        int k = 1;
        for (int i = 1; i < a +1 ; i++){
            k*=i;
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.print(b + "! = " +factorial(b));
    }
}
