package Practicas;

public class Estructuras {

    static void main(String[] args){
        // Declaración / Creación de Arrays
        // Con el constructor de arrays
        int[] numbers = new int[3]; // Nuevo array vacío de tamaño 3 elementos
        System.out.println(numbers); // Devuelve una dirección de memoria o un objeto.

        // Declarando el contenido de cada elemento
        String[] names = {"Antonio", "Mesa", "Cybermito"}; //Nuevo array con datos declarados
        System.out.println(names); //Devuelve una dirección de memoria o un objeto

        // Acceder al valor de los elementos para leerlos
        System.out.println(numbers[0]); //0
        System.out.println(numbers[1]); //0
        System.out.println(numbers[2]); //0
        // System.out.println(numbers[3]); Error fuera de indice.

        System.out.println(names[0]); //Antonio
        System.out.println(names[1]); //Mesa
        System.out.println(names[2]); //Cybermito
        // System.out.prinln(names[3]); // Error fuera de indice

        // Modificación de valores de un elemento en un Array
        numbers[0] = 1; //Asignamos el valor numérico 1
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]); // 1
        System.out.println(numbers[1]); // 2
        // numbers[3] = 4; // Error fuera de índice

        System.out.println(names[2]); // 'Cybermito'
        names[2] = "cybermito@gmail.com";
        System.out.println(names[2]); // 'cybermito@gmail.com'

        // reseteando valores
        System.out.println(names.length); // 3
        names[2] = null; // eliminamos el valor
        System.out.print(names[2]); // null
        System.out.println(names.length); // 3

        // numbers[2] = null; // Error

        // Crear un array de booleanos, dato primitivo que devuelve sus valores false, true
        boolean[] booleans = new boolean[5];
        System.out.println(booleans.length); // 5
        System.out.println(booleans[3]); // false por defecto cuando no se le ha asignado ningún valor al elemento.
    }

}
