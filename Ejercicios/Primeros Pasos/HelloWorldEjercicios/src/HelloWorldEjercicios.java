/*
Primeros pasos
1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola
Mundo!".
2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo
println.
3. Añade un comentario sobre lo que hace cada línea del
programa.
4. Crea un comentario en varias líneas.
5. Imprime tu edad, tu color favorito y tu ciudad.
6. Explora los diferentes System.XXX.println(); más allá de
"out".
7. Utiliza varios println para imprimir una frase.
8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando
símbolos).
9. Intenta ejecutar el programa sin el método main y observa el
error.
10.
 Intenta cambiar el nombre del archivo a uno diferente
del de la clase y compílalo. ¿Qué pasa?
*/

public class HelloWorldEjercicios {
    static void main(String[] args) {
        //1. Imprime un mensaje que diga tu nombre
        System.out.println("¡Hola, Cybermito!");

        //2. Imprime dos líneas: "Hola" y "Mundo" con un solo println
        System.out.println("Hola\nMundo");

        //3. Añade un comentario sobre lo que hace cada línea del programa
        //Ya lo estoy haciendo :)

        //4. Crea un comentario de varias líneasa
        //Hecho al inicio del proyecto

        //5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Soy Antonio, tengo 51 años,\n" +
                "mi color favorito es el indigo,\n" +
                "y soy de Granada.");

        //6. Explora los diferentes System.XXX.println(); más allá de "out"
        /*
        * Hay varios System.XXX.println()
        * */
        System.out.println("usando el método .out"); //Salida estandar
        System.err.println("usando el método .err"); //Salida colorida, como si fuera un error
        // System.in.read(); este da error y no soporta println

        //7. Usa varios println para imprimir una frase.
        System.out.print("Esto es ");
        System.out.print("una frase ");
        System.out.println("completa, pero...");
        System.out.println("se han usado print y println, para que estén en la misma línea.");

        //8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos
        System.out.println("░░░░░░░░░░░░░░▄▄▄▄▄░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░▄██████████▄▄░░░░░░░░░░\n" +
                "░░░░░░░░▄██████░█░██████▄░░░░░░░░\n" +
                "░░░░░░▄████████░█░████████░░░░░░░\n" +
                "░░░░░░█████████░█░█████████░░░░░░\n" +
                "░░░░░▄█████████░█░█████████░░░░░░\n" +
                "░░░░░██████████████████████░░░░░░\n" +
                "░░░░░██████████████████████▄░░░░░\n" +
                "░░░░▄████░░░░░▀█▄█▀░░░░░████░░░░░\n" +
                "░░░▄█████░░░░░░█▄█░░░░░░█████░░░░\n" +
                "░░▄████████▄▄▄█████▄▄▄████████░░░\n" +
                "░▄████▀███████████████████▀████░░\n" +
                "░████▀██████████░██████████▀████░\n" +
                "████▀██████████░█░█▀████████▀████\n" +
                "███▀▀░░░▀▀█▀█░█░█░█░█▀█▀▀░░░▀▀███\n" +
                "░▀░░░░░░░░░░█░█░█░█░█░░░░░░░░░░▀░\n" +
                "░░░░░░░░░░░░▀███████▀░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░▀▀█▀▀░░░░░░░░░░░░░░");

        //9. Intenta ejecutar el programa sin el método main y observa el error.
        /*
        * Indica en todo momento que no se puede ejecutar ningún comando ya que no
        * los entiende. Dice "Cannot resolve symbol 'println'
        * */

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Que pasa?
        /* Cuando cambio el nombre de la clase, desaparece el archivo de la estructura.
        * El nombre de la clase lo he cambiado desde la terminal cerrando previamente intelliJ Idea
        * */

    }
}
