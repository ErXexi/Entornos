public class Ej5 {
    public static void main(String[] args) {
        /*5. Escribe un programa que pida un valor entero en millas y muestre su equivalente
        en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y
        utiliza la función:*/
        double millas = 0;
        System.out.println("Conversor de millas a kilometros");
        millas = Utils.validaDouble(millas);

        System.out.println(Utils.millas_a_kilometros(millas) + " km");
    }
}
