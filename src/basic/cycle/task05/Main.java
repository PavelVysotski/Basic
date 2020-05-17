package basic.cycle.task05;

import java.util.Scanner;

public class Main {
    /*
    Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите диапазон соответствия от 0 до 65535: ");
        int a = input.nextInt();
        int b = input.nextInt();

        for ( int i = a; i <= b; i++ ) {
            char ch = (char) i;
            System.out.print(i + "-" + ch + " ");
        }

    }
}
