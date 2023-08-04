package capitulo2TiposConversion;

public class PromocionNumericaBasico {
    public static void main(String[] args){
        char char1 = 1, char2 = 2;
        short short1 = 1, short2 = 2;
        int int1 = 1, int2 = 2;
        float float1 = 1.0f, float2 = 2.0f;

        // char1 = char1 + char2; // Error: No se puede convertir de int a char
        // short1 = short1 + short2; // Error: No s epuede convertir de int a short
        int1 = char1 + char2; // char es promovido a int
        System.out.println(int1);
        int1 = short1 + short2; // short es promovido a int
        System.out.println(int1);
        int1 = char1 + short2; // ambos char y short promovidos a int
        System.out.println(int1);
        float1 = short1 + float2; // short es promovido a float
        System.out.println(float1);
        int1 = int1 + int2; // int sin promoverse
        System.out.println(int1);
    }
}
