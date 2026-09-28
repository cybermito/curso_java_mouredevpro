package Practicas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bucles {
    public static void main(String[] args){
        /*
        * for each --> Recorrer los elementos de una estructura de datos
        * Sintaxis:
        * for (tipo_dato variable: nombre_estructura){
        *   //Bloque de código a ejecutar recorriendo la estructura
        *   //variable guarda cada uno de los elementos recorridos de la estructura
        *   //nos permite trabajar con cada uno de ellos
        * */

        // Recorrer un Array o Array List
        String[] names = {"Antonio", "Mesa", "Cybermito"};

        for (String name : names){
            System.out.println(name);
        }

        // Recorres un Set
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number : numbers){
            System.out.println(number);
        }

        // Recorrer un Map
        HashMap<String, String> emails = new HashMap<>();
        emails.put("Antonio", "antonio@email.es");
        emails.put("Mesa", "mesa@email.es");
        emails.put("Cybermito", "cybermito@email.es");

        // Para recorrer los elementos de un map, no se hace igual que con las estructuras anteriores
        // hay que utilizar unos métodos especiales que hay para las estructuras, en este caso
        // usaremos entrySet()

        /* Esto da error, puesto que tenemos una estructura clave:valor
        for (String email : emails){
            System.out.println(email);
        }
         */

        for (Map.Entry<String, String> email : emails.entrySet()){
            System.out.println(email); // Devolverá el conjunto clave=valor
        }

        // Si queremos solamente obtener la clave o el valor, podemos usar los métodos correspondientes
        // al entrySet

        for (Map.Entry<String, String> email : emails.entrySet()){
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        //Podemos obtener directamente la clave o el valor sin aplicar entry, usando alguno de los métodos que tenemos.

        for ( String email : emails.values()){
            System.out.println(email);
        }

        // Bucles while y do-while
        // while se repite el bloque de instrucciones mientras la condición sea verdadera
        // do - while, hace lo mismo que while con la excepción de que al menos el bloque se ejecutará una vez.

        int index = 0;
        while (index < 5){
            System.out.println("Hola, Java");
            index++;
        }

        // Podemos usarlo para recorrer un array
        index = 0;
        while (index < names.length){
            System.out.println(names[index]);
            index++;
        }

        // Incluso para usarlo con algún criterio de búsqueda
        index = 0;
        boolean find = false;
        while (!find){
            System.out.println(names[index]);
            if (names[index] == "Mesa"){
                find = true; // Cierra el bucle por que ya hemos encontrado lo que necesitamos
            }
            index++;
        }

        // do - while, el bloque se ejecuta al menos una vez
        index = 0;
        do {
            System.out.println("Hola, Java");
            index++;
        } while (index < 0);


    }
}
