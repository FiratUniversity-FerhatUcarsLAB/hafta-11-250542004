/*
 * Ad Soyad: Emirhan LEVENTER
 * Ogrenci No: 250542004
 * Proje: Exercise 4.3 Stack Diagram + Program Ciktisi
 * Tarih: 03.12.2025
 */

public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
