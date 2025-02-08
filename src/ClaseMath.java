/*
CLASE MATH
En JAVA existe una clase que nos facilita la realización de funciones matemáticas complejas,
dicha clase se llama Math. Para utilizar las funciones de dicha clase debemos escribir la palabra
Math, luego un punto, y finalmente la función que queramos utilizar.
*/
public class ClaseMath {
    public static void main(String[] args) {
        
        /*
        MÉTODO ROUND
        Redondea un número al entero más cercano
        */
        double x = 0.60;
        System.out.println(Math.round(x));
        
        /*
        MÉTODO FLOOR
        Redondea un número hacia abajo hasta el entero más cercano
        */
        x = 0.90;
        System.out.println(Math.floor(x));
        
        /*
        MÉTODO CEIL
        Redondea un número hacia arriba hasta el entero más cercano
        */
        x = 0.10;
        System.out.println(Math.ceil(x));
        
        /*
        MÉTODO SQRT
        Devuelve la raíz cuadrada de un número
        */
        x = 9;
        System.out.println(Math.sqrt(x));
        
        /*
        MÉTODO POW
        Devuelve un número elevado a otro
        */
        x = 2;
        int y = 2;
        System.out.println(Math.pow(x, y));
        
        /*
        MÉTODO ABS
        Devuelve el valor absoluto de un número
        */
        x = -4;
        System.out.println(Math.abs(x));
        
        /*
        MÉTODO LOG
        Devuelve el logaritmo natural de un número
        */
        x = 6;
        System.out.println(Math.log(x));
        
        /*
        MÉTODO RANDOM
        Devuelve un número aleatorio entre 0 y 1
        */
        x = Math.random();
        System.out.println(x);
        
        /*
        MÉTODO SIN
        Devuelve el seno de un ángulo en radianes
        */
        double angulo = 45;
        double seno = Math.sin(angulo);
        System.out.println(seno);
        
        /*
        MÉTODO COS
        Devuelve el coseno de un ángulo en radianes
        */
        double coseno = Math.cos(angulo);
        System.out.println(coseno);
        
        /*
        MÉTODO TAN
        Devuelve la tangente de un ángulo en radianes
        */
        double tangente = Math.tan(angulo);
        System.out.println(tangente);
        
        /*
        MÉTODO ASIN
        Devuelve el ángulo a partir del seno
        */
        angulo = Math.asin(seno);
        System.out.println(angulo);
        
        /*
        MÉTODO ACOS
        Devuelve el ángulo a partir del coseno
        */
        angulo = Math.acos(coseno);
        System.out.println(angulo);
        
        /*
        MÉTODO ATAN
        Devuelve el ángulo a partir de la tangente
        */        
        angulo = Math.atan(tangente);
        System.out.println(angulo);
        
        /*
        CONSTANTES
        */
        
        // PI: Devuelve el número PI (double)
        System.out.println(Math.PI);
        
        // E: Devuelve el número E (double)
        System.out.println(Math.E);
        
        /*
        EJEMPLOS
        */
        
        double radio = (int)(Math.random() * 10 + 1); // radio es un aleatorio entre 1 y 10
        int n = 5, m = 5;
        double resultado = Math.pow(n, m);
        double raiz = Math.sqrt(resultado);
        double area = Math.PI * radio* radio;
                
        System.out.println("\n" + n + " elevado a " + m + " = " + (int)resultado);
        System.out.println("La raíz cuadrada de " + (int)resultado + " = " + raiz);
        System.out.println("El area de un círculo de radio " + radio + " es: " + area);
        System.out.println("El área redondeada es: " + (int)Math.round(area));
        System.out.println("El área por arriba es: " + Math.ceil(area));
        System.out.println("El área por abajo: " + Math.floor(area));
        System.out.println("La raíz cuadrada de -2 es un Nan: " + Double.isNaN(Math.sqrt(-2)));
        System.out.println("1.0/0.0 = Infinity: " + (Double.isInfinite(1.0/0.0)) + "\n");
    }
}
