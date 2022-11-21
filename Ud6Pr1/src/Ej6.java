public class Ej6 {
    public static void main(String[] args) {
        /*Escribe un programa que pida cinco precios y muestre por pantalla el precio de
        venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:*/
        double precio = 0;

        System.out.println("Introduce el precio: ");
        precio = Utils.validaDouble(precio);

        System.out.println("El precio con el IVA aplicado es de: "+ Utils.precioConIVA(precio) + "€" );

    }
}
