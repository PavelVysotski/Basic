package basic.linep.task04;

public class Main {
    /*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа.*/
    public static void main(String[] args) {

        double x = 123.456;
        int y = (int)(x * 1000);
        System.out.println(y);

        System.out.println("обратный порядок " + y % 10 + "" + y / 10 % 10 + "" + y / 100 % 10 + y / 1000 % 10 + y / 10000 % 10 + y / 100000 % 10);
    }
}
