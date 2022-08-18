package operatorler;

public class AritmetikAtama {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;
        int sonuc = 0;

        sayi1 %= sayi1 % 3;
        System.out.println("Sonuc: " + sayi1);

        double ondalikliSayi =  6.50;
        double sonuc2 = 0;
        sonuc2++;
        ondalikliSayi *= sonuc2;

        // sonuc2 = 1   ondaliklisayi = OS * sonuc2
        System.out.println("Sonuç2: " + sonuc2);

        int s1 = 10;
        int s2 = 6;
        s1++;
        --s2;
        s1 *= s2;

        System.out.println("S1'in son değeri: " + s1);
        System.out.println("S2'in son değeri: " + s2);

        // s1 = 55,  s2 = 5


    }

}
