public class Condicionales {

    static void main(String[] args) {
        // Sentencia if - else if - else

        var age = 18;

        if (age > 18){
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir los 18");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        // Sentencia swich - case

        var day = 5;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("No es Lunes, Martes o Miércoles");
        }
    }
}
