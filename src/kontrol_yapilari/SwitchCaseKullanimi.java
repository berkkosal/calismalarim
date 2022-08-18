package kontrol_yapilari;

public class SwitchCaseKullanimi {

    public static void main(String[] args) {

        int haftaninKacinciGunu = 3;
        String isim = "berk";

        if(isim == "Berk"){
            System.out.println("Berk");
        } else if (isim =="Ali") {
            System.out.println("Ali");
        } else {
            System.out.println("Hiçbiri değilim");
        }



        switch(isim){

            case "Ali":
                System.out.println("Ali");
                break;
            case "Berk":
                System.out.println("Berk");
                break;

            default:
                System.out.println("Hiçbiri değilim");

        }



        char karakter = 'R';
        int sayi5 = karakter;
        System.out.println(sayi5 << 1);




    }

}
