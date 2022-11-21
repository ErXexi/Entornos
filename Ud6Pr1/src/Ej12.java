public class Ej12 {
    public static void main(String[] args) {
        /*12. Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El
        programa debe tener una función que reciba como parámetro una cantidad en
        kilómetros y nos la devuelva en millas.*/
        double km = 0;
        System.out.println("Introduce la cantidad de kilómetros que quieras convertir en millas: ");
        km = Utils.validaDouble(km);
        System.out.println("Kilómetros: " + km);
        System.out.println("Millas: " + String.format("%.4f", Utils.kilometros_a_millas(km)));

    }
}
