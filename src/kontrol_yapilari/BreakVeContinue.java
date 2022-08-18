package kontrol_yapilari;

public class BreakVeContinue {

    public static void main(String[] args) {


        distakiFor :
        for (int i = 5; i <= 10; i++){

            ictekiFor:
            for (int a = 10; a<= 15; a++){

                System.out.println("a'nın değeri: " + a);
                if (i==8 && a==13){
                    break distakiFor;
                }
            }

            System.out.println("i'nin değeri: " + i);
        }


        for (int i = 0; i < 5; i++){

            if (i == 2) {
                continue; //return kullanımı da burada.
            }

            System.out.println("i'nin değeri: " + i);


        }



    }


}
