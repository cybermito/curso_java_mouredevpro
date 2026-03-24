public class BeginnerCorrections {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Brais Moure";
        System.out.println("Mi nombre es: " + name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 38;
        System.out.println("Mi edad es: " + age + " años");

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.77;
        System.out.println("Mi altura es: " + height + " metros");

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeProgramming = true;
        System.out.println("¿Me gusta programar? " + likeProgramming);

        // 5. Declara una constante con tu email.
        final String EMAIL = "pro@mouredev.com";
        System.out.println("Mi email es: " + EMAIL);
        // EMAIL = "otro@mouredev.com"; // Error: no se puede cambiar una constante

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'B';
        System.out.println("Mi inicial es: " + initial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación
        // cambia su valor y vuelve a imprimirla.
        String location = "España";
        System.out.println("Vivo en: " + location);
        location = "Galicia";
        System.out.println("Más específicamente en: " + location);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 10;
        int b = 25;
        int sum = a + b;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("La suma de a + b = " + sum);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("El tipo de 'name' es: " + name.getClass().getSimpleName());
        System.out.println("El tipo de 'age' es: " + ((Object) age).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor
        // antes de imprimirla.
        String country;
        country = "España";
        System.out.println("Mi país es: " + country);

        // Ejemplo adicional con diferentes tipos de datos primitivos

        // Usando var (inferencia de tipos)
        var city = "Lugo"; // Java infiere que es String
        var year = 2025; // Java infiere que es int
        System.out.println("Ciudad: " + city + ", Año: " + year);

        // Otros tipos primitivos
        byte smallNumber = 127; // Rango: -128 a 127
        short mediumNumber = 30000; // Rango: -32,768 a 32,767
        long bigNumber = 1000000000L; // Para números muy grandes (añade la 'L')
        float decimalFloat = 3.14f; // Para decimales (añade la 'f')

        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + decimalFloat);
    }
}
