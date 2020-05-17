package basic.branch.task03;

import java.util.Scanner;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
*/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите координаты трех точек x1, y1, x2, y2, x3, y3 соотвественно:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        if ((y1 / x1 == y2 / x2) && (y1 / x1 == y3 / x3) && (y2 / x2 == y3 / x3)) {
            System.out.println("Все точки лежат на одной прямой.");
        } else System.out.println("Точки не лежат на одной прямой.");
    }
}
