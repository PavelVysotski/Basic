package basic.cycle.task03;

public class Main {
    /*
    Найти сумму квадратов первых ста чисел.
    */
    public static void main(String[] args) {
        int y = 0;

        for ( int i = 1; i <= 100; i++ ) {
            y += i * i;
        }
        System.out.println("Сумма квадратов первых ста чисел равна: " + y);
    }
}
