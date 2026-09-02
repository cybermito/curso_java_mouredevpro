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
                System.out.println("Número de día incorrecto, debe ser del 1 al 7");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" según la nota (0-100).

        // Corrección no tengo en cuenta números negativos, por debajo de cero debe
        // ser inválido.
        /*
        var grade = 95;

        if (grade <= 49){
            System.out.println(String.format("Tu nota es %d, estás suspenso.",
                    grade));
        } else if (grade >= 50 && grade <= 90){
            System.out.println(String.format("Tu nota es %d, estás aprobado.",
                    grade));
        } else {
            System.out.println(String.format("Tu nota es %d, Sobresaliente.",
                    grade));
        }

         */
        var grade = 95;

        if (grade >=0 && grade <= 49){
            System.out.println(String.format("Tu nota es %d, estás suspenso.",
                    grade));
        } else if (grade >= 50 && grade <= 90){
            System.out.println(String.format("Tu nota es %d, estás aprobado.",
                    grade));
        } else if (grade > 90 && grade <= 100){
            System.out.println(String.format("Tu nota es %d, Sobresaliente.",
                    grade));
        } else {
            System.out.println("Nota no válida. Tienen que estar entre 0 y 100");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 años o ir acompañado.

        boolean isAccompanied = true;
        age = 15;

        if (age >= 15){
            System.out.println("Puedes entrar, tienes la edad mínima de 15");
        } else if (age < 15 && isAccompanied){
            System.out.println("Puedes entrar con un/a acompañante");
        } else {
            System.out.println("No puedes entrar si no tienes 15 años o vas " +
                    "acompañado/a");
        }

        // Correción de Brais
        /*
        int cinemaAge = 12;
        boolean isAccompanied = true;
        System.out.println("Edad: " + cinemaAge + " años");
        System.out.println("¿Va acompañado? " + isAccompanied);

        if (cinemaAge >= 15 || isAccompanied) {
            System.out.println("Puede entrar al cine");
        } else {
            System.out.println("NO puede entrar al cine");
        }
        * */


        // 9. Crea un programa que diga si una letra es vocal o consonante.
        String vocals = "aeiou";
        char letter = 'x';
        // La clase Character, contiene un método .toString que convierte un char en un String.
        String vocalToString = Character.toString(letter);

        if (vocals.contains(vocalToString)){
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra es una consonante");
        }



        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        var a = 2;
        var b = 3;
        var c = 3;

        if (a > b){
            if (a > c){
                System.out.println("a es mayor");
            }
        } else if (b > c){
            System.out.println("b es mayor");
        } else {
            System.out.println("c es mayor");
        }

        /* Corrección de Brais

        if (a >= b && a >= c) {
            System.out.println("El mayor es 'a' con valor: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es 'b' con valor: " + b);
        } else {
            System.out.println("El mayor es 'c' con valor: " + c);
        }*/
    }
}
