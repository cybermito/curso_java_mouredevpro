public class StringsCorrections {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String firstName = "Brais";
        String lastName = "Moure";
        String fullName = firstName + " " + lastName;
        System.out.println("Nombre completo: " + fullName);

        // También se puede usar concat()
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Nombre completo (con concat): " + fullName2);

        // 2. Muestra la longitud de una cadena de texto.
        String message = "Hola, Java!";
        System.out.println("La cadena '" + message + "' tiene " + message.length() + " caracteres");

        // 3. Muestra el primer y último carácter de un string.
        String word = "Programación";
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
        System.out.println("Primer carácter de '" + word + "': " + firstChar);
        System.out.println("Último carácter de '" + word + "': " + lastChar);

        // 4. Convierte a mayúsculas y minúsculas un string.
        String text = "Java es un gran lenguaje";
        System.out.println("Original: " + text);
        System.out.println("Mayúsculas: " + text.toUpperCase());
        System.out.println("Minúsculas: " + text.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String sentence = "Me gusta programar en Java";
        String searchWord = "Java";
        boolean containsWord = sentence.contains(searchWord);
        System.out.println("¿La frase '" + sentence + "' contiene '" + searchWord + "'? " + containsWord);

        // Búsqueda sin distinción de mayúsculas/minúsculas
        boolean containsWordIgnoreCase = sentence.toLowerCase().contains(searchWord.toLowerCase());
        System.out.println("¿Contiene 'java' (sin distinción de mayúsculas)? " + containsWordIgnoreCase);

        // 6. Formatea un string con un entero.
        String name = "Brais";
        int age = 38;
        String formattedMessage = String.format("Hola, me llamo %s y tengo %d años", name, age);
        System.out.println(formattedMessage);

        // También con printf
        System.out.printf("Usando printf: %s tiene %d años.%n", name, age);

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String stringWithSpaces = "   Texto con espacios   ";
        System.out.println("Original: '" + stringWithSpaces + "'");
        System.out.println("Con trim(): '" + stringWithSpaces.trim() + "'");

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        String textWithSpaces = "Esto es una frase con espacios";
        String textWithHyphens = textWithSpaces.replace(" ", "-");
        System.out.println("Original: " + textWithSpaces);
        System.out.println("Con guiones: " + textWithHyphens);

        // 9. Comprueba si dos strings son iguales.
        String string1 = "Java";
        String string2 = "Java";
        String string3 = new String("Java");
        String string4 = "java";

        System.out.println("string1.equals(string2): " + string1.equals(string2));
        System.out.println("string1.equals(string3): " + string1.equals(string3));
        System.out.println("string1.equals(string4): " + string1.equals(string4));
        System.out.println("string1.equalsIgnoreCase(string4): " + string1.equalsIgnoreCase(string4));

        // Diferencia entre == y equals
        System.out.println("string1 == string2: " + (string1 == string2));
        System.out.println("string1 == string3: " + (string1 == string3));

        // 10. Comprueba si dos strings tienen la misma longitud.
        String word1 = "Programar";
        String word2 = "MoureDev";
        String word3 = "Java";

        boolean sameLength1 = word1.length() == word2.length();
        boolean sameLength2 = word1.length() == word3.length();

        System.out.println("'" + word1 + "' y '" + word2 + "' tienen la misma longitud: " + sameLength1);
        System.out.println("'" + word1 + "' y '" + word3 + "' tienen la misma longitud: " + sameLength2);
        System.out.println("Longitud de '" + word1 + "': " + word1.length());
        System.out.println("Longitud de '" + word2 + "': " + word2.length());
        System.out.println("Longitud de '" + word3 + "': " + word3.length());
    }
}
