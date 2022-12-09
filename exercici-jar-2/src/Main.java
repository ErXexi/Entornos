import es.iesmz.prueba.Coche;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Coche c1 = new Coche("Fiat", "Panda", "Amarillo" );
        c1.imprime();//Imprimir coche
        c1.pinta();//Pintas coche
        System.out.println("Introduce la marca del coche: ");
        c1.setMarca(sc.next());//Establecer marca del coche
        System.out.println("Introduce el modelo del coche: ");
        c1.setModelo(sc.next());//Establecer modelo del coche
        System.out.println("Introduce el color del coche: ");
        c1.setColor(sc.next());//Establecer color coche
        c1.acelera(120);//Acelera
        c1.imprime();
        c1.frena(40);//Frena
        c1.imprime();
        c1.para();//Para
        c1.imprime();
        c1.pinta();
    }
}
