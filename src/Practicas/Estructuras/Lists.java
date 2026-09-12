package Practicas.Estructuras;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args){
        // Declaración y creación (2 formas)

        // Clásica
        ArrayList<String> names = new ArrayList<>();
        // Moderna
        var numbers = new ArrayList<Integer>();

        // Ver el tamaño de la lista
        System.out.println(names.size());
        System.out.println(numbers.size());

        // Añadir elementos a la lista
        names.add("Antonio");
        names.add("Mesa");
        names.add("Cybermito");
        System.out.println(names.size());

        // Acceder a un elemento de la lista
        System.out.println(names.getFirst()); // primer elemento
        System.out.println(names.get(1)); // Elemento segunda posición
        System.out.println(names.getLast()); // Último elemento.

        // Modificación de un elemento
        names.set(2, "cybermito@gmail.com");
        System.out.println(names.getLast());
        names.set(1, "Cybermito");
        System.out.println(names.get(1));

        // Eliminación de un elemento
        names.remove(2);
        // System.out.println(names.get(2)); // Error fuera de índice
        System.out.println(names.size());

        // Búsqueda
        System.out.println(names.contains("Cybermito"));
        System.out.println(names.indexOf("Cybermito")); // Devuelve el índice del contenido buscado;
        System.out.println(names.indexOf("Antonio"));
        System.out.println(names.indexOf("Pepito")); // Si no existe devuelve -1

        // Limpieza
        names.add("cybermito@gmail.com");
        System.out.println(names);
        names.clear(); // Elimina todos los elementos de la lista, dejándola vacía.
        System.out.println(names.size());

        // Las listas tienen una gran cantidad de métodos con los que podemos trabajar
        // tales como los que hemos visto e incluso de iteración, ordenación, etc...
    }
}
