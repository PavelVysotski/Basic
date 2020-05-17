package basic.cycle.task06;

import java.util.Scanner;

public class Main {
    /*
    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите диапазон от m до n");
        int m = input.nextInt();
        int n = input.nextInt();

        for ( int j = m; j <= n; j++ ) {
            System.out.print("Число " + j + " делится на: ");
            for ( int i = 2; i <= n; i++ ) {
                if (j % i == 0) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();

        }
    }
}
