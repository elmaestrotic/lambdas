//Ejemplo de Referencia de método para un método estático.
//Una interfaz funcional para predicados numéricos que funciona con valores de tipo int.
interface IntPredicate {
    boolean test(int n);
}
public class MyIntPredicates {

    //Esta clase define 3 métodos estáticos que comprueban un entero con una condición.
    //Un método estático que devuelve true si el número es primo.
    static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++) {
            if ((n % i) == 0)
                return false;
        }

        return true;
    }

    //Un método estático que devuelve true si  un número es par.
    static boolean esPar(int n) {
        return (n % 2) == 0;
    }

    //Un método estático que devuelve true si eun número es positivo.
    static boolean esPositivo(int n) {
        return (n >0);
    }

}//end Class MyIntPredicates

class MethodReference {
    //Este método tiene una interfaz funcional como tipo de su
    //primer parámetro. Por ello se puede pasar una referencia a cualquier instancia de dicha interfaz,
    // incluida una instancia creada por una referencia de método.
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        //Aquí, se pasa a NumTest() una referencia de método a esPrimo().
        result = numTest(MyIntPredicates ::esPrimo, 17);
        if (result) System.out.println("17 es primo.");

        //Tra ello, se utiliza una referencia de método a esPar().
        result = numTest(MyIntPredicates ::esPar, 12);
        if (result) System.out.println("12 es par.");

        //Finalmente, se utiliza una referencia de método a esPositivo().
        result = numTest(MyIntPredicates ::esPositivo, 11);
        if (result) System.out.println("11 es positivo.");
    }

}


