package ru.mirea.practice;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("Всего аргументов: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + "-й: " + args[i]);
        }
    }
}
