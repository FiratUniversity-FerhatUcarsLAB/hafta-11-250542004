/*
 * Ad Soyad: Emirhan LEVENTER
 * Ogrenci No: 250542004
 * Proje: Exercise 4.4 Derleyici Deneyleri
 * Tarih: 03.12.2025
 */


public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // CEVAP 1:
        // Kod sorunsuz derlenir ve calisir. Derleyici herhangi bir hata veya uyari vermez.
        // Metot calisir, 42 degerini dondurur ancak bu deger bir degiskene
        // atanmadigi icin bosa gider (discarded). Java'da donus degerini kullanmak zorunlu degildir.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // CEVAP 2:
        // Hata ciktisi olarak "java: 'void' type not allowed here" hatasi vermektedir.
        // Yani print icerisinde bu tip (void) bir metot cagiralamaz diyor.
        // Bu metot eger return degeri veren bir metot olmus olsaydi, o zaman return degeri
        // olarak ne cikiyorsa onu yazdirirdi ama bu sekildeyken bir derleme hatasi
        // meydana gelir ve kodumuz calismaz.

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
