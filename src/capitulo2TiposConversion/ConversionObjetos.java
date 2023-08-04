package capitulo2TiposConversion;

public class ConversionObjetos {
    public static void main(String[] args){
        // Float floatVar = new Float(42.0f); // Deprecado
        float floatvar = 42.0f;
        Number n = floatvar; // implicito (float implementa Numbers)
        Float floatVar2 = (Float) n; // explicito
        //Double doubleVar = (Double) n; // Throws exception (El objeto no es Double)

        System.out.println(floatvar);
        System.out.println(n);
        System.out.println(floatVar2);
       // System.out.println(doubleVar);
    }
}
