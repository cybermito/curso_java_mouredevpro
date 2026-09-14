package Practicas.Estructuras;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args){

        // Declaración de un sets
        // Clásica
        HashSet<String> names = new HashSet<>();
        // Moderna
        var numbers = new HashSet<Integer>();

        // Añadir elementos a un set (se hace del mismo modo que con las listas
        names.add("Antonio");
        names.add("Mesa");
        names.add("Cybermito");
        names.add("cybermito@gmail.com");

        // Ver el tamaño del set (igual a las listas
        System.out.println(names.size());

        // Eliminar un elemento del set
        names.remove("Mesa"); //Se indica el valor del elemento, no el índice como en las listas.
        System.out.println(names.size());
        System.out.println(names);

        // Búsqueda (aquí es donde está el poder de los sets
        System.out.println(names.contains("Antonio"));
        System.out.println(names.contains(("Pepito")));

        // Los sets evitan duplicados
        names.add("Antonio");
        names.add("Antonio");
        names.add("Antonio");
        System.out.println(names); // Devuelve [Antonio, Cybermito, cybermito@gmail.com]

        // Operaciones de conjuntos
        // Uniones
        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("Portugal");
        countries.add("Argentina");
        countries.add("Perú");

        // names.addAll(numbers); //Error no se pueden mezclar distintos tipos de datos
        names.addAll(countries); // Añade todos los elementos de countries en names, eliminando duplicados
        // names se modifica, countries no.
        System.out.println(names);

        // Diferencia. Elimina los elementos en names que coincidan en valor con los elementos de countries
        countries.add("cybermito@gmail.com");
        System.out.println(names);
        System.out.println(countries);
        System.out.println(names.removeAll(countries)); // Devuelve verdadero si hay coincidencias.
        System.out.println(names);
        System.out.println(countries);

        // Intersección. Mantiene en el conjunto names solo los elementos que están también en el conjunto countries.
        names.add("cybermito@gmail.com");
        System.out.println(names);
        System.out.println(countries);
        System.out.println(names.retainAll(countries));
        System.out.println(names);
        System.out.println(countries);

    }
}
