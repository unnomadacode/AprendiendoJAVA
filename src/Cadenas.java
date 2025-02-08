/*
CADENAS
*/
public class Cadenas {
    
    public static void main(String[] args) {
        
        // Declaramos una variable String
        String cadena = "Curso de programacion en JAVA.";
        System.out.println(cadena);
        
        // Método length, devuelve el total de caracteres de la cadena (Empieza desde 1)
        System.out.println("La longitud de la cadena es: " + cadena.length());
        
        // Método charAt, devuelve el carácter en el índice especificado en una cadena (Empieza desde 0)
        // En este caso elegimos el indice 0, el cuál es el primer carácter.
        char result = cadena.charAt(0);
        System.out.println("El primer caracter de la cadena es " + result);
        
        // Imprimir el último caracter de la cadena aunque esta cambie
        char result2 = cadena.charAt(cadena.length() - 1);
        System.out.println("El carácter final es: " + result2);
        
        // Método toUpperCase y toLowerCase, convertir una cadena en letras mayúsculas y minusculas
        String cadenaMayusculas = cadena.toUpperCase();
        System.out.println("La cadena en mayúsculas es: " + cadenaMayusculas);
        String cadenaMinusculas = cadena.toLowerCase();
        System.out.println("La cadena en minúsculas es: " + cadenaMinusculas);
        
        // Método substring, devuelve una subcadena de una cadena, el caracter que cierra no cuenta
        String subCadena = cadena.substring(9, 21);
        System.out.println("Ejemplo de una subcadena: " + subCadena);
        
        // Método replace, devuelve una nueva cadena remplazando el carcater elegido
        String cadenaX = cadena.replace('A'  , 'x');
        System.out.println("Reemplazo de 'A' por 'x': " + cadenaX);
        
        // Método trim, elimina los espacios en blanco de ambos lados de una cadena
        cadena = "                  Curso de programacion en JAVA       ";
        String cadenaSinEspacios = cadena.trim();
        System.out.println("La cadena: " + cadena + " sin espacios : " + cadenaSinEspacios);
        
        // Método startsWith, descubre si la cadena comienza con los caracteres especificados
        cadena = "Hola mundo!";
        System.out.println("¿La cadena comienza por 'Hol'? " + cadena.startsWith("Hol")); // True
        System.out.println("¿La cadena comienza por 'Hel'? " + cadena.startsWith("Hel")); // False
        
        // Método endWith, descubre si la cadena termina con los caracteres especificado
        System.out.println("¿La cadena termina en 'do!'? " + cadena.endsWith("do!")); // True
        System.out.println("¿La cadena termina en 'rld'? " + cadena.endsWith("rld")); // False
        
        // Método indexOf, indica la posición en que se encuentra una cierta subcadena, buscando desde el principio a partir de una posición opcional (Comienza desde la posición 0)
        System.out.println("El carácter m aparece en la posición, contando desde el principio: " + cadena.indexOf("m"));
        
        // Método lastIndexOf, indica la posición en que se encuentra una cierta subcadena, buscando desde el final a partir de una posición opcional
        System.out.println("El carácter m aparece en la posición, contando desde el final: " + cadena.lastIndexOf("m"));
    
        // Método valueOf, devuelve un String que es la representación como texto del objeto que se le indique (número, boolean, etc..)
        int convertCadena = 777;
        System.out.println("Convierte el int 777 a String: " + String.valueOf(convertCadena));
        
        // Método concat, devuelve la cadena con otra añadida al final
        cadena = "Hola";
        String cadena2 = " mundo!";
        System.out.println("Concatenación de cadenas: " + cadena.concat(cadena2));
        
        // Método equals, compara cadenas para saber si son iguales
        cadena = "Hola";
        System.out.println("cadena2 = " + cadena2);
        cadena2 = "hola";
        System.out.println("cadena2 = " + cadena2);
        String cadena3 = "Adiós";
        System.out.println("cadena3 = " + cadena3);
        System.out.println("¿Son iguales cadena y cadena2? " + cadena.equals(cadena2));
        System.out.println("¿Son iguales cadena y cadena3? " + cadena.equals(cadena3));
        
        // Método equalsIgnoreCase, compara cadenas para saber si son iguales, despreciando las diferencias entre mayúsculas y minúsculas.
        cadena = "Hola";
        System.out.println("cadena = " + cadena);
        cadena2 = "HOLA";
        System.out.println("cadena2 = " + cadena2);
        cadena3 = "Adiós";
        System.out.println("cadena3 = " + cadena3);
        System.out.println("¿Son iguales cadena y cadena2? " + cadena.equalsIgnoreCase(cadena2));
        System.out.println("¿Son iguales cadena y cadena3? " + cadena.equalsIgnoreCase(cadena3));
        
        // Método compareTo, compara una cadena con la otra (devuelve 0 si son iguales, negativo si la cadena es menor que cadena 2 y positivo si es mayor
        cadena = "Hola";
        System.out.println("cadena = " + cadena);
        cadena2 = "Hola";
        System.out.println("cadena2 = " + cadena2);
        cadena3 = "Adiós";
        System.out.println("cadena3 = " + cadena3);
        System.out.println("Compara cadena con cadena2: " + cadena.compareTo(cadena2));
        System.out.println("Compara cadena con cadena3: " + cadena.compareTo(cadena3));
        
    }
}


