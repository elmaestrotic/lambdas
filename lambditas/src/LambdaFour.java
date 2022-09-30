//Una expresion lambda de bloque que busca el factor positivo más pequeño de un número entero

interface NumericFunc {
    int func(int n);
}

public class LambdaFour {
    public static void main(String[] args) {
    //Esta lambda de bloque devuelve el factor positivo más pequeño de un número entero
        NumericFunc smallestF = (n) -> {
            int result = 1;
            //Obtener el valor absoluto de n
            n = n < 0 ? -n : n;

            //obtener el factor positivo más pequeño
            for (int i = 2; i <= n / i; i++) {
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };
        System.out.println("El factor positivo más pequeño de 12 es " + smallestF.func(12));
        System.out.println("El factor positivo más pequeño de 11 es " + smallestF.func(11));


    }
}
