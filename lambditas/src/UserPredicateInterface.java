//Ejemplo d ecómo utlizar la interface funcional Predicate.
import java.util.function.Predicate;
public class UserPredicateInterface {
    public static void main(String[] args) {
        //Ejemplo de una expresión lambda que utiliza la interface funcional Predicate.
        Predicate<Integer> isEven = (n) -> (n % 2) == 0;
        if (isEven.test(4)) System.out.println("4 es par");
        if (!isEven.test(5)) System.out.println("5 es impar");

        //Ejemplo de una expresión lambda que utiliza la interface funcional Predicate.
        Predicate<String> isLongerThan5 = (s) -> s.length() > 5;
        if (isLongerThan5.test("Hola")) System.out.println("Hola es mayor que 5");
        if (!isLongerThan5.test("Adios")) System.out.println("Adios no es mayor que 5");
    }
}

