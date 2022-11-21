public class Ej8 {
    public static void main(String[] args) {
        /*8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
        des 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa
        y utiliza las funciones:*/
        int n = 0;

        System.out.println("Introduce un número: ");
        n = Utils.validaInt(n);
        System.out.println("El sumatorio de 1 hasta " + n + " es igual a " + Utils.suma1aN(n));
        System.out.println("El productorio de 1 hasta "+ n + " es igual a " + Utils.producto1aN(n));
        System.out.println("El valor intermedio de 1 hasta "+ n + " es "+ Utils.intermedio1aN(n));
    }
}
