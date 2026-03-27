public class OperatorsEjercicios {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        // 1. Crea una variable con el resultado de cada operación aritmética.
        System.out.println("Operadores Aritméticos");
        System.out.println("----------------------");

        int sum = a + b;
        System.out.println("Suma: " + sum);
        int substraction = a - b;
        System.out.println("Resta:" + substraction);
        int multiplication = a * b;
        System.out.println("Multiplicación: " + multiplication);
        int division = a / b;
        System.out.println("División: " + division);
        int module = a % b;
        System.out.println("Resto de la división (Módulo): " + module);
        System.out.println(" ");

        // 2. Crea una variable para cada tipo de operación de asignación.
        System.out.println("Operadores de asignación");
        System.out.println("------------------------");

        int sumAssign = 7;
        sumAssign += 2;
        System.out.println("Suma y asigna +=: " + sumAssign);

        var subAssign = 7;
        subAssign -= 2;
        System.out.println("Resta y asigna -=: " + subAssign);

        var divAssign = 7;
        divAssign /= 2;
        System.out.println("Divide y asigna /=: " + divAssign);

        var multAssign = 7;
        multAssign *= 2;
        System.out.println("Multiplica y asigna *=: " + multAssign);

        var modAssign = 7;
        modAssign %= 2;
        System.out.println("Resto división (módulo) y asignación %=: " + modAssign);

        System.out.println(" ");

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de
        // comparación.
        System.out.println("Uso de diferentes operadores de comparación (true)");
        System.out.println("-------------------------------------------");

        System.out.println("a es mayor que b (a > b): " + (a > b));
        System.out.println("a es distinto de b (a != b): " + (a != b));
        System.out.println("b es menor o igual que a (b <= a): " + (b <= a));

        System.out.println(" ");


        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println("Uso de diferentes operadores de comparación (false)");
        System.out.println("-------------------------------------------");

        System.out.println("b es mayor que a (b > b): " + (b > a));
        System.out.println("a es igual a b (a == b): " + (a == b));
        System.out.println("b no es menor o igual que a ( !(b <= a)): " + !(b <= a));

        System.out.println(" ");

        // 5. Utiliza el operador lógico and.
        System.out.println("Usando operadores lógicos (And &&)");
        System.out.println("----------------------------------");

        System.out.println("a es mayor que b y b es menor que a: " + ((a > b) && (b < a)));
        System.out.println("a es mayor que b y b es igual a a: " + ((a > b) && (b == a)));
        // 6. Utiliza el operador lógico or.
        System.out.println("Usando operadores lógicos (Or ||)");
        System.out.println("----------------------------------");

        System.out.println("a es mayor que b o son distintos: " + ((a > b) || (b != a)));
        System.out.println("b es mayor que a o son iguales: " + ((b > a) || (b == a)));

        System.out.println(" ");

        // 7. Combina ambos operadores lógicos.
        System.out.println("Combinando operadores lógicos (&&, ||, !");
        System.out.println("----------------------------------------");

        var resultado = false;
        resultado = ((a > b) && (b < a)) || (b != a);
        System.out.println("a es mayor que b y b es menor que a, o b distinto de a: " + resultado);

        System.out.println(" ");

        // 8. Añade alguna negación.
        resultado = !(((a > b) && (b < a)) || (b != a));
        System.out.println("Falso que: a es mayor que b y b es menor que a, o b distinto de a: " + resultado);

        System.out.println(" ");

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println("Operadores unarios (3 ejemplos)");
        System.out.println("-------------------------------");

        var c = 1;
        System.out.println("La variable c inicialmente es 1.");
        System.out.println("El valor de la variable c lo convertimos a negativo (-c): " + (-c));
        System.out.println("Incrementamos el valor de c antes de su impresión (++c): " + (++c));
        System.out.println("Incrementamos el valor de c después de su impresión (c++): " + (c++));
        System.out.println("Valor de c después de usar (c++): " + c);

        System.out.println(" ");

        // 10. Combina operadores aritméticos, de comparación y lógicos
        System.out.println("Combinando operadores aritméticos, de comparación y lógicos");
        System.out.println("-----------------------------------------------------------");

        System.out.println("Los valores de a, b y c son: a=" + a + " b=" + b + " c=" + c);
        resultado = ((a + b) > (b -c)) && ((a - c) < (b + c));
        System.out.println("(a + b) es mayor que (b - c) y (a - c) es menor que (b + c) devuelve: " + resultado);

        /*
        * Viendo la solución de Brais, es importante tener en cuenta a la hora de hacer los ejercicios, el hecho
        * de intentar crear la solución en bases a ejemplos y problemas reales de la vida.
        * Por ejemplo:
        *
        * // 5. Utiliza el operador lógico and.
        System.out.println("\n=== OPERADOR LÓGICO AND (&&) ===");
        int age = 25;
        boolean hasLicense = true;
        boolean canDrive = age >= 18 && hasLicense;
        System.out.println("Edad: " + age + ", Tiene licencia: " + hasLicense);
        System.out.println("¿Puede conducir? " + canDrive);

        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));

        // 6. Utiliza el operador lógico or.
        System.out.println("\n=== OPERADOR LÓGICO OR (||) ===");
        boolean isWeekend = true;
        boolean isVacation = false;
        boolean canRest = isWeekend || isVacation;
        System.out.println("Es fin de semana: " + isWeekend + ", Es vacaciones: " + isVacation);
        System.out.println("¿Puede descansar? " + canRest);

        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));

        // 7. Combina ambos operadores lógicos.
        System.out.println("\n=== COMBINANDO AND Y OR ===");
        int temperature = 25;
        boolean isSunny = true;
        boolean isRaining = false;

        boolean isGoodWeather = (temperature > 20 && isSunny) || !isRaining;
        System.out.println("Temperatura: " + temperature + "°C, Soleado: " + isSunny + ", Llueve: " + isRaining);
        System.out.println("¿Es buen clima? " + isGoodWeather);

        * */
    }
}
