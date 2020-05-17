package basic.linep.task02;

import java.util.Scanner;

public class Main {
    /*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑏 + √𝑏^2 + 4𝑎𝑐)/2𝑎 − 𝑎^3*𝑐 + 𝑏^-2 */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число \"a\": ");
        double a = input.nextDouble();
        System.out.print("Введите целое число \"b\": ");
        double b = input.nextDouble();
        System.out.print("Введите целое число \"c\": ");
        double c = input.nextDouble();

        double z = (b + (Math.sqrt((Math.pow(b, 2)) + 4 * a * c))) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

        System.out.println("Ответ равен: " + z);
    }
}
