import java.util.Scanner;

public class Ud6Pr1 {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nÁlex Martín Rubio      1º DAM");
            System.out.println("\n¿Qué ejercicio quieres ejecutar?");
            System.out.println("\t 1. Ejercicio 1");
            System.out.println("\t 2. Ejercicio 2");
            System.out.println("\t 3. Ejercicio 3");
            System.out.println("\t 4. Ejercicio 4");
            System.out.println("\t 5. Ejercicio 5");
            System.out.println("\t 1. Ejercicio 6");
            System.out.println("\t 2. Ejercicio 7");
            System.out.println("\t 3. Ejercicio 8");
            System.out.println("\t 4. Ejercicio 9");
            System.out.println("\t 5. Ejercicio 10");
            System.out.println("\t 1. Ejercicio 11");
            System.out.println("\t 2. Ejercicio 12");
            System.out.println("\t 3. Ejercicio 13");
            System.out.println("\t 4. Ejercicio 14");
            System.out.println("\t 5. Ejercicio 15");
            System.out.println("\t 5. Ejercicio 16");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Ej1();
                    break;
                case 2:
                    Ej2();
                    break;
                case 3:
                    Ej3();
                    break;
                case 4:
                    Ej4();
                    break;
                case 5:
                    Ej5();
                    break;
                case 6:
                    Ej6();
                    break;
                case 7:
                    Ej7();
                    break;
                case 8:
                    Ej8();
                    break;
                case 9:
                    Ej9();
                    break;
                case 10:
                    Ej10();
                    break;
                case 11:
                    Ej11();
                    break;
                case 12:
                    Ej12();
                    break;
                case 13:
                    Ej13();
                    break;
                case 14:
                    Ej14();
                    break;
                case 15:
                    Ej15();
                    break;
                case 16:
                    Ej16();
                    break;
            }
        }while (opcion != 0) ;
    }

        public static void Ej1(){
            /*1. Escribe un programa que pida dos números reales por teclado y muestre por
            pantalla el resultado de multiplicarlos. Implementa y utiliza la función:*/
                double num1 = 0, num2 = 0;

                System.out.println("Introduce el primero número: ");
                num1 = Utils.validaDouble(num1);
                System.out.println("Introduce el otro número: ");
                num2 = Utils.validaDouble(num2);

                System.out.println(Utils.multiplica(num1, num2));
            }

        public static void Ej2(){
            /*2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres
            mayor de edad o no. Implementa y utiliza la función:*/
            int edad = 0;

            edad = Utils.validarEdad(edad);

            Utils.esMayorEdad(edad);
        }

        public static void Ej3(){
            /*3. Escribe un programa que pida dos números enteros por teclado y muestre por
            pantalla cual es el mínimo. Implementa y utiliza la función:*/
            int num1 = 0, num2 = 0;

            System.out.println("Introduce el primer número: ");
            num1 = Utils.validaInt(num1);
            System.out.println("Introduce el otro número: ");
            num2 = Utils.validaInt(num2);

            Utils.minimo(num1, num2);
        }
        public static void Ej4(){
            /*4. Escribe un programa que pida un número entero por teclado y muestre por
            pantalla si es positivo, negativo o cero. Implementa y utiliza la función:*/
            int num = 0;

            System.out.println("Introduce un número: ");
            num = Utils.validaInt(num);

            System.out.println(Utils.dimeSigno(num));
        }

        public static void Ej5(){
            /*5. Escribe un programa que pida un valor entero en millas y muestre su equivalente
            en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y
            utiliza la función:*/
            double millas = 0;
            System.out.println("Conversor de millas a kilometros");
            millas = Utils.validaDouble(millas);

            System.out.println(Utils.millas_a_kilometros(millas) + " km");
        }

        public static void Ej6(){
            /*Escribe un programa que pida cinco precios y muestre por pantalla el precio de
            venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:*/
            double precio = 0;

            System.out.println("Introduce el precio: ");
            precio = Utils.validaDouble(precio);

            System.out.println("El precio con el IVA aplicado es de: "+ Utils.precioConIVA(precio) + "€" );
        }

        public static void Ej7(){
            /*7. Escribe un programa que pida el ancho y alto de un rectángulo y muestre por
            pantalla su área y su perímetro. Implementa y utiliza las funciones:*/
            double ancho = 0, alto = 0;

            System.out.println("Introduce el ancho del rectángulo: ");
            ancho = Utils.validaDouble(ancho);
            System.out.println("Introduce la altura del rectángulo: ");
            alto = Utils.validaDouble(alto);

            System.out.println("Perímetro del rectángulo: "+ Utils.perimetroRectangulo(ancho, alto));
            System.out.println("Área del rectángulo: "+ Utils.areaRectangulo(ancho, alto));
        }

        public static void Ej8(){
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
        public static void Ej9(){
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

        public static void Ej10(){
            /*10. Realiza un programa que lea una fecha introduciendo el día, mes y año por
            separado y nos diga si la fecha es correcta o no. Supondremos que todos los
            meses tienen 30 días. Se debe crear una función donde le pasemos los datos y
            devuelva si es correcta o no.*/
            int dia = 0, mes = 0, anyo = 0;

            System.out.println("Introduce el día: ");
            dia = Utils.validaInt(dia);
            System.out.println("Introduce el mes: ");
            mes = Utils.validaInt(mes);
            System.out.println("Introduce el año: ");
            anyo = Utils.validaInt(anyo);

            Utils.esFechaCorrecta(dia, mes, anyo);
        }
        public static void Ej11(){
            /*Realiza un programa que escriba la tabla de multiplicar de un número
            introducido por teclado. Para ello implementa una función que reciba como
            parámetro un número entero y muestre por pantalla la tabla de multiplicar de
            dicho número.*/
            int n = 0;

            System.out.println("Introduce un número: ");
            n = Utils.validaInt(n);
            Utils.tablaMultiplicacion(n);
        }
        public static void Ej12(){
            /*12. Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El
            programa debe tener una función que reciba como parámetro una cantidad en
            kilómetros y nos la devuelva en millas.*/
            double km = 0;
            System.out.println("Introduce la cantidad de kilómetros que quieras convertir en millas: ");
            km = Utils.validaDouble(km);
            System.out.println("Kilómetros: " + km);
            System.out.println("Millas: " + String.format("%.4f", Utils.kilometros_a_millas(km)));
        }

        public static void Ej13(){
            /*13. Realiza un programa que calcule el porcentaje de descuento que nos han hecho
            al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el
            descuento aplicado. Se debe crear una función a la que le pasemos ambos
            valores y nos devuelva el descuento.*/
            double precioOg = 0, precioDesc = 0;
            System.out.println("Introduce el precio original: ");
            precioOg = Utils.validaDouble(precioOg);
            System.out.println("Introduce el precio con el descuento aplicado: ");
            precioDesc = Utils.validaDouble(precioDesc);

            System.out.println("Precio inicial: "+ String.format("%.2f", precioOg));
            System.out.println("Precio con el descuento aplicado: " + String.format("%.2f", precioDesc));
            System.out.println("Descuento aplicado: "+ Utils.saberDescuento(precioOg, precioDesc) + "%");
        }

        public static void Ej14(){
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
        public static void Ej15(){
            /*Escribe un programa que cree un array de tamaño 100 con los primeros 100
            números naturales. Luego muestra la suma total y la media. Implementa una
            función que calcule la suma de un array y otra que calcule la media de un array.*/

            Utils.sumaArray();
            System.out.println();
            Utils.mediaArray();
        }
        public static void Ej16(){
            /*16. Escribe un programa que cree un array del tamaño indicado por teclado y luego
            lo rellene con valores aleatorios (utiliza Math.random()). Implementa la función
            que rellena un array con valores aleatorios.*/
            int n = 0;
            System.out.println("Introduce el tamaño del array: ");
            n = Utils.validaInt(n);
            Utils.randomArray(n);
        }
    }

