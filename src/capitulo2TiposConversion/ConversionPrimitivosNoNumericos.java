package capitulo2TiposConversion;

public class ConversionPrimitivosNoNumericos {
    public static void main(String[] args){
        char char1 = (char) 65; // A
        byte byte1 = (byte) 'A'; // 65
        short short1 = (short) 'A'; // 65
        int int1 = (int) 'A'; // 65

        char char2 = (char) 8253;// ‽
        byte byte2 = (byte) '‽'; // 61 truncado el punto del codigo dentro del rango ASCII
        short short2 = (short) '‽'; // 8253
        int int2 = (int) '‽'; // 8253

        // mostrar los resultados
        System.out.println(char1);
        System.out.println(byte1);
        System.out.println(short1);
        System.out.println(int1);
        System.out.println("**********");
        System.out.println(char2);
        System.out.println(byte2);
        System.out.println(short2);
        System.out.println(int2);
    }
}
