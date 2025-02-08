
/*
    SECUENCIAS DE ESCAPE
 */

public class Escapes {

    public static void main(String[] args) {

        // \" Comillas. Permite mostrar por pantalla el carácter de las comillas dobles
        String cadena = "Java dice, \"Hola Mundo!\"";
        System.out.println(cadena);
        
        // \' Comilla simple. Permite mostrar por pantalla el carácter de la comilla simple
        cadena = "Java dice, \'Hola Mundo!\'";
        System.out.println(cadena);

        // \t Tabulador horizontal. Mueve el cursor hacia adelante a una distancia determinada por el tabulador.
        String cadena1 = "\temail";
        System.out.println(cadena1);
        
        // \b Retroceso. Mueve el cursor un carácter atrás en la línea actual.
        System.out.println("2 + 2 = 5" + "\b" + "4");
        
        // \n Salto de línea. Sitúa el cursor al principio de la línea siguiente.
        System.out.print("La próxima salida estará en una nueva línea\n");
        System.out.println("La próxima salida estará en una nueva línea");
        
        // \r Ir al principio de la línea. Mueve el cursor al principio de la línea actual.
        System.out.print("Texto a reescribir");
        System.out.print("\r");
        System.out.println("Nuevo texto");
        
        // \f Nueva página. Mueve el cursor al principio de la siguiente página
        
        // \\ Barra inversa
        System.out.println("Es un String de Java: \"C:\\ProgramFiles\\Java\\jdk1.7.0\\bin\"");
        
        // \\u Carácter Unicode, representa un dígito hexadecimal del carácter Unicode
        System.out.println("I \u2661 Spain");

    }
}
