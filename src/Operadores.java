/*
OPERADORES MATEMÁTICOS
Podemos utilizar las distintas operaciones matemáticas para utilizarlas en expresiones
o incluso combinarlas con variables. Pero claro, debemos tener en cuenta el tipo de
variable cuando realizamos estas operaciones. Podemos sumar entero e incluso
Strings para concatenarlas, pero no podemos multiplicar dos Strings, ni sumar booleanos
con char, ni restar Strings,etc
*/
public class Operadores {
    
    public static void main(String[] args) {
 
        // Operador de SUMA, suma dos valores
        int x = 2;
        int y = 2;
        int suma = x + y;
        System.out.println(x + " + " + y + " = " + suma);
        
        // Operador de RESTA, resta un valor de otro
        int resta = x - y;
        System.out.println(x + " - " + y + " = " + resta);
        
        // Operador de MULTIPLICACIÓN, multiplica dos valores
        int multi = x * y;
        System.out.println(x + " * " + y + " = " + multi);
        
        // Operador de DIVISIÓN, divide un valor de otro
        int div = x / y;
        System.out.println(x + " / " + y + " = " + div);
        
        // Operador de MÓDULO, devuelve el resto de la división
        int mod = x % y;
        System.out.println(x + " % " + y + " = " + mod);
        
        // Operador de INCREMENTO y DECREMENTO, incrementa o decrementa el valor de la variable en 1
        ++x;
        --y;
        System.out.println("Incremento de X es igual a = " + x);
        System.out.println("Decremento de Y es igual a = " + y);
        
        /* Importante: Los operadores de incremento y de decremento se pueden escribir antes
        o después de la variable. Así, es lo mismo estas dos líneas:
                    a++;
                    ++a;
        Pero hay una diferencia si ese valor se asigna a otra variable "al mismo tiempo"que se
        incrementa/decrementa:
                    int c = 5;
                    int b = c++;
        Guarda como resultado c = 6 y b = 5, se asigna el valor a "b" antes de incrementar "c".
        Sin embargo:
                    int  c = 5;
                    int b = ++c;
        Guarda como resultado c = 6 y b = 6, se asigna el valor a 'b' después de incrementar ç'.
        */
        
        
        /*
        OPERADORES DE ASIGNACION
        Hay varias operaciones muy habituales, que tienen una sintaxis abreviada en JAVA.
        Por ejemplo, para sumar 2 a una variable "a", la forma "normal"de conseguirlo sería
        a = a + 2; pero existe una forma abreviada en Java: a += 2;
        */
        
        int a = 10;
        
        // Ej: Operador de ASIGNACIÓN DE SUMA
        a += 5;
        System.out.println("10 + 5 = " + a);
        
    }

}
