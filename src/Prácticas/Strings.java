public class Strings {
    public static void main(String[] args){
        //Cadenas de texto, definición

        String name = "Antonio"; //forma principal y sencilla
        var surname = new String("Mesa"); //Mediante el constructor del objeto, forma compleja y redundante.

        //Concatenación
        System.out.println(name + " " + surname); //Devuelve Antonio Mesa

        //longitud texto (lenght)
        System.out.println(name.length());

        //Obtener carácter de un texto en una posición concreta. (charAt)
        System.out.println(name.charAt(0)); //Devuelve A, primera posición del texto. Los indices empiezan en 0
        System.out.println(name.charAt(4)); //Devuelve n, quinta posición del texto.
        System.out.println(name.charAt(name.length() - 1)); //Devuelve el último carácter del texto, en este caso o

        //Obtener una subcadena
        System.out.println(name.substring(2)); //Devuelve una subcadena desde el índice inicial indicado, tonio
        System.out.println(name.substring(2,6)); //Devuelve una subcadena dentro del rango indicado, en este caso desde
        //el índice 2 hasta el 6 (pero este último no lo representa), toni

        //Convertir a Mayúsculas y a Minúsculas
        System.out.println(name.toUpperCase()); //Convierte a mayúsculas sin modificar la variable name
        System.out.println(name.toLowerCase()); //Convierte a minúsculas sin modificar la variable name
        System.out.println(name); //Vemos que la variable name sigue como estaba inicialmente.

        //¿Contiene el texto..?
        System.out.println("Hola, Java".contains("Antonio")); //false
        System.out.println("Hola, Java".contains("Java")); //true
        System.out.println("Hola, Java".contains("JAVA")); //false
        System.out.println("Hola, Java".toUpperCase().contains("JAVA")); //true

        //Comparar cadenas de texto.
        System.out.println(name.equals("Antonio")); //true
        System.out.println(name.equals("antonio")); //false
        System.out.println(name.equalsIgnoreCase("ANTONIO")); //true

        // == vs equals.

        var a = "Antonio";
        var b = "Antonio";
        var c = new String("Antonio");

        System.out.println(a == b);//true //Los dos objetos han sido creados de la misma manera
        System.out.println(a == c);//false //Son dos objetos distintos, o creados de forma distinta.
        System.out.println(a.equals(c)); //true //Compara el contenido y no las referencias.

        //trim (elimina espacios en blanco al principio y al final
        System.out.println(" Hola, me llamo Antonio. ".trim());

        //replace (reemplazar)
        System.out.println("Hola, me llamo Antonio.".replace("Antonio", "Cybermito"));

        //Formatear texto con .format()
        //con .format() podemos ingresar las variables dentro del texto que vamos a representar
        //de una manera más fácil y eficaz que concatenando
        var age = 51;
        System.out.println(String.format("Hola, %s. Tienes %d años.", name, age)); //En las versiones nuevas de Java
        //el editor indica que esta forma de dar formato es redundante. Ahora se puede usar directamente con .printf
        System.out.printf("Formato directo con .printf(): Hola, %s. Tienes %d años.", name, age);
    }
}
