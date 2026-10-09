package Ejercicios.Funciones;

import java.util.ArrayList;

public class FunctionsCorrections {

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde
        // cero!".
        showWelcomeMessage();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa
        // persona.
        greetUser("Brais");
        greetUser("MoureDev");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        int result = subtractNumbers(10, 3);
        System.out.println("Resultado de la resta: " + result);
        System.out.println("15 - 8 = " + subtractNumbers(15, 8));

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        int square = calculateSquare(5);
        System.out.println("El cuadrado de 5 es: " + square);
        System.out.println("El cuadrado de 7 es: " + calculateSquare(7));

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        checkEvenOrOdd(4);
        checkEvenOrOdd(7);
        checkEvenOrOdd(12);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y
        // false en caso contrario).
        boolean isAdult1 = isAdult(17);
        boolean isAdult2 = isAdult(25);
        System.out.println("¿Es mayor de edad (17 años)? " + isAdult1);
        System.out.println("¿Es mayor de edad (25 años)? " + isAdult2);

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        String text = "Hola, Java!";
        int length = getStringLength(text);
        System.out.println("La longitud de '" + text + "' es: " + length);
        System.out.println("La longitud de 'Java' es: " + getStringLength("Java"));

        // 8. Crea un método que reciba un array de enteros, calcula su media y lo
        // retorna.
        int[] numbers = { 10, 20, 30, 40, 50 };
        double average = calculateAverage(numbers);
        System.out.println("La media del array es: " + average);

        // 9. Escribe un método que reciba un número y retorna su calculateFactorial.
        int factorialResult = calculateFactorial(5);
        System.out.println("El calculateFactorial de 5 es: " + factorialResult);
        System.out.println("El calculateFactorial de 6 es: " + calculateFactorial(6));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando
        // cada elemento.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("manzana");
        fruits.add("plátano");
        fruits.add("naranja");
        fruits.add("uva");

        printArrayList(fruits);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Madrid");
        cities.add("Barcelona");
        cities.add("Valencia");

        printArrayList(cities);

        // Ejemplos adicionales demostrando sobrecarga de métodos
        printInfo("Brais");
        printInfo("Moure", 28);
        printInfo("MoureDev", 38, "Ingeniero");
    }

    // 1. Función sin parámetros ni retorno
    public static void showWelcomeMessage() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Función con parámetro String
    public static void greetUser(String name) {
        System.out.println("¡Hola, " + name + "! Es un placer conocerte.");
    }

    // 3. Función que recibe dos enteros y retorna su resta
    public static int subtractNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    // 4. Función que calcula el cuadrado de un número
    public static int calculateSquare(int number) {
        return number * number;
    }

    // 5. Función que verifica si un número es par o impar
    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("El número " + number + " es par");
        } else {
            System.out.println("El número " + number + " es impar");
        }
    }

    // 6. Función que verifica si es mayor de edad
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    // 7. Función que retorna la longitud de una cadena
    public static int getStringLength(String text) {
        return text.length();
    }

    // 8. Función que calcula la media de un array
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    // 9. Función que calcula el calculateFactorial de un número
    public static int calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        }

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // 10. Función que recorre y muestra un ArrayList
    public static void printArrayList(ArrayList<String> list) {
        System.out.println("Elementos del ArrayList:");
        for (String element : list) {
            System.out.println("- " + element);
        }
    }

    // Ejemplos adicionales de sobrecarga de métodos
    public static void printInfo(String name) {
        System.out.println("Nombre: " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("Nombre: " + name + ", Edad: " + age);
    }

    public static void printInfo(String name, int age, String profession) {
        System.out.println("Nombre: " + name + ", Edad: " + age + ", Profesión: " + profession);
    }
}
