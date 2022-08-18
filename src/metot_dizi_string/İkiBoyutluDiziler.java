package metot_dizi_string;

public class İkiBoyutluDiziler {

    public static void main(String[] args) {


        int[][] dizi3 = {{0, 100, 200}, {350, 0, 250}, {150, 500, 0}};
        String[] isimler = {"Emre", "Hasan", "Ali"};

        for (int satir = 0; satir < dizi3.length; satir++) {

            for (int sutun = 0; sutun < dizi3[satir].length; sutun++) {

                if (satir != sutun) {

                    int alacakHesabi = dizi3[satir][sutun] - dizi3[sutun][satir];

                    if (alacakHesabi < 0) {
                        System.out.println(isimler[satir] + " nin " + isimler[sutun] + " den alacağı " + (-alacakHesabi));

                    }


                }

            }

        }




        /*
        int ikiBoyutluDizi [][] = new int[2][3];
        ikiBoyutluDizi[0][0] = 1;
        ikiBoyutluDizi[0][1] = 2;
        ikiBoyutluDizi[0][2] = 3;
        ikiBoyutluDizi[1][0] = 4;
        ikiBoyutluDizi[1][1] = 5;
        ikiBoyutluDizi[1][2] = 6;

        //3x3'lük bir matris
        int dizi2 [][] ={{2,3,4},{4,2,5},{4,4,3,}};

        for (int satir = 0; satir < ikiBoyutluDizi.length; satir++){

            for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++){
                System.out.println(satir + ". satırın " + sutun +". sütunundaki değer: "+ ikiBoyutluDizi[satir][sutun]);
            }

        }

*/
    }

}
