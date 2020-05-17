package basic.cycle.task07;

import java.util.Scanner;

public class Main {
    /*
    Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите два числа для сравнения: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c, d;

        while (a > 0) {
            d = a % 10;
            a = a / 10;
            c = b;
            while (c > 0) {
                if (c % 10 == d) {
                    System.out.print(d + ", ");
                    break;
                }
                c = c / 10;
            }
        }
    }
}
