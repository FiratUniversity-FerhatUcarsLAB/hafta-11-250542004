/*
 * Ad Soyad: Emirhan LEVENTER
 * Ogrenci No: 250542004
 * Proje: Exersize 4.1 Tarih Yazdirma
 * Tarih: 03.12.2025
 */

import java.util.Scanner;

public class Exersize4_1 {

    public static void printAmerican(String day, int date , String month, int year){
        System.out.println("Amerikan Sistemine Gore Tarih Yazdiriliyor :");
        System.out.printf("%s, %s %d, %d \n", day, month, date, year);
    }

    public static void printEuropian(String day, int date , String month, int year){
        System.out.println("Avrupa Sistemine Gore Tarih Yazdiriliyor :");
        System.out.printf("%d %s %d, %s", date, month, year, day);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Gun Giriniz : ");
        String day = scan.next();
        System.out.print("Ay Giriniz : ");
        String month = scan.next();
        System.out.print("Kacinci Gundeyiz: ");
        int date = scan.nextInt();
        System.out.print("Yil Giriniz : ");
        int year = scan.nextInt();

        printAmerican(day,date,month,year);
        System.out.println();
        printEuropian(day,date,month,year);

    }
}
