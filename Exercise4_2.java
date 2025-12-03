/*
 * Ad Soyad: Emirhan LEVENTER
 * Ogrenci No: 250542004
 * Proje: Exercize 4.2 Kod Sirasi Yazma
 * Tarih: 03.12.2025
 */

public class Exercise4_2 {

    // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

        public static void main(String[] args) {
        zippo("rattle", 13);                                // 1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);                          // 6
        zippo("ping", -5);                                  // 7
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {                                     // 2, 8
            System.out.println(quince + " zoop");           // 9
        } else {                                            // 3
            System.out.println("ik");                       // 4
            baffle(quince);                                 // 5
            System.out.println("boo-wa-ha-ha");             // 10
        }
    }
}
