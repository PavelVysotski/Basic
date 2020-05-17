package basic.linep.task06;

import java.util.Scanner;

public class Main {
    /*
    Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите координату \"x\": ");
        int x = input.nextInt();
        System.out.print("Введите координату \"y\": ");
        int y = input.nextInt();
        System.out.println();

        if (((x >= -4 && x <= 4) && (y >= -3 && y <= 0)) || ((x >= -2 && x <= 2) && (y >= 0 && y <= 4))) {
            System.out.println("Точка принаджлежит закрашенной области.");
        } else {
            System.out.println("Точка не принадлежит закрашенной области.");
        }

    }
}