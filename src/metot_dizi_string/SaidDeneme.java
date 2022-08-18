package metot_dizi_string;

public class SaidDeneme {

    public static void main(String[] args) {


        String b = "Berk";

        int sayi = 20;

        deneme("Berk", "Gsd");
        System.out.println(b);

        boolean kontrol = asalMi(2);
        if(kontrol){
            System.out.println("Sayınız asaldır. ");
        } else {
            System.out.println("Sayınız asal değildir. ");
        }
    }


    public static boolean asalMi (int sayi){

        int sonuc = 1;
        boolean flag = true;
        for (int i = 2; i < sayi; i++) {

            sonuc = sayi % i;

            if (sonuc == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void deneme (String x){
        x = "Said";
    }
    public static void deneme (String y, String z){
        y = "Said";
    }


}
