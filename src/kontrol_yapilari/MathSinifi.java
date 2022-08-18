package kontrol_yapilari;

public class MathSinifi {

    public static void main(String[] args) {

        System.out.println("pi sayısı: " + Math.PI );
        System.out.println("e sayısı: " + Math.E) ;

        System.out.println("-5 in mutlak değeri " + Math.abs(-5));
        System.out.println("4.6 in yuvarlanmış hali " + Math.ceil(4.6));
        System.out.println("-4.3 in yuvarlanmış hali " + Math.ceil(-4.3));
        System.out.println("2nin küpü " + Math.pow(2,3));
        System.out.println("3ün karesi " + Math.pow(3,2));
        System.out.println("16'nın karekökü " + Math.sqrt(16));
        System.out.println("Hangisi daha büyük 2 mi 3 mü? " + Math.max(2,3));
        System.out.println("Hangisi daha küçük 2 mi 3 mü? " + Math.min(2,3));


        int onaKadarRastgeleSayi = (int) (Math.random() * 11);
        System.out.println("Rastgele üretilen sayı :" + onaKadarRastgeleSayi);

        int ikiyeKadarRastgeleSayi = (int) (Math.random() * 2 + 1);
        System.out.println("İkiye kadar rastgele sayı: " + ikiyeKadarRastgeleSayi);

        //eğer üretilecek rastgele sayı 0'ı içersin istiyorsak
        // Math.random() * (üst_sinir+1)

        //istemiyorsak
        // (Math.random() * üst sınır) +1


    }

}
