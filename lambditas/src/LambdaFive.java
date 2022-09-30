//Uso de una interfaz funcional genérica
//una interfaz funcional que acepta dos parámetros de tipo generico y devuelve un boolean
interface TestGeneric<T>{
    boolean test(T n,T m);
        }

public class LambdaFive {
    public static void main(String[] args) {
        //Esta expresión lambda determina si un número es
        //un factor de otro
        TestGeneric<Integer> isFactor=(n,d)->(n%d)==0;

        if(isFactor.test(10,2))
            System.out.println("2 es un factor de 10");
        if(!isFactor.test(10,3))
            System.out.println("3 no es un factor de 10");
        System.out.println();

        //La siguiente expresión lambda determina si un Valor Double es un factor de otro
        TestGeneric<Double> isFactorD=(n,d)->(n%d)==0;

        if(isFactorD.test(212.0,4.0))
            System.out.println("4.0 es un factor de 212.0");
        System.out.println();

        //Esta expresión lambda devuelve true si el primer
        //argumento es menor que el segundo
        TestGeneric<Integer> lessThan=(n,m)->(n<m);
        if(lessThan.test(10,2))
            System.out.println("2 es menor que 10");
        if(!lessThan.test(10,2))
            System.out.println("10 no es menor que 2");
        System.out.println();

        //Esta expresión lambda devuelve true si una cadena hace parte de otra
        TestGeneric<String> isIn=(a,b)->a.indexOf(b)!=-1;
        String str="Esta es una prueba";
        if (isIn.test(str,"prueba"))
            System.out.println("prueba encontrada");
        else
            System.out.println("prueba no encontrada");
        if (isIn.test(str,"prueba2"))
            System.out.println("prueba2 encontrada");
        else
            System.out.println("prueba2 no encontrada");
    }
}
