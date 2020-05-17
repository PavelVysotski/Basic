package basic.branch.task02;

import java.util.Scanner;

public class Main {
    /*
    Найти max{min(a, b), min(c, d)}
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите числа a, b, c, d соотвественно:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int minAB, minCD, max;

        if (a < b) {
            minAB = a;
        } else minAB = b;
        if (c < d) {
            minCD = c;
        } else minCD = d;
        if (minAB < minCD) {
            max = minCD;
        } else max = minAB;

        System.out.println("Минимальное из a,b = " + minAB +
                "\nМинимальное из c,d = " + minCD +
                "\nМаксимальное из минимальных = " + max);
    }
}
