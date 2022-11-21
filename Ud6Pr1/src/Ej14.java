public class Ej14 {
    public static void main(String[] args) {
        /*14. Escribe una función que muestre por pantalla un triángulo como el del ejemplo.
        Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de
        líneas del triángulo.*/
        String linea = "";
        int numLineas = 0;
        char caracter;

        System.out.println("Introduce el carácter: ");
        caracter = Utils.validaChar(linea);
        System.out.println("Introduce cantidad de líneas de la pirámide: ");
        numLineas = Utils.validaInt(numLineas);

        Utils.piramide(caracter, numLineas);

    }
}
