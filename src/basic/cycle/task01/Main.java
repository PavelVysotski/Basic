package basic.cycle.task01;

import java.util.Scanner;

public class Main {
    /*
    Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    все числа от 1 до введенного пользователем числа.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число \"x\": ");
        int x = input.nextInt();
        int sum = 0;

        for ( int i = 1; i <= x; i++ ) {
            sum += i;
        }
        System.out.println("Сумма равна: " + sum);


    }
}
