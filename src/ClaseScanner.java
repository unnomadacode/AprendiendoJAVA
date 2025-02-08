/*
CLASE SCANNER (Entrada de datos)
En JAVA, tenemos la posibilidad de acceder a la entrada de teclado con la
clase Scanner.
*/

import java.util.Scanner; // Importa la clase Scanner

public class ClaseScanner {
    public static void main(String[] args) {
        
        
       /*
        .next() y .nextLine()
        Con el método ".next()" obtenemos los datos hasta llegar a un
        espacio en blanco. Sin embargo, el método "nextLine()" obtenemos los datos
        hasta encontrar un salto de línea.
        */
        String nombre;
        System.out.print("Introduzca su nombre (una palabra): ");
        Scanner nombreUser = new Scanner(System.in); // Creamos un Scanner
        nombre = nombreUser.next(); // Leemos hasta llegar a un espacio en blanco
        System.out.println("Hola, " + nombre);
        
        String nombreApellidos;
        System.out.print("Introduzca su nombre y apellidos: ");
        Scanner nombreApellidosUser = new Scanner(System.in); // Creamos un Scanner
        nombreApellidos = nombreApellidosUser.nextLine();
        System.out.println("Hola, " + nombreApellidos);
        
        /*
        .nextInt() , nextFloat() , .nextDouble()
        Utilizados para leer números
        */
        int edad;
        System.out.print("Introduzca su edad: ");
        Scanner edadUser = new Scanner(System.in);
        edad = edadUser.nextInt();
        System.out.println("Tu edad es: " + edad);
        
        /*
        Apunte:
        El método nextLine() extrae del buffer de entrada todos los caracteres hasta llegar a
        un intro del buffer. En este caso se asigna una cadena vacía a la varaible nombre y
        limpia el intro. Esto provoca que el programa no funcione correctamente, ya que no
        se detiene para que se introduzca el nombre.
        Ejemplo:
        */
        Scanner entrada = new Scanner(System.in);
        String name;
        double radio;
        int n;
        System.out.print("Introduzca un número entero: ");
        n = entrada.nextInt();
        // entrada.nextLine();                Con este nextLine lo solucionariamos
        System.out.println("El cuadrado es: " + Math.pow(n, 2));
        System.out.print("Introduzca su nombre: ");
        name = entrada.nextLine(); // Guardamos una cadena vacía en nombre
        System.out.println("Hola, " + name + "!!");
    }
}
