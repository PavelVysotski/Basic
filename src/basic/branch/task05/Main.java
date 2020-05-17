package basic.branch.task05;

import java.util.Scanner;

public class Main {
    /*
    Вычислить значение функции: x'2-3x+9, x<=3; 1/(x'3+6), x>3
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число \"x\": ");
        double x = input.nextDouble();
        double y;

        if (x <= 3) {
            y = Math.pow(x, 2) - 3 * x + 9;
            System.out.println("Ответ: " + y);
        } else {
            y = 1 / (Math.pow(x, 3) + 6);
            System.out.println("Ответ: " + y);
        }
    }
}
