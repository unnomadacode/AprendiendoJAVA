
/*
SENTENCIAS SWITCH
En lugar de escribir muchas declaraciones if...else, es posible utilizar la declaración switch.
Switch selecciona uno de los muchos bloques de código que se ejecutarán.
        - La expresión switch se evalúa una vez.
        - El valor de la expresión de compara con los valores de cada case.
        - Si hay una coincidencia, se ejecuta el bloque de código asociado.
        - Cada caso se finaliza con un break.
        - La palabra Default especifica un código que se ejecutará si no se cumple ningun case.
        - Se pueden ejecutar las mismas sentencias en varios casos, simplemente eliminando la orden break
        de algunos de ellos.
 */
public class CondicionesSwitch {

    public static void main(String[] args) {

        int y = 3;
        switch (y * 10) {
            case 30:
                System.out.println("El valor de y es 3");
                break;
            case 40:
                System.out.println("El valor de y es 4");
                System.out.println("Instrucción adicional");
                break;
            case 50:
                System.out.println("El valor de y es 5");
                break;
            case 60:
                System.out.println("El valor de y es 6");
                break;
        }
        int e = 4;
        switch (e) {
            case 1:
            case 2:
            case 3:
                System.out.println("El valor de e está entre 1 y 3");
                break;
            case 4:
            case 5:
                System.out.println("El valor de e es 4 o 5 ");
                break;
            case 6:
                System.out.println("El valor de e es 6");
                e = 10;
                System.out.println("Operaciones auxiliares completadas");
                break;
            default:
                System.out.println("El valor de e no está entre 1 y 6");

        }
    }
}
