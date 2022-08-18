package metot_dizi_string;

public class DiziKarmaAramaSiralama {

    public static void main(String[] args) {


        int sayilar[] = {1, 5, 6, 2, 8, 4, 0, 123, -44, 3};
        // diziYazdir(sayilar);
        diziYerDegistir(sayilar);
        System.out.println("Yer değiştirme metodu uygulandıktan sonra");
        diziYazdir(sayilar);
        selectionSort(sayilar);
        System.out.println("Sıralama metodu uygulandıktan sonra");
        diziYazdir(sayilar);


    }

    public static int binarySearch (int[] dizi, int aranacakEleman){


        int enDusukIndex = 0;
        int enYuksekIndex = dizi.length - 1;

        while (enYuksekIndex >= enDusukIndex){
            int ortaIndex = (enDusukIndex + enYuksekIndex) / 2;
            if(aranacakEleman < ortaIndex){
                enYuksekIndex = ortaIndex - 1;
            } else if (aranacakEleman == ortaIndex){
                return ortaIndex; //aranılacak elemanın bulunduğu indexi döndürür.
            } else {
                enDusukIndex = ortaIndex + 1;
            }
        }
        return -enDusukIndex -1;


    }

    public static void selectionSort(int[] dizi) {

        for (int i = 0; i < dizi.length - 1; i++) {

            //En küçük elemanın ve indexinin bulunması.
            int oAnkiEnKucukSayi = dizi[i];
            int oAnkiEnkucukElemaninIndexi = i;

            for (int j = i + 1; j < dizi.length; j++) {

                if(oAnkiEnKucukSayi > dizi[j]){
                    oAnkiEnKucukSayi = dizi[j];
                    oAnkiEnkucukElemaninIndexi = j;
                }
            }

            if (oAnkiEnkucukElemaninIndexi != i){
                dizi[oAnkiEnkucukElemaninIndexi] = dizi[i];
                dizi[i] = oAnkiEnKucukSayi;
            }


        }

    }

    public static void diziYerDegistir(int[] dizi) {

        for (int i = dizi.length - 1; i > 0; i--) {
            int rastgeleIndex = (int) (Math.random() * (i + 1));
            int geciciEleman = dizi[i];
            dizi[i] = dizi[rastgeleIndex];
            dizi[rastgeleIndex] = geciciEleman;
        }

    }

    public static void diziYazdir(int[] dizi) {

        for (int i : dizi) {
            System.out.print(i + ",");
        }

    }

}


