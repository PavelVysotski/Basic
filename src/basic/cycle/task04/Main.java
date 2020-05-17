package basic.cycle.task04;

import java.math.BigInteger;

public class Main {
    /*
    Составить программу нахождения произведения квадратов первых двухсот чисел.
    */
    public static void main(String[] args) {
        BigInteger y = new BigInteger("0");
        BigInteger total = new BigInteger("1");


        for ( int i = 1; i <= 200; i++ ) {
            y = BigInteger.valueOf(i*i);
            total = total.multiply(y);
        }
        System.out.println(total);
    }
}
