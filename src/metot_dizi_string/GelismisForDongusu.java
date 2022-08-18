package metot_dizi_string;

public class GelismisForDongusu {


    public static void main(String[] args) {


        int[] sayilar = {1, 5, 9, -73, 44};

        for (int i = 0; i < sayilar.length; i++) {

            System.out.println("Düz for döngüsü:" + sayilar[i]);
        }

        for (int oankiSayi : sayilar) {
            System.out.println("For each döngüsü:" + oankiSayi);
        }

        String isimler[] = {"berk", "ali", "mehmet"};
        String baskaSeyler[] = {"Hacı", "Faruk", "derici"};

        diziYazdir(baskaSeyler);
        diziYazdir(isimler);

    }

    public static void diziYazdir(String dizi[]){
        for (String a : dizi) {
            System.out.println("For each String: " + a);

        }

    }


}
