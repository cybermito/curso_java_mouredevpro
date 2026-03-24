public class EjerciciosPrincipiantes {
    static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Antonio";
        System.out.println("Nombre: " + name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 51;
        System.out.println("Edad: " + age);

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.73;
        System.out.println("Altura: " + height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeProgramming = true;
        System.out.println("¿Me gusta programar?: " + likeProgramming);

        // 5. Declara una constante con tu email.
        final String EMAIL = "micorreo@gmail.com";
        System.out.println("Email: " + EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'A';
        System.out.println("Inicial: " + initial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación
        // cambia su valor y vuelve a imprimirla.
        String province = "España";
        System.out.println("Vivo en: " + province);

        province = "Granada";
        System.out.println("En la provincia de: " + province);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 10;
        int b = 24;
        System.out.println("La suma de las variables a y b es: " + (a + b));

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("Tipo de dato de la variable province: " + province.getClass().getName());
        System.out.println("Tipo de dato de la variable age: " + ((Object)age).getClass().getName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor
        // antes de imprimirla.

        String myVariable;
        myVariable = "Valor asignado después";
        System.out.println(myVariable);

        //Ejemplos de otros tipos de datos y declaración de variables

        //Usando var (inferencia de tipos)
        var city = "Granada"; //Java infiere que es un String
        var year = 2026; //Java infiere que es un int
        System.out.println("Ciudad: " + city + ", Año: " + year);

        //Otros tipos primitivos
        byte smallNumber = 127; //Rango -128 a 127
        short mediumNumber = 30000; // Rango: -32768 a 32767
        long bigNumber = 1000000000L; //Para números muy grandes (añade la L)
        float decimalFloat = 3.14f; //Para tipo decimal con menos precisión (añadir la "f" para diferenciar de double)

        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + decimalFloat);

    }
}
