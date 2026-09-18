package Ejercicios.Estructuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class EstructurasEjercicios {
    public static void main(String[] args) {
        // Ejercicios Estructuras

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] values = {"Antonio", "Nuria", "Luna", "Hogar", "Granada"};
        System.out.println(values.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes
        // y después de modificarlo.
        System.out.println(values[0]);
        values[0] = "Pepito";
        System.out.println(values[0]);

        // 3. Crea un ArrayList vacío.
        var names = new ArrayList<String>();
        System.out.println(names.size());

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        names.add("Antonio");
        names.add("Nuria");
        names.add("Luna");
        names.add("Pablo");
        System.out.println(names);
        names.remove("Pablo");
        System.out.println(names);

        // 5. Crea un HashSet con 2 valores diferentes.
        var numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);

        // 7. Elimina uno de los elementos del HashSet.
        numbers.remove(2);
        System.out.println(numbers);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de
        // teléfono. Añade tres contactos.
        var contacts = new HashMap<String, Integer>();
        contacts.put("Pepito", 666555444 );
        contacts.put("Cybermito", 777888999);
        contacts.put("Agapito", 123000666);
        System.out.println(contacts);

        // 9. Modifica uno de los contactos y elimina otro.
        contacts.put("Cybermito", 999888777);
        System.out.println(contacts);
        contacts.remove("Agapito");
        System.out.println(contacts);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        String[] names2 = {"Pepito", "agapito", "fulanito"};
        var toArrayList = new ArrayList<String>();
        var toHashSet = new HashSet<String>();
        var toHashMap = new HashMap<String, String>();

        System.out.println(names2.length); // Imprimimos el tamaño del Array
        System.out.println(names2[0]);
        System.out.println(names2[1]);
        System.out.println(names2[2]);

        // Conversión a ArrayList. Investigando en Internet, me aparecen varias formas de hacerlo usando varios métodos
        // Método 1: con la función Arrays.asList(), la cuál se le pasa un Array y devuelve un ArrayList que previamente
        // debe de estar declarado.
        // Método 2: con una colección, aunque este tipo de estructuras no lo hemos dado, nos permite convertir un Array
        // en un ArrayList con uno de sus métodos. Sería:
        // Collections.addAll(ArrayList, Array);
        // Método 3: usando el add() y recorriendo el Array mediante un bucle for (que aún no hemos visto).
        /*
        * for (int i = 0; i < names2; i++){
        *   toArrayList.add(names2[i]);
        * }
        * */
        toArrayList.addAll(Arrays.asList(names2));
        System.out.println(toArrayList);

        // El paso a HashSet es más sencillo cuando ya tenemos un ArrayList, ya que podemos usar este para pasarselo
        // como parámetro al método .addAll(collection);
        toHashSet.addAll(toArrayList);
        System.out.println(toHashSet);

        // Paso a HashMap, no he encontrado un método para hacerlo rápidamente, así que lo he realizado de forma manual
        // en cuanto veamos los ciclos for, se podrá automatizar.
        toHashMap.put(names2[0], names2[0]);
        toHashMap.put(names2[1], names2[1]);
        toHashMap.put(names2[2], names2[2]);
        System.out.println(toHashMap);
    }
}
