/*
ESTRUCTURAS DE CONTROL ALTERNATIVAS
Se ejecuta una instrucción o conjunto de instrucciones después de evaluar
una condición.

    - Se utiliza if (SI) para especificar un bloque de código que se ejecutará, si una condición
    especificada es verdadera.

    - Se utiliza else (SINO) para especificar un bloque de código que se ejecutará, si la misma condición es falsa.

EJEMPLO EN PSEUDOCÓDIGO:

       SI condición_a_comprobar ENTONCES
                pasos_a_dar
       SINO
                pasos_alternativos
*/
public class EstructurasControlAlternativas {
    public static void main(String[] args) {
        int x = 5 - 2; // Creamos una variable que almacena un (5-2) = 3
        int resultado; // Creamos una variable resultado
        if(x == 3) { // SI x = 3
            System.out.println("El valor es correcto"); // Imprimimos en pantalla este mensaje
            resultado = 5; // y almacenamos 5 en resultado
        }
        else { // SINO
            System.out.println("El valor es incorrecto"); // Imprimimos este mensaje
            resultado = 27; // y almacenamos 27 en resultado
        }
    }
}
