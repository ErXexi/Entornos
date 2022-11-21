public class Ej4 {
    public static void main(String[] args) {
        /*4. Escribe un programa que pida un número entero por teclado y muestre por
        pantalla si es positivo, negativo o cero. Implementa y utiliza la función:*/
        int num = 0;

        System.out.println("Introduce un número: ");
        num = Utils.validaInt(num);

        System.out.println(Utils.dimeSigno(num));
    }
}
