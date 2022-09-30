interface StringFunc {
    String func(String s);
}
public class LambdaSix {
    //Este método tiene una  interfaz funcional como tipo de su primer parámetro.
    // Por lo tanto, se puede pasar una referencia a cualquier instancia de dicha interfaz, incluidas las instancias creadas por una expresión lambda.
    // El tipo de la interfaz debe coincidir con el tipo del parámetro. En este caso, StringFunc.
    //El segundo parámetro especifica el string a operar.

    static String changeString(StringFunc sf,String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr="Lambda Espressions Expand Java";
        String outStr;
        System.out.println("Esta es la cadena de entrada: "+inStr);

        //Pasar una expresión lambda como el primer argumento.
        //Esta expresión lambda invierte el contenido de la cadena
        //y la asigna a una variable de referencia de tipo StringFunc.
        StringFunc reverse=(str)->{//lambda de bloque. Observe que estamos pasando como 1er parametro al método estatico changeString una expresión lambda
            String result="";

            for(  int i=str.length()-1;i>=0;i--)
                result+=str.charAt(i);
            return result;
        };
        outStr=changeString(reverse,inStr);//Observe que estamos pasando como 1er parámetro al método estático changeString
        // una referencia a la Interfaz Funcional StringFunc creada con la expresión lambda -->reverse

        System.out.println("Salida: "+outStr);

        /*Lo anterior también se puede hacer de la siguiente manera:
        outStr=changeString((str)->{//lambda de bloque. Observe que estamos pasando como 1er parametro al método estatico changeString una expresión lambda
            String result="";
            int i;
            for(i=str.length()-1;i>=0;i--)
                result+=str.charAt(i);
            return result;
        },inStr);
        System.out.println("Salida: "+outStr);
         */

        //Pasar una expresión lambda como el primer argumento y pasar la cadena de entrada como el segundo argumento.
        //Esta expresión lambda reemplaza espacios por guiones.
        outStr=changeString((str)->str.replace(' ','-'),inStr);
        System.out.println("Salida: "+outStr);

        //Pasar una expresión lambda como el primer argumento de changeString().
        //Esta expresión lambda elimina espacios.
        outStr=changeString((str)->str.replace(" ",""),inStr);
        System.out.println("Salida: "+outStr);

        //Pasar una expresión lambda como el primer argumento.
        //Esta expresión lambda convierte la cadena a mayúsculas.
        outStr=changeString((str)->str.toUpperCase(),inStr);
        System.out.println("Salida: "+outStr);
    }
}

