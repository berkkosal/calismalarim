package degiskenler;

public class Odev1 {

    public static void main(String[] args) {

// Çözüm 1

        String stringDegiskeni = "150";
        int integerBenim = Integer.parseInt(stringDegiskeni);
        int integerSayi2 = Integer.valueOf(stringDegiskeni);
        System.out.println("Integer Değişkeni 1 : " +integerBenim);
        System.out.println("Integer Değişkeni 2 : " +integerSayi2);
        stringDegiskeni = String.valueOf(integerBenim);
        System.out.println("string değişkeninin son değeri: "+ stringDegiskeni);

        System.out.println("******************************************");
// Çözüm 2

        int sayi1 = 5 / 3;
        float sayi2 = 5f / 3f;
        double sayi3 =5d / 3d;

        System.out.println("Sayi1: " +sayi1);
        System.out.println("Sayi2: " +sayi2);
        System.out.println("Sayi3: " +sayi3);

        System.out.println("******************************************");
// Çözüm 3

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1.0 - 0.9);

        System.out.println("******************************************");
// Çözüm 4

        int s1 = 1;
        int s2 = 2;
        double ortalama= (s1+s2) / 2;
        System.out.println("Ortalama1: " + ortalama);

        double ortalama2= (s1+s2) / 2d;
        System.out.println("Ortalama2: " + ortalama2);

    }

}
