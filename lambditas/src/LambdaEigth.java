import java.io.*;

interface MyIOAction {
    boolean ioAction(Reader rdr)  throws IOException;
}

public class LambdaEigth {
    public static void main(String[] args) {

        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
        //Esta lambda de bloque generaría un error IOException.
        //Por lo tanto, es necesario especificar IOException en una cláusula throws de ioAction() en MyIOAction.
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read();//podría generar IOException
            //...
            return true;
        };
//Podríamos usar una expresión lambda para determinar si un archivo existe
    }
}