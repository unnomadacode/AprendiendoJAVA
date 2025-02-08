/*
OPERADORES A NIVEL DE BITS
En JAVA se permite la manipulación bit a bit con cualquiera de los tipos enteros (byte, short,
int, long y char). 
 */
public class OperadoresANivelDeBits {
    
    public static void main(String[] args) {

        // Decalaración de varaibles
        int x = 277;
        int y = 432;
        
        // Conversión de un int a forma binaria    
        System.out.println(Integer.toBinaryString(x)); 
        System.out.println(Integer.toBinaryString(y)); 
        
        /* Operador bit a bit NEGACIÓN LÓGICA (NOT)
        El operador de negación de bits nos permite invertir el contenido de bits de
        una cadena. De tal manera que invierte los bits convirtiendo los 1 en 0 y los
        0 en 1
         */
        System.out.println(~x);
        
        /* Operador bit a bit CONJUNCIÓN LÓGICA (AND)
        El operador de bit AND lo que hace es multiplicar los bits de las dos cadenas.
        Las multiplicaciones de bits dan como resultado que 1 x 1 siempre es 1 y que 
        1 x 0 y 0 x 0 siempre da 0. El tamaño de la cadena resultado es el mismo al
        tamaño de las cadenas.
        */
        System.out.println(x&y);
        
        /* Operador bit a bit DISYUNCION LÓGICA (OR)
        En el caso del OR lo que se hace es multiplicar los bits asumiendo que 1 multiplicado
        por 1 o por 0 , siempre es 1. Mientras que la única multiplicaci;on que da 0 es 0 x 0.
        */
        System.out.println(x|y);
        
        /* Operador bit a bit DISYUNCIÓN EXCLUSIVA (XOR)
        Para el caso de OR exclusivo conocido como XOR. La multiplicación de bits será 1 para
        los casos 1 x 0 y 0 x 1. Las multiplicaciones 1 x 1 y 0 x 0 siempre darán como resultado 0.
        */
        System.out.println(x^y);
        
        /* Operador bit a bit DESPLAZAR A LA IZQUIERDA
        En el caso de desplazamiento a izquierdas, desplaza el valor_binario1 a izquierdas tantas
        veces como indique el valor_binario2. Los bits de mueven a la izquierda y se añaden tantos
        ceros como indique el valor_binario2.
        */
        x = 64;
        y = 3;
        int z = (x << y);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(z));
        /*En este ejemplo, el número x = 64 se llama valor. Son los bits del valor que cambiaremos.
        Desplazaremos los bits hacia la izquierda. En el sistema binario, el número 64 = 1000000.
        El número y = 3 se llama distancia de desplazamiento. La distancia de desplazamiento indica
        cuántos bits a la derecha/izquierda desde desplazar los bits del número x. En este ejemplo, los
        desplazamos 3 bits a la izquierda.
        */
        
        /* Operador bit a bit DESPLAZAR A LA DERECHA
        Es exactamento igual al operador de desplazamiento a izquierdas, pero con la diferencia que
        mete dígitos por la izquierda y va eliminando el último dígito.
        Si tiene que meter un 1 o tiene que meter un 0 dependerá del valor del bit del signo. Si el valor
        del bit de signo es positivo (0), lo que hace es insertar 0. Si el valor del bit de signo es negativo (1),
        lo que hace es insertar 1.
        Los ceros o unos a insertar los determinará el valor_binario2 y serán sobre el valor_binario1.
        */
        x = 64;
        y = 2;
        z = (x >> y);
        System.out.println(z);
    }
}
