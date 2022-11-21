public class Ej9 {
    public static void main(String[] args) {
        /*9. Realiza un programa que pida introducir tres valores enteros y nos diga cuál de
        ellos es el más elevado. Impleméntalo creando únicamente una función a la que
        le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.*/
        int num1 = 0, num2 = 0, num3 = 0, mayor1 = 0, mayor2 = 0;

        System.out.println("Introduce un número: ");
        num1 = Utils.validaInt(num1);
        System.out.println("Introduce otro número: ");
        num2 = Utils.validaInt(num2);
        System.out.println("Introduce el último número: ");
        num3 = Utils.validaInt(num3);

        mayor1 = Utils.mayor(num1, num2);
        mayor2 = Utils.mayor(num2, num3);

        mayor1 = Utils.mayor(mayor1, mayor2);
        System.out.println("El número más elevado es "+ mayor1);
    }
}
