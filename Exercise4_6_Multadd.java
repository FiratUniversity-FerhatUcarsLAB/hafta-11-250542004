/*
 * Ad Soyad: Emirhan LEVENTER
 * Ogrenci No: 250542004
 * Proje: Exercise 4.6 Multadd ve expSum
 * Tarih: 03.12.2025
 */

public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        double exponent = Math.exp(-x);
        return multadd(x, exponent, Math.sqrt(1.0 - exponent));
    }

    public static void main(String[] args) {

        System.out.println("multadd(1.0, 2.0, 3.0) -> " + multadd(1.0, 2.0, 3.0));
        System.out.println();

        double a1 = Math.cos(Math.PI / 4.0);
        double b1 = 0.5;
        double c1 = Math.sin(Math.PI / 4.0);
        double result1 = multadd(a1, b1, c1);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result1);


        double a2 = 1.0;
        double b2 = Math.log10(10.0);
        double c2 = Math.log10(20.0);
        double result2 = multadd(a2, b2, c2);
        System.out.println("log(10) + log(20)       = " + result2);
        System.out.println();

        System.out.println("expSum(1.0)             = " + expSum(1.0));
    }
}
