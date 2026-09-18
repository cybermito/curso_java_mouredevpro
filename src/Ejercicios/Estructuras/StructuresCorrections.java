package Ejercicios.Estructuras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresCorrections {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] fruits = { "manzana", "plátano", "naranja", "uva", "pera" };
        System.out.println("Array de frutas: " + java.util.Arrays.toString(fruits));
        System.out.println("Longitud del array: " + fruits.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes
        // y después de modificarlo.
        System.out.println("\nAntes de modificar:");
        System.out.println("Valor en índice 2: " + fruits[2]);

        fruits[2] = "melocotón";

        System.out.println("Después de modificar:");
        System.out.println("Valor en índice 2: " + fruits[2]);
        System.out.println("Array completo: " + java.util.Arrays.toString(fruits));

        // 3. Crea un ArrayList vacío.
        ArrayList<String> cities = new ArrayList<>();
        System.out.println("\nArrayList vacío creado. Tamaño: " + cities.size());

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        cities.add("Madrid");
        cities.add("Barcelona");
        cities.add("Valencia");
        cities.add("Sevilla");
        System.out.println("ArrayList después de añadir 4 ciudades: " + cities);
        System.out.println("Tamaño: " + cities.size());

        cities.remove("Barcelona");
        System.out.println("ArrayList después de eliminar Barcelona: " + cities);
        System.out.println("Tamaño: " + cities.size());

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> colors = new HashSet<>();
        colors.add("rojo");
        colors.add("azul");
        System.out.println("\nHashSet con 2 colores: " + colors);
        System.out.println("Tamaño: " + colors.size());

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        colors.add("rojo"); // Valor repetido: no se añadirá
        colors.add("verde"); // Valor nuevo: sí se añadirá
        System.out.println("HashSet después de intentar añadir 'rojo' (repetido) y 'verde' (nuevo): " + colors);
        System.out.println("Tamaño: " + colors.size());

        // 7. Elimina uno de los elementos del HashSet.
        colors.remove("azul");
        System.out.println("HashSet después de eliminar 'azul': " + colors);
        System.out.println("Tamaño: " + colors.size());

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de
        // teléfono. Añade tres contactos.
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Brais", "123-456-789");
        phoneBook.put("Moure", "987-654-321");
        phoneBook.put("MoureDev", "555-123-456");
        System.out.println("\nAgenda de teléfonos: " + phoneBook);
        System.out.println("Tamaño: " + phoneBook.size());

        // 9. Modifica uno de los contactos y elimina otro.
        System.out.println("Teléfono de Brais antes: " + phoneBook.get("Brais"));
        phoneBook.put("Brais", "111-222-333");
        System.out.println("Teléfono de Brais después: " + phoneBook.get("Brais"));

        phoneBook.remove("Moure");
        System.out.println("Agenda después de eliminar a Moure: " + phoneBook);
        System.out.println("Tamaño: " + phoneBook.size());

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        // Array inicial
        String[] languages = { "Java", "Python", "JavaScript", "Java", "Kotlin", "Python" };
        System.out.println("Array original: " + java.util.Arrays.toString(languages));

        // Array a ArrayList
        ArrayList<String> languagesList = new ArrayList<>();
        for (String language : languages) {
            languagesList.add(language);
        }
        System.out.println("ArrayList: " + languagesList);
        System.out.println("Tamaño ArrayList: " + languagesList.size());

        // ArrayList a HashSet (elimina duplicados)
        HashSet<String> languagesSet = new HashSet<>(languagesList);
        System.out.println("HashSet (sin duplicados): " + languagesSet);
        System.out.println("Tamaño HashSet: " + languagesSet.size());

        // HashSet a HashMap (clave y valor iguales)
        HashMap<String, String> languagesMap = new HashMap<>();
        for (String language : languagesSet) {
            languagesMap.put(language, language);
        }
        System.out.println("HashMap (clave = valor): " + languagesMap);
        System.out.println("Tamaño HashMap: " + languagesMap.size());

        // Ejemplos adicionales de operaciones
        System.out.println("\n=== OPERACIONES ADICIONALES ===");

        // Verificar si contiene elementos
        System.out.println("¿El ArrayList contiene 'Java'? " + languagesList.contains("Java"));
        System.out.println("¿El HashSet contiene 'PHP'? " + languagesSet.contains("PHP"));
        System.out.println("¿El HashMap contiene la clave 'Python'? " + languagesMap.containsKey("Python"));

        // Obtener valores
        System.out.println("Primer elemento del ArrayList: " + languagesList.getFirst());
        System.out.println("Último elemento del ArrayList: " + languagesList.getLast());
        System.out.println("Valor de 'Java' en el HashMap: " + languagesMap.get("Java"));

        // Verificar si están vacíos
        System.out.println("¿Está vacío el ArrayList? " + languagesList.isEmpty());
        System.out.println("¿Está vacío el HashSet? " + languagesSet.isEmpty());
        System.out.println("¿Está vacío el HashMap? " + languagesMap.isEmpty());
    }
}
