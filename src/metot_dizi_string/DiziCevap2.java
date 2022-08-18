package metot_dizi_string;

public class DiziCevap2 {
    public static void main(String[] args) {


        int[][] sayilar = new int[3][2];
        int enKucukSayi = 900, enBuyukSayi = 0;
        for (int satir = 0; satir < sayilar.length; satir++) {
            for (int sutun = 0; sutun < sayilar[satir].length; sutun++) {

                int rastgeleSayi = (int) (Math.random() * 100);
                sayilar[satir][sutun] = rastgeleSayi;
                System.out.println(satir + " .satırdaki" + sutun + " .sütunun elemanı " + sayilar[satir][sutun]);

                if (enKucukSayi > rastgeleSayi) {
                    enKucukSayi = rastgeleSayi;
                }

                if (enBuyukSayi < rastgeleSayi) {
                    enBuyukSayi = rastgeleSayi;
                }
            }

        }

        System.out.println("En küçük sayı: " + enBuyukSayi + " en küçük sayı: " + enKucukSayi);


    }
}
