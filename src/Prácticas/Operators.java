public class Operators {
    public static void main(String[] args){
        // Operadores en Java
        // Aritméticos
        var a = 5;
        var b = 3;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo (Resto de la división): " + (a % b));

        //Asignación
        a = b; //Asigna el valor de "b" a "a"
        System.out.println("Valor de a: " + a);
        a += 1; // a = a + 1
        System.out.println("Valor de a: " + a);
        a -= 1; // a = a - 1
        System.out.println("Valor de a: " + a);
        a *= 2; //Multiplica y asigna
        System.out.println("Valor de a: " + a);
        a /= 2; //Divide y asigna
        System.out.println("Valor de a: " + a);
        a %= 2; //Calcúla el módulo y asigna el valor
        System.out.println("Valor de a: " + a);

        //Relacionales o de comparación. Devuelven true o false.

        System.out.println(a == b); //Compara si son iguales
        System.out.println(a != b); //Compara si son distintos
        System.out.println(a > b); //Compara si a es mayor que b
        System.out.println( a >= b); // Compara si a es mayor o igual que b
        System.out.println(a < b); // Compara si a es menor que b
        System.out.println(a <= b); //Compara si a es menor o igual que b

        //Operadores lógicos. Combinar operaciones booleanas.

        //and (Y) -- && --> Devuelve true solo si las dos expresiones comparadas son true
        System.out.println(false && false); // false
        System.out.println(false && true); // false
        System.out.println(true && false); // false
        System.out.println(true && true); // true

        //or (O) -- || --> Devuelve true solo si alguna de las expresiones comparadas es true.
        System.out.println(false || false); // false
        System.out.println(false || true); // true
        System.out.println(true || false); // true
        System.out.println(true || true); // true

        //not (no) -- ! --> Niega el resultado de la expresión, si es true devuelve false y viceversa.
        System.out.println(!true); // false
        System.out.println(!false); //true

        //Operadores unarios
        //Son operadores que modifican el valor de una sola variable

        System.out.println(b); // Devuelve 3, valor actual de la variable
        // Convertir el número a número positivo (si fuese negativo)
        System.out.println(+b); // Devuelve 3
        // Convertir el número a negativo
        System.out.println(-b); // Devuelve -3
        // Incrementar el valor antes de imprimirlo o asignarlo, dependiendo donde se use
        System.out.println(++b); // Devuelve 4 y b vale 4
        // Incrementar el valor después de imprimirlo o asignarlo
        System.out.println(b++); // Devuelve 4 y b ahora vale 5
        System.out.println(b);
        // Decrementar el valor antes de imprimirlo o asignarlo
        System.out.println(--b); // Devuelve 4 y b ahora vale 4
        // Decrementar el valor después de imprimirlo o asignarlo
        System.out.println(b--); // Devuelve 4 y b ahora vale 3
        System.out.println(b); // Devuelve 3

        /*
        * El operador !(Not) también es un operador unario
        * */


    }
}
