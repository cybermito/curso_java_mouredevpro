package Practicas.Estructuras;

import java.util.HashMap;
import java.util.HashSet;

public class Maps {
    public static void main(String[] args) {
        // Declaración de un Hashmap
        // Clásica
        HashMap<String, String> names = new HashMap<>();
        // Moderna
        var numbers = new HashMap<Integer, String>();

        // Ver tamaño
        System.out.println(names.size());

        // Agregar valores al HashMap
        names.put("Antonio", "antonio@email.com");
        names.put("Cybermito", "cybermito@email.com");
        names.put("Email", "tuemail@email.com");

        System.out.println(names.size());
        System.out.println(names);

        // Acceder a un valor del HashMap
        // Devuelve el valor de la clave indicada
        System.out.println(names.get("Cybermito"));
        System.out.println(names.get("Email"));

        // Verificación, comprobar si una clave o un valor existen
        System.out.println(names.containsKey("Cybermito"));
        System.out.println(names.containsValue("email@email.com"));

        // Eliminar elementos de un HashMap
        // Antes de eliminar el elemento, el método devuelve el valor de la clave
        // indicada a eliminar.
        System.out.println(names.remove("Antonio"));
        System.out.println(names.remove("Mesa")); // Devuelve null cuando no existe la clave a eliminar
        System.out.println(names);

        // Limpiar un HashMap completo
        names.clear();
        System.out.println(names);

        // Modificación de la estructura
        names.put("Antonio", "antonio@email.com");
        names.put("Antonio", "antoniodev@email.com"); // Modifica el valor si la clave existe, si no, crea un nuevo
        // elemento.

        names.replace("Cybermito", "cybermitoDev@email.com"); // Reemplaza el valor de la clave indicada, si esta existe
        // si no existe, no hace nada.
        names.putIfAbsent("Email", "email@email.com");
        System.out.println(names.putIfAbsent("cybermito", "cybermito@email.com"));

        System.out.println(names);

        // Otras operaciones
        System.out.println(names.isEmpty()); // Devuelve true si la estructura está vacía
        var values = names.values(); // Devuelve un set de los valores de la estructura
        System.out.println(values);
        var keys = names.keySet(); // Devuelve un set de las claves de la estructura
        System.out.println(keys);
    }
}
