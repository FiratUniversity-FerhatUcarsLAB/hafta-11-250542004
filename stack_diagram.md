### Ad Soyad: Emirhan LEVENTER
### Ogrenci No: 250542004
### Proje: Exercise 4.3 Stack Diagram + Program Ciktisi
### Tarih: 03.12.2025

# Exercise 4.3 - Stack Diyagrami

**Senaryo:** `ping` metodu programda **ilk kez** cagirildiginda bellek durumu (Call Stack).

### Stack Diyagrami (Yigin Yapisi)

En ustteki metot su an aktif olan metottur.

```text
+----------------------------+
| ping                       |  <-- Su an calisan (Aktif)
|   (Parametre yok)          |
+----------------------------+
            ^
            | cagirir
+----------------------------+
| baffle                     |  <-- Beklemede
|   (Parametre yok)          |
+----------------------------+
            ^
            | cagirir
+----------------------------+
| zoop                       |  <-- Beklemede
|   (Parametre yok)          |
+----------------------------+
            ^
            | cagirir
+----------------------------+
| main                       |  <-- Programin baslangici
|   args: [ ]                |
+----------------------------+

```

# Exercise 4.3 - Program Ciktisi

```text
No, I wug.
You wugga wug.
I wug.
```
