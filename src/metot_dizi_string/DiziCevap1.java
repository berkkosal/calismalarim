package metot_dizi_string;

public class DiziCevap1 {

    public static void main(String[] args) {

        int sayilar[] = new int[100];
        int tumSayilarinToplami = 0;
        for (int i = 0; i < sayilar.length; i++) {

            int rastgeleSayi = (int) (Math.random() * 100);
            sayilar[i] = rastgeleSayi;
            tumSayilarinToplami += rastgeleSayi;
        }

        double ortalama = (double) tumSayilarinToplami / sayilar.length;

        int ortalamaAltindakiDegerlerinSayisi = 0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < ortalama) {
                ortalamaAltindakiDegerlerinSayisi++;

            }
        }
        System.out.println("Ortalama: " + ortalama + " ortalama altındaki değer sayısı: " + ortalamaAltindakiDegerlerinSayisi);

    }


}
