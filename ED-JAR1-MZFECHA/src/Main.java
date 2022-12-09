import java.util.Scanner;
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MZFecha mz1 = new MZFecha();
        MZFecha mz2 = new MZFecha();
        System.out.println("Introduce dia: ");
        mz1.setDia(sc.nextInt());
        System.out.println("Introduce mes: ");
        mz1.setMes(sc.nextInt());
        System.out.println("Introduce año: ");
        mz1.setAnyo(sc.nextInt());
        mz1.imprime();
        mz2.setFecha(9, 12, 2022);
        System.out.println("Dias de diferencia = " + mz1.diferenciaDias(mz2));

    }
}
