public class Ej3 {
    public static void main(String[] args) {
        /*3. Escribe un programa que pida dos números enteros por teclado y muestre por
        pantalla cual es el mínimo. Implementa y utiliza la función:*/
        int num1 = 0, num2 = 0;

        System.out.println("Introduce el primer número: ");
        num1 = Utils.validaInt(num1);
        System.out.println("Introduce el otro número: ");
        num2 = Utils.validaInt(num2);

        Utils.minimo(num1, num2);
    }
}
