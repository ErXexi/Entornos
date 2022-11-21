import java.util.Scanner;

public class Ej1 {
    static Scanner sc;
    /*1. Escribe un programa que pida dos números reales por teclado y muestre por
    pantalla el resultado de multiplicarlos. Implementa y utiliza la función:*/
    public static void main(String[] args) {
        double num1 = 0, num2 = 0;

        System.out.println("Introduce el primero número: ");
        num1 = Utils.validaDouble(num1);
        System.out.println("Introduce el otro número: ");
        num2 = Utils.validaDouble(num2);

        System.out.println(Utils.multiplica(num1, num2));

    }



}
