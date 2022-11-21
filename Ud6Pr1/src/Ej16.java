public class Ej16 {
    public static void main(String[] args) {
        /*16. Escribe un programa que cree un array del tamaño indicado por teclado y luego
        lo rellene con valores aleatorios (utiliza Math.random()). Implementa la función
        que rellena un array con valores aleatorios.*/
        int n = 0;
        System.out.println("Introduce el tamaño del array: ");
        n = Utils.validaInt(n);
        Utils.randomArray(n);

    }
}
