package basic.linep.task01;

import java.util.Scanner;

public class Main {
    /*Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.*/
    public static void main(String[] args) {
        System.out.println("Дано уравнение: z = ( (a – 3 ) * b / 2) + c");

        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число \"a\": ");
        double a = input.nextDouble();
        System.out.print("Введите целое число \"b\": ");
        double b = input.nextDouble();
        System.out.print("Введите целое число \"c\": ");
        double c = input.nextDouble();

        double z = ((a - 3) * b / 2) + c;

        System.out.println("Ответ равен: " + z);
    }
}