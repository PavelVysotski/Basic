package basic.linep.task03;

import java.util.Scanner;

public class Main {
    /*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    ((𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)) ∗ 𝑡𝑔 𝑥𝑦
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число \"x\": ");
        double x = input.nextDouble();
        System.out.print("Введите целое число \"y\": ");
        double y = input.nextDouble();


        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        System.out.println("Ответ равен: " + z);
    }
}
