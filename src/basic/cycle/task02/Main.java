package basic.cycle.task02;

import java.util.Scanner;

public class Main {
    /*
    Вычислить значения функции на отрезке [а,b] c шагом h: y=x, x>2; y=-x, x<=2
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите отрезок от a до b: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.print("Введите шаг h: ");
        double h = input.nextDouble();

        double y = 0;

        while (a <= b) {
            if (a <= 2) {
                y = -a;
                a += h;
            } else {
                y = a;
                a += h;
            }
            System.out.println("Ответ: " + y);
        }
    }
}
