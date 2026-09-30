package Ejercicios.Bucles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsCorrections {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int counter = 1;
        while (counter <= 10) {
            System.out.println("Número: " + counter);
            counter++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("manzana");
        fruits.add("plátano");
        fruits.add("naranja");
        fruits.add("uva");

        int index = 0;
        if (!fruits.isEmpty()) {
            do {
                System.out.println("Fruta: " + fruits.get(index));
                index++;
            } while (index < fruits.size());
        } else {
            System.out.println("El ArrayList está vacío");
        }

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int number = 1; number <= 50; number++) {
            if (number % 5 == 0) {
                System.out.println("Múltiplo de 5: " + number);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numbers = { 10, 25, 30, 15, 20 };
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Número " + (i + 1) + ": " + numbers[i]);
        }
        System.out.println("Suma total: " + sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] cities = { "Madrid", "Barcelona", "Valencia", "Sevilla", "Lugo" };

        for (int i = 0; i < cities.length; i++) {
            System.out.println("Ciudad " + (i + 1) + ": " + cities[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> colors = new HashSet<>();
        colors.add("azul");
        colors.add("naranja");
        colors.add("verde");
        colors.add("amarillo");

        for (String color : colors) {
            System.out.println("Color: " + color);
        }

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Brais", 25);
        ages.put("Moure", 30);
        ages.put("MoureDev", 38);
        ages.put("Pro", 1);

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int number = 10; number >= 1; number--) {
            System.out.println("Número: " + number);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int number = 1; number <= 20; number++) {
            if (number % 3 == 0) {
                continue; // Salta los múltiplos de 3
            }
            System.out.println("Número (no múltiplo de 3): " + number);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un
        // array.
        int[] mixedNumbers = { 5, 12, 8, -3, 15, 20 };

        for (int i = 0; i < mixedNumbers.length; i++) {
            System.out.println("Verificando número: " + mixedNumbers[i]);
            if (mixedNumbers[i] < 0) {
                System.out.println("¡Número negativo encontrado: " + mixedNumbers[i] + "!");
                System.out.println("Deteniendo el bucle...");
                break;
            }
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int numberForFactorial = 5;
        long factorial = 1;

        System.out.println("Calculando el factorial de " + numberForFactorial + ":");
        for (int i = 1; i <= numberForFactorial; i++) {
            factorial *= i;
            System.out.println(i + "! = " + factorial);
        }
        System.out.println("El factorial de " + numberForFactorial + " es: " + factorial);
    }
}
