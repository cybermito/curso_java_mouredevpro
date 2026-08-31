package Ejercicios.Condicionales;

public class ConditionalsCorrections {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
        // 18).
        int userAge = 20;
        System.out.println("Edad del usuario: " + userAge);

        if (userAge >= 18) {
            System.out.println("El usuario puede votar");
        } else {
            System.out.println("El usuario NO puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int firstNumber = 25;
        int secondNumber = 18;
        System.out.println("Primer número: " + firstNumber);
        System.out.println("Segundo número: " + secondNumber);

        if (firstNumber > secondNumber) {
            System.out.println("El primer número (" + firstNumber + ") es mayor");
        } else if (firstNumber < secondNumber) {
            System.out.println("El segundo número (" + secondNumber + ") es mayor");
        } else {
            System.out.println("Ambos números son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int number = -5;
        System.out.println("Número: " + number);

        if (number > 0) {
            System.out.println("El número es positivo");
        } else if (number < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int numberToCheck = 7;
        System.out.println("Número a verificar: " + numberToCheck);

        if (numberToCheck % 2 == 0) {
            System.out.println("El número " + numberToCheck + " es par");
        } else {
            System.out.println("El número " + numberToCheck + " es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int rangeNumber = 75;
        System.out.println("Número: " + rangeNumber);

        if (rangeNumber >= 1 && rangeNumber <= 100) {
            System.out.println("El número " + rangeNumber + " está en el rango de 1 a 100");
        } else {
            System.out.println("El número " + rangeNumber + " NO está en el rango de 1 a 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con
        // switch.
        int dayOfWeek = 3;
        System.out.println("Día número: " + dayOfWeek);

        switch (dayOfWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido. Debe ser un número del 1 al 7");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" según la nota (0-100).
        int grade = 85;
        System.out.println("Nota: " + grade);

        if (grade >= 90 && grade <= 100) {
            System.out.println("Sobresaliente");
        } else if (grade >= 70 && grade < 90) {
            System.out.println("Aprobado");
        } else if (grade >= 0 && grade < 70) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 100");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 años o ir acompañado.
        int cinemaAge = 12;
        boolean isAccompanied = true;
        System.out.println("Edad: " + cinemaAge + " años");
        System.out.println("¿Va acompañado? " + isAccompanied);

        if (cinemaAge >= 15 || isAccompanied) {
            System.out.println("Puede entrar al cine");
        } else {
            System.out.println("NO puede entrar al cine");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letter = 'a';
        System.out.println("Letra: " + letter);

        // Convertir a minúscula para facilitar la comparación
        char lowerLetter = Character.toLowerCase(letter);

        if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' ||
                lowerLetter == 'o' || lowerLetter == 'u') {
            System.out.println("La letra '" + letter + "' es una vocal");
        } else if (Character.isLetter(lowerLetter)) {
            System.out.println("La letra '" + letter + "' es una consonante");
        } else {
            System.out.println("'" + letter + "' no es una letra válida");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 25;
        int b = 42;
        int c = 18;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        if (a >= b && a >= c) {
            System.out.println("El mayor es 'a' con valor: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es 'b' con valor: " + b);
        } else {
            System.out.println("El mayor es 'c' con valor: " + c);
        }
    }
}
