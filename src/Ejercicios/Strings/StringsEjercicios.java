package Ejercicios.Strings;

public class StringsEjercicios {
    public static void main(String[] args){
        String name = "Antonio";
        String surname = "Mesa Casares";
        String numberString = "5";
        int age = 51;

        // 1. Concatena dos cadenas de texto.
        System.out.println("Hola, soy " + name + " " + surname);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("Longitud name: " + name.length());

        // 3. Muestra el primer y último carácter de un string.
        var firstChar = name.charAt(0);
        var lastChar = name.charAt(name.length() - 1);
        System.out.println("Primer carácter: " + firstChar);
        System.out.println("Último carácter: " + lastChar);

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toUpperCase());
        System.out.println(surname.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(surname.contains("Mesa"));

        // 6. Formatea un string con un entero.
        
        System.out.println(Integer.valueOf(numberString));

        // 7. Elimina los espacios en blanco al principio y final de un string.

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        // 9. Comprueba si dos strings son iguales.

        // 10. Comprueba si dos strings tienen la misma longitud.
    }
}
