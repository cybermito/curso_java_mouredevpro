package Ejercicios.Funciones;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsEjercicios {
    public static void main(String[] args){
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde
        // cero!".
        showWelcome();
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa
        // persona.
        greetUser("Antonio");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        int number01 = 10;
        int number02 = 4;
        System.out.println("La resta de " + number01 + " y " + number02 + " es " + subtractNumbers(number01, number02));

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        System.out.println("El cuadrado del número " + number01 + " es: " + calculateSquare(number01));

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        checkEvenOrOdd(number02);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y
        // false en caso contrario).
        boolean isAdult1 = isAdult(16);
        boolean isAdult2 = isAdult(52);
        System.out.println("¿Es mayor de edad (16 años)? " + isAdult1);
        System.out.println("¿Es mayor de edad (52 años)? " + isAdult2);
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        String word = "Hola, Java";
        int sizeWord = stringSize(word);
        System.out.println("La cadena \"" + word + "\" tiene " + sizeWord + " caracteres." );

        // 8. Crea un método que reciba un array de enteros, calcula su media y lo
        // retorna.
        int[] numbers = {1, 10, 34, 2, 80, 5};
        double valueMean = calculateAverange(numbers);
        System.out.println("La media de " + Arrays.toString(numbers) + " es: " + valueMean);

        // 9. Escribe un método que reciba un número y retorna su calculateFactorial.
        int factorial = calculateFactorial(4);
        System.out.println(factorial);

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando
        // cada elemento.
        var names = new ArrayList<String>();
        names.add("Antonio");
        names.add("Nuria");
        names.add("Luna");
        printArrayList(names);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Granada");
        cities.add("Barcelona");
        cities.add("Madrid");
        cities.add("Cantabria");
        printArrayList(cities);

        // Sobrecarga de métodos
        printInfo("Antonio");
        printInfo("Antonio", 52);
        printInfo("Antonio", 52, "Maker");

    }

    // 1.
    public static void showWelcome(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    //2.
    public static void greetUser(String name){
        System.out.println("Hola, " + name);
    }

    //3.
    public static int subtractNumbers(int minuend, int subtrahend){
        return minuend - subtrahend;
    }

    //4.
    public static int calculateSquare(int number){
        return number * number;
    }

    //5.
    public static void checkEvenOrOdd(int number){
        if (number % 2 == 0){
            System.out.println("El número " + number + " es par ");
        } else {
            System.out.println("El número " + number + " es impar ");
        }
    }

    //6.
    public static boolean isAdult(int age){
        return age >= 18;
    }

    //7.
    public static int stringSize(String text){
        return text.length();
    }

    //8.
    public static double calculateAverange(int[] numbers){
        if (numbers.length == 0){
            return 0.0;
        }

        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    //9.
    public static int calculateFactorial(int number){

        if (number <= 1){
            return 1;
        }

        number = number * calculateFactorial((number - 1));
        return number;

    }

    //10.
    public static void printArrayList(ArrayList<String> list){
        System.out.println("Elementos del ArrayList: ");
        for(String element : list){
            System.out.println("- " + element);
        }

    }

    // Ejemplos adicionales de sobrecarga de métodos.
    public static void printInfo(String name){
        System.out.println("Nombre: " + name);
    }

    public static void printInfo(String name, int age){
        System.out.println("Nombre: " + name + " Edad: " + age);

    }

    public static void printInfo(String name, int age, String profession){
        System.out.println("Nombre: " + name + " Edad: " + age + " Profesión: " + profession);
    }
}
