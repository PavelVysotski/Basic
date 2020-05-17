package basic.branch.task01;

import java.util.Scanner;

public class Main {
    /*
    Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    он прямоугольным.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первый угол в градусах: ");
        int angle1 = input.nextInt();
        System.out.print("Введите второй угол в градусах: ");
        int angle2 = input.nextInt();
        System.out.println();
        int grade = 180 - angle1 - angle2;


        if (grade > 0 & grade == 90) {
            System.out.println("Такой треугольник существует и он прямоугольный.");
        } else if (grade > 0 & grade != 90) {
            System.out.println("Такой треугольник существует, но он не прямоугольный.");
        } else {
            System.out.println("Такой треугольник не существует.");
        }
    }
}
