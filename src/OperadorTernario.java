/*
OPERADOR TERNARIO (?)
Existe una construcción adicional, que permite comprobar si se cumple una condición y
devolver un cierto valor según si dicha condición se cumple o no.
Se puede utilizar para reemplazar varias líneas de código con una sola línea y se utiliza con
mayor frecuencia para reemplazar declaraciones if else simples.

    variable = condicion ? resultado_si_cierto : resultado_si_falso
 */
public class OperadorTernario {

    public static void main(String[] args) {

        // Ejemplo usando el if else
        int time = 20;
        if (time < 12) {
            System.out.println("Buenos días");
        } else {
            System.out.println("Buenas tardes");
        }

        // Simplificado usando el operador ternario
        int timeX = 20;
        String resultX = (timeX < 12) ? "Buenos días" : "Buenas tardes";
        System.out.println(resultX);

        // Se pueden concatenar ternarias en ambos resultados
        int timeY = 22;
        String resultY = (timeY > 12) ? (timeY > 21) ? "Buenas noches" : "Buenas tardes" : "Buenos días";
        System.out.println(resultY);

    }

}
