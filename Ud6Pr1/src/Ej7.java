public class Ej7 {
    public static void main(String[] args) {
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
}
