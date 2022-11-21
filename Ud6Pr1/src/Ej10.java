public class Ej10 {
    public static void main(String[] args) {
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
}
