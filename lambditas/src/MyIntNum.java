//Ejemplo de utilizar una Referencia de método para un método de instancia.
//Una interfaz funcional para predicados numéricos que funciona con valores de tipo int.
/*interface IntPredicate {
    boolean test(int n);
}*/

public class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    //Devolver true si n es un factor de v.
    boolean esFactor(int n) {
        return (v % n) == 0;
    }
}//End Class MyIntNum


    class MethodReferenceInstance {
        public static void main(String[] args) {
            boolean result;
            MyIntNum myNum = new MyIntNum(12);
            MyIntNum myNum2 = new MyIntNum(16);

            //Aquí se crea una referencia de método a esFactor() en el objeto myNum.
            IntPredicate ip = myNum::esFactor;

            //Deespués, se utiliza para invocar esFactor() a través de test().
            result = ip.test(3);
            if (result) System.out.println("3 es factor de " + myNum.getNum());

            //En esta ocasión. se crea una referencia de método a isFacto en myNum2
            // y se utiliza para invocar esFactor() a través de test().
            ip = myNum2::esFactor;
            result = ip.test(3);
            if (!result) System.out.println("3 no es factor de " + myNum2.getNum());
        }
    }


