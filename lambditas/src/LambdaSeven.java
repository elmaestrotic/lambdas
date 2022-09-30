//Ejemplo de captura de una variable local  desde el ámbito contenedor
interface MyFunc {
    int func(int n);
}

public class LambdaSeven {
    public static void main(String[] args) {
        //La variable local que capturar
        int num = 10;
        MyFunc myLambda = (n) -> {
            //Este uso de num es correcto, ya que no se modifica dicha variable.
            int v = num + n;
            //Sin embargo, la siguiente línea es incorrecta, ya que se intenta modificar el valor de num
            //num++;
            return v;
        };
        //Usar la lambda. Se mostrará 18.
        System.out.println(myLambda.func(8));
        //la siguuiente línea  generarría un error, ya que eliminaría el estado eficazmente final de num.
          //num=9;
    }
}