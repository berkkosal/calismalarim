package degiskenler;

public class IlkelVeriSiniflari {


    public static void main(String[] args) {

        int integerDegiskeniminDegeri = 10;
        double doubleDegiskeniminDegeri = 20.5;

        //Tam sayı veri türlerini yazdıran ifadeler.

        System.out.println("Byte En Küçük Değeri:" + Byte.MIN_VALUE +   "  Byte En Büyük Değeri:"   +Byte.MAX_VALUE     +" Kaç Bit?:" + Byte.SIZE  );
        System.out.println("Short En Küçük Değeri:" + Short.MIN_VALUE +   "  Short En Büyük Değeri:"   +Short.MAX_VALUE     +" Kaç Bit?:" + Short.SIZE  );
        System.out.println("Integer En Küçük Değeri:" + Integer.MIN_VALUE +   "  Integer En Büyük Değeri:"   +Integer.MAX_VALUE     +" Kaç Bit?:" + Integer.SIZE  );
        System.out.println("Long En Küçük Değeri:" + Long.MIN_VALUE +   "  Long En Büyük Değeri:"   +Long.MAX_VALUE     +" Kaç Bit?:" + Long.SIZE  );

        //Ondalıklı sayı veri türlerini yazdıran ifadeler.

        System.out.println("Float En Küçük Değeri:" + Float .MIN_VALUE +   "  Float  En Büyük Değeri:"   +Float.MAX_VALUE     +" Kaç Bit?:" + Float.SIZE  );
        System.out.println("Double En Küçük Değeri:" + Double .MIN_VALUE +   "  Double  En Büyük Değeri:"   +Double.MAX_VALUE     +" Kaç Bit?:" + Double.SIZE  );

        //char
        char charDegiskenim = 'B';
        System.out.println("harf: " + charDegiskenim);


        //boolean
        boolean booleanDegiskenim = false;
        System.out.println("Booleanımın görüntüsü: " + booleanDegiskenim);
        booleanDegiskenim   = true;
        System.out.println("Booeleanım değişti mi?: " + booleanDegiskenim);
    }
}
