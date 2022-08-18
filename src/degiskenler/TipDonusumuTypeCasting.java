package degiskenler;

public class TipDonusumuTypeCasting {


    public static void main(String[] args) {

        int sayi1 = 10;
        double noktaliSayi = 1520.25;

/*
        noktaliSayi = sayi1;
        System.out.println(noktaliSayi);
*/

        sayi1 = (int) noktaliSayi;
        System.out.println("Sayı değeri: " + sayi1);

    }

}
