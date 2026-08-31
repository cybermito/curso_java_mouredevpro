/*
* Clase sobre variables y constantes, definición de estas y uso
* */

public class VariablesAndConstans {

    static void main(String[] args) {
        //Definimos una variable name de tipo String
        String name = "Cybermito";
        System.out.println(name); // Imprimimos su valor

        //Cambiamos su valor
        name = "Antonio";
        System.out.println(name);

        //No podemos asignar un valor de distinto tipo
        // name = 51; Error (no podemos cambiar el tipo de dato)

        //Definimos una variable con otro tipo de dato (entero)
        int age = 51;
        System.out.println(age);

        //Podemos definir variables infiriendo el tipo de dato, esto es a partir de versiones modernas de Java.
        var email = "cybermito@gmail.com"; //Java va a tomar esta variable como String para todo su ciclo de vida.
        System.out.println(email);
        var year = 2026; //Java va a tomar esta variable como int para todo el ciclo de vida.
        System.out.println(year);

        //Definiendo constantes
        final String EMAIL = "cybermito@gmail.com"; //La palabra reservada final indica que es una constante.
        System.out.println(EMAIL);

        // EMAIL = "otro@email.com"; No podemos cambiar el valor ya que es una constante.
    }
}
