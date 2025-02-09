
import java.util.Scanner; // Importa la clase Scanner

public class Ejercicio1PositivoONegativo {
    public static void main(String[] args) {
        int numero;
        System.out.println("------------PROGRAMA NEGATIVO O POSITIVO--------------");
        System.out.print("Introduzca el número: ");
        Scanner numeroUser = new Scanner (System.in);
        numero = numeroUser.nextInt();
        
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo");
        } else {
            System.out.println("El número " + numero + " es negativo");
        }
    }
}
