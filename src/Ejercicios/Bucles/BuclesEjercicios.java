package Ejercicios.Bucles;

import java.util.*;

public class BuclesEjercicios {
    public static void main(String[] args){
        // 1. Imprime los números del 1 al 10 usando while.
        int counter = 1;
        System.out.println("\nNúmeros del 1 al 10 con while. \n");
        while ( counter <= 10){
            System.out.println(counter);
            counter++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> names = new ArrayList<>();
        names.add("Antonio");
        names.add("Mesa");
        names.add("Cybermito");
        names.add("cybermito@email.com");
        names.add("Programador");

        int index = 0;
        System.out.println("\nValores del ArrayList con do while.\n");
        if (!names.isEmpty()){ //Esta parte es importante para no generar error.
            do {
                System.out.println(names.get(index));
                index++;
            } while (index < names.size());
        } else {
            System.out.println("El ArrayList está vacío");
        }


        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        System.out.print("\nLos multiplos de 5 entre el 1 y el 50 son: ");
        for (int number = 1; number <= 50; number++){
            if (number % 5 == 0){
                System.out.print(number + ", ");
            }
        }
        System.out.println("");

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numbers = {1, 2, 3, 4, 5};
        int totalSum = 0;

        for (int number : numbers) {
            totalSum += number;
        }
        System.out.println("\nLa suma total del Array " + Arrays.toString(numbers) + " es " + totalSum);
        // Otra forma de resolverlo:
        totalSum = 0;
        for (int i = 0; i < numbers.length; i++){
            totalSum += numbers[i];
            System.out.println("Número " + (i + 1) + ": " + numbers[i]);
        }
        System.out.println("\nLa suma total del Array " + Arrays.toString(numbers) + " es " + totalSum);


        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] cities = { "Granada", "Jaén", "Huelva", "Almería", "Córdoba", "Málaga", "Cádiz", "Sevilla"};
        System.out.println("\nContenido del Array usando for");
        for (String city : cities){
            System.out.println(city);
        }

        // Otra forma de resolverlo
        for (int i = 0; i < cities.length; i++){
            System.out.println("Ciudad " + (i + 1) + ": " + cities[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> emails = new HashSet<>();
        emails.add("antonio@email.com");
        emails.add("mesa@email.com");
        emails.add("cybermito@email.com");

        HashMap<String, String> contactos = new HashMap<>();
        contactos.put("Antonio", "555666777");
        contactos.put("Nuria", "777555444");
        contactos.put("Luna", "213003005");

        System.out.println("\n Contenido del HashSet: \n");
        for (String email : emails){
            System.out.println(email);
        }

        System.out.println("\n Contenido del HashMap: \n");
        for ( Map.Entry<String, String> contacto : contactos.entrySet()){
            System.out.println("Contacto: " + contacto.getKey() + ", " + contacto.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        System.out.println("\nContador hacia atrás, del 10 al 1\n");
        for (int i = 10; i > 0; i--){
            System.out.println("Número: " + i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        System.out.println("\nMultiplos de 3 entre del 1 al 20\n");
        for (int m = 1; m <= 20; m++){
            if (m % 3 == 0){
                continue; //Salta los múltiplos de 3
            }
            System.out.println("Número (no múltiplo de 3): " + m);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un
        // array.
        numbers = null;
        numbers = new int[]{1,2,3,4,5,6, -3, 7, 8, 9, -10, 10, 11, 12};
        for (int number : numbers){
            if (number < 0){
                System.out.println("Número negativo encontrado " + number);
                System.out.println("Saliendo y finalizando el bucle");
                break;
            }
            System.out.println(number);
        }

        // Otra forma de resolverlo
        for (int i = 0; i < numbers.length; i++){
            System.out.println("¡Número negativo encontrado: " + numbers[i] + "!");
            System.out.println("Deteniendo el bucle...");
            break;
        }

        // 10. Crea un programa que calcule el calculateFactorial de un número dado.
        // Scanner nos sirve para poder solicitar datos de entrada de usuario
        Scanner scanner = new Scanner(System.in); // Inicializamos la librería
        int number = 0;
        long factorial = 1; // Hay que tener cuidado de no meter números grandes
        // por encima de 20
        System.out.println("Calculadora del calculateFactorial de un número\n");
        System.out.println("Introduce un número entre el 1 y el 20: ");
        number = scanner.nextInt();

        for (int n = 1; n <= number; n++){
            factorial *= n;
            System.out.println(n + "! = " + factorial);
        }

        if (number < 0){
            System.out.println("Solo se puede calcular el calculateFactorial de números positivos");
        } else {
            System.out.println("El calculateFactorial de " + number + " es " + factorial);
        }

    }
}
