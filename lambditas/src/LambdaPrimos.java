import java.util.ArrayList;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

//programa que obtiene una lista de números primos entre un rango dado
//utilizando una expresión lambda por Alexander Narváez
interface listNumeros {
    ArrayList func(int a, int b);//interfaz funcional que devuelve un arraylist
}
public class LambdaPrimos {
    static  boolean primo;//variable booleana que indica si un número es primo
    public static void main(String[] args) {
        ArrayList<Integer> primos = new ArrayList<Integer>();
        listNumeros p = (a, b) -> {//creamos la referencia a la interfaz funcional y le estamos asignando una expresión lambda
            primo = true;
            if (a == 1 || a == 0) {//controlamos rango inferior no válido
                a=2;
            }
            for (int i = a; i <= b; i++) {//primer ciclo lo uso para moverme entre el rango a,b
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) { // si encuentra otro factor no es primo
                        primo = false;
                        break;//asi que nos salimos del bucle interno
                    }
                }//fin del for interno 
                if (primo) {
                    primos.add(i);//de lo contrario, si es primo, lo agregamos a la lista
                }//fend if
                primo = true;//reiniciamos la variable para el siguiente número
            }//fin del for externo
            return primos;//las lambdas de cuerpo siempre llevan return
        };//fin de la  lambda de cuerpo
//finalmente muestra la lista de primos obtenidos con la lambda
        System.out.println("La lista de primos comprendidos entre 1 y 100 es: \n" + p.func(1, 100));
    }//fin del método main

    /*private static boolean isPrime(int number) {
        IntPredicate isDivisible = index -> number % index == 0;
        return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
    }  */

}//fin de la clase
