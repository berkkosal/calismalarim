package metot_dizi_string;

public class MetotlaraDiziGondermek {

    public static void main(String[] args) {

/*
        int[] sayilar = {1, 2, 3};
        diziGoster(sayilar);

        System.out.println("metottan önceki 0. index " + sayilar[0]);
        degeriBirArttir(sayilar[0]);
        System.out.println("metottan sonraki 0. index " + sayilar[0]);

        System.out.println("Dizi değerlerini artırmadan önce ");
        diziGoster(sayilar);
        diziDegeriniArttir(sayilar);
        System.out.println("Dizi değerlerini artırmadan sonra ");
        diziGoster(sayilar);

        */


        toplaminiBul(1, 2, 3, 4, 5);

    }

    public static void toplaminiBul(int... parametreListesi) {
        int toplam = 0;

        for (int oankiSayi : parametreListesi) {
            toplam += oankiSayi;
        }

        System.out.println("Parametrelerin toplamı: " + toplam);
        System.out.println("Parametre listesinin ilk elemanı: " + parametreListesi[0]);
    }

    public static void diziDegeriniArttir(int[] sayilar) {

        sayilar[0]++;
        sayilar[1]++;
        sayilar[2]++;
    }

    public static void degeriBirArttir(int i) {
        i++;
        System.out.println("metotun içindeki sayı: " + i);
    }


    public static void diziGoster(int[] dizi) {
        for (int i : dizi) {
            System.out.println("Elemanlar " + i);
        }

    }


}
