package Ejercicios.Condicionales;

public class CondicionalEjercicios {
    static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
        // 18).

        int age = 18;

        if (age >= 18){
            System.out.println("Eres mayor de edad, puedes votar");
        } else {
            System.out.println("Aún no eres mayor de edad, no puedes votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        int number01 = 101;
        int number02 = 20;

        if (number01 == number02) {
            System.out.println("Los dos números son iguales");
        } else if (number01 > number02){
            System.out.println(String.format("El número01 %d es mayor que el número02 %d", number01, number02));
        } else {
            System.out.println(String.format("El número02 %d es mayor que el número01 %d", number02, number01));
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        if (number01 == 0){
            System.out.println(String.format("number01 es cero: %d", number01));
        } else if (number01 > 0){
            System.out.println(String.format("number01: %d, es positivo.", number01));
        } else {
            System.out.println(String.format("number01: %d, es negativo.", number01));
        }

        // 4. Crea un programa que diga si un número es par o impar.

        if (number01 % 2 == 0){
            System.out.println(String.format("El %d es par", number01));
        } else {
            System.out.println(String.format("El %d es impar", number01));
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        if (number01 >= 1 && number01 <=100){
            System.out.println(String.format("number01: %d está dentro del " +
                    "rango 1 - 100", number01));
        } else {
            System.out.println(String.format("number01: %d no está dentro del" +
                    " " +
                    "rango 1 - 100", number01));
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con
        // switch.
        var day = 5;

        switch (day){
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
                System.out.println("No es un día de la semana.");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" según la nota (0-100).

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
    }
}
