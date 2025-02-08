/*
CONVERSIÓN DE TIPOS (CASTING)
La conversión de tipos es cuando se asigna un valor de un tipo de datos primitivos
a otro tipo.
En Java, hay dos tipos de conversión:

    - Conversión de ensanchamiento (automática): conversión de un tipo más pequeño
    a un tipo de tamaño más grande.
    byte -> short -> char -> int -> long -> float -> double

    - Reducción de tamaño (manual): conversión de un tipo de mayor tamaño a un tipo
    de menor tamaño.
    double -> float -> long -> int -> char -> short -> byte
*/
public class Casting {
    public static void main(String[] args) {
        
        /*
        Ensanchamiento
        La conversión de ensanchamiento se realiza automáticamente al pasar un tipo
        de tamaño más pequeño a un tipo de tamaño más grande:
        */
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
        
        /*
        Reducción de la longitud
        */
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble;
        System.out.println(myDouble1);
        System.out.println(myInt1);
        
        /*
        Ejemplo real
        A continuación se muestra un ejemplo real de conversión de tipos en el que creamos
        un programa para calcular el porcentaje de la puntuación de un usuario en relación con
        la puntuación máxima del juegp.
        Utilizamos conversión de tipos para asegurarnos de que el resultado sea un valor de punto
        flotante, en lugar de un entero
        */
        
        // Establece la puntuación máxima del juego en 500
        int maxScore = 500;
        
        // Puntuación actual del usuario
        int userScore = 425;
        
        /* Calcula el porcentaje de la puntuación del usuario en relación a la puntuación máxima.
        Convierte useScore en float para asegurarse de que la división sea precisa
        */
        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("El procentaje del usuario es " + percentage);
    }
    
}
