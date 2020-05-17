package basic.branch.task04;

import java.util.Scanner;

public class Main {
    /*
    Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    отверстие .
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер отверстия a, b: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Введите размеры кирпича x, y, z: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        if ((x <= a && y <= b) || (x <= b && y <= a)) {
            System.out.println("Кирпич пройдет через отверстие стороной XY.");
        } else if ((x <= a && z <= b) || (x <= b && z <= a)) {
            System.out.println("Кирпич пройдет через отверстие стороной XZ.");
        } else if ((y <= a && z <= b) || (y <= b && z <= a)){
            System.out.println("Кирпич пройдет через отверстие стороной YZ.");
        } else System.out.println("Кирпич не пройдет через отверстие.");
    }
}
