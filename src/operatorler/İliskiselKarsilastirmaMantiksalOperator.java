package operatorler;

public class İliskiselKarsilastirmaMantiksalOperator {

    public static void main(String[] args) {

        int sayi1 = 12;
        int sayi2 = 11;

        System.out.println("Sayı 1 eşit mi sayı 2: " + (sayi1 == sayi2));
        System.out.println("Sayı 1 küçük mü sayı 2: " + (sayi1 < sayi2));
        System.out.println("Sayı 1 büyük mü sayı 2: " + (sayi1 > sayi2));
        System.out.println("Sayı 1 küçük eşit mi sayı 2: " + (sayi1 <= sayi2));
        System.out.println("Sayı 1 büyük eşit mi sayı 2: " + (sayi1 >= sayi2));
        System.out.println("Sayı 1 eşit değil mi sayı 2: " + (sayi1 != sayi2));

        if(sayi1 > sayi2) {

            System.out.println("s1 s2'den büyüktür");
        }else {
            System.out.println("s1 s2'den küçüktür");
        }

        boolean deger1 = true;
        boolean deger2 = false;

        System.out.println("And durumu: " + (deger1 && deger2));
        System.out.println("Or durumu:  " + (deger1 || deger2));

        int benimYasim = 31;
        int onunYasi = 25;

        if (benimYasim < 25 || onunYasi >= 25){

            System.out.println("birinci ifade çalıştı");
        }

        if (benimYasim <=30 && onunYasi != (benimYasim)){
            System.out.println("ikinci ifade çalıştı");


        } else {
            System.out.println("else çalıştı");
        }


    }

}
