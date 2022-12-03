# Práctica 1 #
## 1. En la función1… Què fan aquestes línies de codi? ##
>String string2 = "string2";<br>
string2= string2.substring(0, string2.length()-1);<br>
string2=string2+"1";

Lo que hacen esas lineas de código es primero crear el *String* **string2**, luego crea una substring que recorta **string2** desde la posicion 0 a la posicion 6-1, es decir a la 5 con lo que **string2** seria igual a **string**, que con la siguiente linea de código lo convierte a **string1** ya que el 1 ese esta entre comillas *("")* se considera texto.

## 2. Què valen les variables string1 i string2 abans d'executar el codi de comprovació següent? ##
>if(string1 == string2 ) {<br>
System.out.println("SÓN IGUALS " + a );.<br>
}<br>
else {<br>
System.out.println("SÓN DIFERENTS");<br>
}

En estas líneas **string1** vale **string1** y **string2** vale **string1** debido a los cambios hechos en las lineas anteriores.

## 3. Per què no funciona l'operador == ? Quin operador s'ha d'usar en lloc d'aquest? ##

En su lugar habría que usar **string1.equals(string2)**

## 4. La función2() està declarada com segueix: ##
>public void funcion2() {<br>
System.out.println("--------------------");<br>
System.out.println("Aquesta és la funció 2");<br>
System.out.println("Com faig la crida perquè funcione????");
}

Está mal debido a que hay que ponerla como **public static void funcion2()** y luego llamarla poniendo **funcion2();**
