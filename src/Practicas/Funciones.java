package Practicas;

import java.util.ArrayList;
import java.util.Arrays;

public class Funciones {
    public static void main(String[] args){
        // Funciones
        /*
        * Son bloques de código declarados, nombrados y agrupados que realizan una función en concreto.
        * Cuando necesitamos repetir bloques de código que hacen algo igual, en distintas partes de nuestra aplicación
        * es buena práctica convertirlo en una función.
        * */

        // Tenemos un bloque de código que envía un email, por ejemplo

        for (int index = 0; index < 5; index ++){
            // System.out.println("Se envía el email..."); //Bloque de código para envíar un email
            sendEmail();
        }

        // Volvemos a escribir el bloque de código para enviar un email en otra parte del programa
        //System.out.println("Se envía un email...."); // Pero nos equivocamos en una parte del código, con lo cuál ya
        // no está funcionando como queríamos. Es aquí donde entran las funciones, nos permiten repetir código sin
        // equivocarnos, y si tenemos que hacer algún cambio en dicho bloque, solo tenemos que hacerlo una vez en todo
        // el código.
        sendEmail();

        //Llamada función con parámetros
        sendEmaiToUser("cybermito@email.com");
        // Llamada a la misma función con sobrecarga
        sendEmailToUser("cybermito@email.com", "Antonio");
        var users = new ArrayList<>(Arrays.asList("cybermito@email.com", "atigramakers@email.com"));
        sendEmailToUser(users);

        // Llamada a la función con retorno
        var state = sendEmailWithState("cybermito@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));

    }

    // Declaración de las funciones
    // Se hace fuera del bloque principal

    // Funciones sin parámetros ni retorno
    public static void sendEmail(){
        System.out.println("Se envía el email...");
    }

    // Funciones con parámetros
    public static void sendEmaiToUser(String email){
        System.out.println("Se envía el email a " + email);
    }

    // Sobrecarga de funciones: es cuando definimos varias versiones de la misma función, quiere decir que
    // la función puede recibir distintos parámetros, en base a la declaración que hagamos de ella.

    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envía el email a " + name + " (" + email + ")");
    }

    // la sobrecarga se puede configurar de todas las maneras que necesitemos, dependiendo del tipo de dato que
    // vayamos a usar. La sobrecarga de funciones debe configurarse siempre de la misma manera que la original, si
    // la principal no devuelve ningún dato, el resto de modificaciones no puede devolver datos.
    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email : emails) {
            sendEmaiToUser(email);
        }
    }

    // Funciones con retorno, son las que devuelven algún tipo de valor al sitio desde fueron llamadas
    public static boolean sendEmailWithState(String email){
        if (email.isEmpty()){
            return false;
        }
        sendEmaiToUser(email);
        return true;
    }
}
