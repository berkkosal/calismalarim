package kontrol_yapilari;

import java.util.Scanner;

public class KullanicidanVeriAlma {

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        int kullanicininGirdigiSayi = tara.nextInt();
        System.out.println("Kullanıcının girdiği değer: " + kullanicininGirdigiSayi);

        double kullaniciDouble = tara.nextDouble();
        System.out.println("Kullanıcının girdiği değer: " + kullaniciDouble);

        String isim = tara.next();
        System.out.println("girilen isim " + isim);

        // next ve nextline'lar ardı ardına kullanıldığında karışıklık oluyor, aşağıdaki kod için konsolda değer beklenmeden atlanabiliyor.
        // bunun olmasını engellemek için yapılacak şeylerden biri yeni satır görülmeden önce aşağıdaki kodu boş çalıştırmak.
        tara.nextLine();

        String isimSoyisim = tara.nextLine();
        System.out.println("girilen isim ve soy isim: " + isimSoyisim);

        char harf = tara.next().charAt(0); // girilecek metnin ilk harfini alıyor.
        System.out.println("girilen harf: " + harf);


    }


}
