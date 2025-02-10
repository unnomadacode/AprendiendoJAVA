  /*
OPERADORES LÓGICOS
Se utilizan para determinar la lógica entre variables o valores.
Se almacena un valor booleano
*/
public class OperadoresLogicos {
    public static void main(String[] args) {
        
        // Operador NEGACIÓN LÓGICA, invierte el resultado, devuelve falso si el valor es verdadero
        int x = 5;
        System.out.println(!(x > 3)); // Devuelve false porque ! (not) se utiliza para revertir e lresultado
        
        // Operador CONJUNCIÓN LÓGICA, devuelve true si ambas afirmaciones son verdaderas
        System.out.println(x > 3 && x < 10); // Devuelve true porque 5 es mayor que 3 y 5 es menor que 10
        
        // Operador DISYUNCIÓN LÓGICA, devuelve true si una de las afirmaciones es verdadera
        System.out.println(x > 3 || x < 4); // Devuelve true porque en una de las condicones es true
        
        // Operador DISYUNCIÓN EXCLUSIVA, si ambas expresiones tiene el mismo valor devuelve un false, si tienen distinto valor devuelve un true
        
    
    // Se debe tener en cuenta que el AND (&&) siempre tiene prioridad frente al OR (||)

    /*
    EJEMPLOS
    
    */
    }
}
