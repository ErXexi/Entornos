public class Ej13 {
    public static void main(String[] args) {
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
}
