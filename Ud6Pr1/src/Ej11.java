public class Ej11 {
    public static void main(String[] args) {
        /*Realiza un programa que escriba la tabla de multiplicar de un número
        introducido por teclado. Para ello implementa una función que reciba como
        parámetro un número entero y muestre por pantalla la tabla de multiplicar de
        dicho número.*/
        int n = 0;

        System.out.println("Introduce un número: ");
        n = Utils.validaInt(n);
        Utils.tablaMultiplicacion(n);
    }
}
