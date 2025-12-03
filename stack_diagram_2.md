### Ad Soyad: Emirhan LEVENTER
### Ogrenci No: 250542004
### Proje: Exercise 4.5 Flow + Stack Diagram + Çıktı
### Tarih: 03.12.2025

# Exercise 4.5 Cozumleri

## 1. Stack Diyagrami
**Soru:** `zoop` metodu **ikinci kez** cagirildiginda programin durumunu gosteren stack diyagrami.

*(En ustteki metot aktif olandir. Degisken degerleri o anki duruma gore yazilmistir.)*

```text
+------------------------------------+
| zoop                               |  <-- Aktif (Ikinci cagri)
|   fred: "breakfast"                |
|   bob:  4                          |
+------------------------------------+
                 ^
                 | cagirir
+------------------------------------+
| clink                              |  <-- Beklemede
|   fork: 4                          |
+------------------------------------+
                 ^
                 | cagirir
+------------------------------------+
| main                               |  <-- Beklemede
|   bizz: 5                          |
|   buzz: 2                          |
|   args: [ ]                        |
+------------------------------------+
```
#### Programda return komutundan onceki kisim stack diagrama eklenmez cunku return komutu kullanildiktan sonra return oncesi islemler tamamen bellekten silinmis olur bu nedenle stack diyagramina eklenmez.



## 2. Program Ciktisi
### Programin ciktisi tam olarak asagidaki gibi olur.
```text
just for
any not more 
It's breakfast 
!
```
