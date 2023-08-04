package capitulo2TiposConversion;

public class ConversionNumerosPrimitivos {
    public static void main(String[] args){
        // conversion implicito
        byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;

        // conversion explicita
        double doubleVar2 = 40.0d;
        float floatVar2 = (float) doubleVar2;
        long longVar2 = (long) floatVar2;
        int intVar2 = (int) longVar2;
        short shortVar2 = (short) intVar2;
        byte byteVar2 = (byte) shortVar2;

        System.out.println("var 1: " + doubleVar);
        System.out.println("var 2: " + byteVar2);
    }
}
