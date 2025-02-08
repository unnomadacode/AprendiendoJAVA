/*
VALORES POR DEFECTOS VARIABLES
Si no especificamos un valor al declarar una variable, internamente JAVA asigna un valor
por defecto según el tipo

Aunque en principio no podemos operar con variables que no tienen asignada ningún
valor, hay ocasiones donde esta información puede resultar útil, como por ejemplo
cuando trabajamos con Arrays.
*/
public class ValoresPorDefectoVariables {
    public static void main(String[] args) {
        
         byte bytePorDefecto  = 0;
         short shortPorDefecto = 0;
         int intPorDefecto = 0;
         long longPorDefecto = 0;
         float floatPorDefecto = 0.0f;
         double doublePorDefecto = 0.0d;
         boolean booleanPorDefecto = false;
         char charPorDefecto = '\u0000';
         String stringPorDefecto = null;
         
    }
}
