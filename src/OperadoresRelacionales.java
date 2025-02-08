/*
OPERADORES RELACIONALES
Los operadores de comparación se utilizan para comparar dos valores o variables. Esto es
importante en programación, porque nos ayuda a encontrar respuestas y tomar decisiones.

El valor de retorno de una comparación es true o false, estis valores se conocen como
valores booleanos.
*/
public class OperadoresRelacionales {
    public static void main(String[] args) {
        
        // Operador IGUAL QUE
        int x = 5;
        int y = 5;
        boolean igualQue = x == y;
        System.out.println("¿Es igual " + " que " + y + "? " +  igualQue);
        
        // Operador NO ES IGUAL QUE
        x = 6;
        y = 5;
        boolean noEsIgualQue = x != y;
        System.out.println("¿Son diferentes " + x + " y " + y + "? " + noEsIgualQue);
        
        // Operador MAYOR O MENOR QUE
        x = 2;
        y = 1;
        boolean mayorQue = x > y;
        System.out.println("¿Es mayor " + x + " que " + y + "? " + mayorQue);
        
        boolean menorQue = x < y;
        System.out.println("¿Es menor " + x + " que " + y + "? " + menorQue);
        
        // Operador MAYOR O IGUAL QUE, MENOR O IGUAL QUE
        boolean mayorOIgualQue = x >= y;
        System.out.println("¿Es mayor o igual" + x + " que " + y + "? " + mayorOIgualQue);
        
        boolean menorOIgualQue = x <= y;
        System.out.println("¿Es menor o igual" + x + " que " + y + "? " + menorOIgualQue);
        
        /*
        EJERCICIOS DE EJEMPLO:
        boolean iguales = false;
        int precio1 = 1, precio2 = 3;
        float precio1f = 1f, precio2f = 3f;
        double precio1d = 1d, precio2d = 3d;
        
        iguales = precio1 == precio1f; // true
        iguales = precio2 == precio2f; // true
        iguales = precio1f == precio1d; // true
        iguales = precio2 == 2.0 + 1.0; // true
        iguales = precio1/10 == 0.1; // false
        iguales = precio1/10f == 0.1; // false
        iguales = precio1/10d == 0.1; // true
        iguales = precio1/10 < 0.1; // true
        
        boolean iguales = false;
        float nuevo = 2/3; // = 0
        iguales = nuevo == 2/3; // true
        iguales = nuevo == 2f/3f; // false
        
        nuevo = 2f/3f; // 0.6666667
        iguales = nuevo == 2/3; // false
        iguales = nuevo == 2f/3f; // true
        iguales = nuevo = 0.6666667f; // true
        iguales = nuevo = 0.6666666f; // false
        iguales = nuevo = 0.66666666f // true;
        iguales = nuevo = 0.66666666d; // false
        iguales = nuevo = 0.6666666666666666d; // false
        iguales = 2d/3d = 0.6666666666666666d; // true
        */
    }
}
