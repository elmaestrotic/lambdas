//Usar la misma interfaz funcional con 3 lambdas diferentes
//Una interfaz funcional que acepta dos parámetros int y devuelve un boolean
interface NumericTest{
    boolean test(int n,int d);
}

public class LambdasTwo {
    public static void main(String[] args) {
        //esta expresión lambda determina si un número es
        //un factor de otro
        NumericTest isFactor=(n,d)->(n%d)==0;

        if(isFactor.test(10,2))
            System.out.println("2 es un factor de 10");
        if(!isFactor.test(10,3))
            System.out.println("3 no es un factor de 10");
        System.out.println();

        //Esta expresión lambda devuelve true si el primer
        //argumento es menor que el segundo
        NumericTest lessThan=(n,m)->(n<m);
        if(lessThan.test(10,2))
            System.out.println("2 es menor que 10");
        if(!lessThan.test(10,2))
            System.out.println("10 no es menor que 2");
        System.out.println();

        //Esta expresión lambda devuelve true si los valores absolutos
        //de los argumentos son iguales
        NumericTest absEqual=(n,m)->(n<0?-n:n)==(m<0?-m:m);
        if(absEqual.test(4,-4))
            System.out.println("4 y -4 tienen el mismo valor absoluto");
        if(!lessThan.test(4,-5))
            System.out.println("4 y -5 no tienen el mismo valor absoluto");
        System.out.println();
    }
}
