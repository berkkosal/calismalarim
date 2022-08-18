package metot_dizi_string;

public class DizilerinKopyalanmasi {


    public static void main(String[] args) {


        int[] anaDizi = {1, 7, 9, 10};
        int[] kopyaDizi = new int[anaDizi.length];


        //manuel kopya
        for (int i = 0; i < anaDizi.length; i++) {
            kopyaDizi[i] = anaDizi[i];
        }

        for (int x : kopyaDizi) {
            System.out.println("Kopya dizi elemanı manuel : " + x);
        }


        //arraycopy
        int kopyaDizi2[] = new int[anaDizi.length];
        System.arraycopy(anaDizi, 0, kopyaDizi2, 0, anaDizi.length);
        diziYazdir(kopyaDizi2);


        int denemeDizi[] = new int[anaDizi.length];

        denemeDizi = anaDizi;
        diziYazdir(denemeDizi);
        System.out.println("****************");
        diziYazdir(anaDizi);



        int[] tersiOlusturulmusDizi = tersiniOlustur(anaDizi);
            diziYazdir(tersiOlusturulmusDizi);

    }


    public static int[] tersiniOlustur(int[] dizi){

        int[] olusanDizi = new int [dizi.length];

        for(int i = 0, j = dizi.length - 1; i < dizi.length; i++, j--){

            olusanDizi[j] = dizi[i];

        }
         return olusanDizi;
    }

    public static void diziYazdir(int[] yazdirilacakDizi) {
        for (int x : yazdirilacakDizi) {
            System.out.println("Kopya dizi elemanı array : " + x);

        }

    }

}

