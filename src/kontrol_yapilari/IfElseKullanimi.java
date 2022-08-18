package kontrol_yapilari;

public class IfElseKullanimi {

    public static void main(String[] args) {

        int benimYasim = 29;
        int onunYasi = 30;

        if (benimYasim < onunYasi) {
            System.out.println("Yaşım küçüktür. ");
        } else if (benimYasim > onunYasi) {

            System.out.println("Yaşım büyüktür. ");
        } else {
            System.out.println("Yaşımız eşittir. ");
        }
        int sayi = 4;
        if (sayi > 5){
            System.out.println("sayı 5'ten büyük. ");

        }


        int sayi1 = 5;
        int sayi2 = 5;
        System.out.println(sayi1 <= sayi2);
        if (sayi1 <= sayi2) {
            System.out.println("Yaşım küçüktür. ");

        }  if (sayi1 > sayi2) {
            System.out.println("Yaşım büyüktür. ");

        } else {
            System.out.println("Yaşımız eşittir. ");
        }


        boolean Berk = false;

        if (!Berk){
            System.out.println("Berk doğru");


        }






    }



}
