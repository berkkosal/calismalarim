package oop_giris;

public class OopGirisKavramlar {


    public static void main(String[] args) {


        Ogrenci[] tumOgrenciler = new Ogrenci[500];


        Ogrenci o1 = new Ogrenci();
        o1.isim = "Berk Koşal";
        o1.sinif = 2;
        o1.ogrenciNo = 720;

        o1.ogrenciBilgileriniYazdir();

        Ogrenci o2 = new Ogrenci(23, "Koşal Çocuk", (byte) 4, true);
        o2.ogrenciBilgileriniYazdir();

        Ogrenci ogr1 = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci(5);
        Ogrenci ogr3 = new Ogrenci(5, "ogr3");
        Ogrenci ogr4 = new Ogrenci(5, "ogr3", (byte) 5);
        Ogrenci ogr5 = new Ogrenci(5, "ogr3", (byte) 5, true);


        tumOgrenciler[0] = ogr1;
        tumOgrenciler[1] = ogr2;
        tumOgrenciler[2] = ogr3;
        tumOgrenciler[3] = ogr4;
        tumOgrenciler[4] = ogr5;
        tumOgrenciler[5] = new Ogrenci(10,"yeni",(byte)4, true);


        tumOgrenciler[2].aktif = true;
        tumOgrenciler[2].sinif = 5;
        tumOgrenciler[2].ogrenciBilgileriniYazdir();

    }


}
