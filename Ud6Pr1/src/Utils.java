import java.util.Scanner;
public class Utils {
    static Scanner sc;
    public static double validaDouble(double a){
        sc = new Scanner(System.in);
        while(!sc.hasNextDouble()){
            System.out.println("Introduce un dato válido!");
            sc.next();
        }
        a = sc.nextDouble();
        return a;
    }

    public static int validaInt(int a){
        sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.println("Introduce un dato válido!");
            sc.next();
        }
        a = sc.nextInt();
        return a;
    }

    public static double multiplica(double a, double b){
        double resultado = a * b;
        return resultado;
    }

    public static boolean esMayorEdad(int num){
        if(num>=18){
            System.out.println("Eres mayor de edad");
            return true;
        }else{
            System.out.println("Eres aun menor de edad");
            return false;
        }

    }

    public static int validarEdad(int a){
        sc = new Scanner(System.in);
        do {
            System.out.println("Introduce edad: ");
            while(!sc.hasNextInt()){
                System.out.println("-Introduce un dato válido-");
                sc.next();
            }
            a = sc.nextInt();
        }while(a < 0);
        return a;
    }

    public static int validarNum(int a){
        sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un número: ");
            while(!sc.hasNextInt()){
                System.out.println("-Introduce un dato válido-");
                sc.next();
            }
            a = sc.nextInt();
        }while(a < 0);
        return a;
    }

    public static void minimo(int a, int b){
        if(a > b){
            System.out.println(a + " > " + b);
        }else if (a < b){
            System.out.println(b + " > " + a);
        }else{
            System.out.println("Son iguales");
        }
    }

    public static int dimeSigno(int a){
        if(a > 0){
            a = 1;
        }else if(a < 0){
            a = -1;
        }else{
            a = 0;
        }
        return a;
    }

    public static double millas_a_kilometros(double millas){
        double km = 1.60934;
        millas = km * millas;
        return millas;
    }

    public static double precioConIVA(double precio){
        double IVA = 0.21;
        precio *= IVA;
        return precio;
    }

    public static double perimetroRectangulo(double ancho, double alto){
        double perimetro = 0;
        perimetro = (2*ancho) + (2*alto);
        return perimetro;
    }

    public static double areaRectangulo(double ancho, double alto){
        double area = 0;
        area = ancho * alto;
        return area;
    }

    public static int suma1aN(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int producto1aN(int n){
        int producto = 1, i = 0;
        for (i = 1; i <= n; i++) {
            producto *= i;
        }

        return producto;
    }

    public static double intermedio1aN(double n){
        n += 1 ;
        double divn = n/2;
        return divn;
    }

    public static int mayor(int x, int y){
        int mayor = 0;
        if(x >= y){
            mayor = x;
        }else{
            mayor = y;
        }
        return mayor;
    }

    public static void esFechaCorrecta(int x, int y, int z){
        boolean dia = false, mes = false, anyo = false;
        if (x <=30 && x >= 1 ){
            dia = true;
        }

        if (y>= 1 && y<=12){
            mes = true;
        }

        if (z>=0){
            anyo = true;
        }

        if (dia && mes && anyo){
            System.out.println("La fecha es correcta!");
        }else{
            System.out.println("La fecha no es correcta...");
        }
    }

    public static void tablaMultiplicacion(int x){
        int n = 0, cont = 0;
        for (int i = 0; i < 10; i++) {
            n += x;
            System.out.println("" + x + " * " + (i+1) + " = "+ n);
        }
    }

    public static double kilometros_a_millas(double km){
        double mi = 0.621371;
        km = km * mi;
        return km;
    }

    public static double saberDescuento(double x, double y){
        double desc = 0;
        y = (y*100)/x;
        desc = 100 - y;
        return desc;
    }

    public static char validaChar(String a){
        sc = new Scanner(System.in);
        a = sc.nextLine();
        char caracter = a.charAt(0);
        return caracter;
    }

    public static void piramide(char a, int b){
        for(int i = 1; i<=b; i++){
            for(int j = 1; j<=b-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void sumaArray(){
        int array[] = new int[101];
        int suma = 0;
        for (int i = 1; i < array.length ; i++) {
            array[i] = i;
            suma += i;
        }
        System.out.println("la suma de los numeros del 1 al 100 es " + suma);
    }

    public static void mediaArray(){
        double array[] = new double[101];
        double suma = 0, media = 0;
        for (int i = 1; i < array.length ; i++) {
            array[i] = i;
            suma += i;
        }
        media = suma/(array.length-1);
        System.out.println("la media de la suma de los números del 1 al 100 es " + media);
    }

    public static void randomArray(int n){
        double array[] = new double[n];
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + Math.random() * 100;
            System.out.print(String.format("%.2f", array[i]) + " ");
        }
        System.out.println("]");
    }

}
