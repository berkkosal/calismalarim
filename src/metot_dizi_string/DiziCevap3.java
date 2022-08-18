package metot_dizi_string;

public class DiziCevap3 {

    public static void main(String[] args) {

        String kartTurleri[] = {"Kupa", "Karo", "Sinek", "Maça"};
        String kartNumaralari[] = {"As", "2", "3", ",4", "5", "6", "7", "8", "9", "J", "Q", "K"};

        int deste[] = new int[52];

        desteOlustur(deste);
        desteyiGoster(deste);


    }

    public static void desteyiGoster(int[] deste) {

        for (int i = 0 ; i < deste.length; i++){
            System.out.println(i);
        }
    }

    public static void desteOlustur(int[] deste) {

        for (int i = 0; i < deste.length; i++) {
            deste[i] = i;
        }

    }


}
