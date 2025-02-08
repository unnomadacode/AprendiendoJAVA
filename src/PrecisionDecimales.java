/*
ALMACENAMIENTO DE DECIMALES
Para almacenar decimales (números reales) JAVA nos proporciona dos tipos
de variables, final y double. La diferencia radica en la cantidad de bytes que
utilizan para almacenar información.

    - Float: utiliza 4 bytes (simple precisión)
    - Double: utiliza 8 bytes (doble precisión)

IEEE 754 es el estándar utilizado para aritmética en coma flotante.
    - Simple precisión utiliza 32 bits de base 2, se conoce oficialmente como binary32.
        Precisión de 7 decimales.
    - Doble precisión utiliza 64 bits de base 2, se conoce oficialmente como binary64.
        Precisión de 16 decimales.

Todo ello implica que una variable de tipo double puede almacenar números más
grandes y con mayor precisión.
*/
public class PrecisionDecimales {
    public static void main(String[] args) {
        
        double a = 0.1 + 0.2;
        double b = 0.1f + 0.2f;
        float c = 0.1f + 0.2f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        double d = 10 / 3;
        System.out.println(d);
    }
        
    }
    

