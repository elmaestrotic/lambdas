

//Dos Sencillas expresiones lambdas


interface MyValue{//interfaz funcional
    double getValue();//sólo tiene 1 y sólo un método abstracto
}

interface MyParamValue{//interfz funcional
    double getValue(double v);//sólo tiene 1 y sólo un método abstracto
}


public class LambdasOne {
    public static void main(String[] args) {
        MyValue  myVal;//referencia a una interfaz funcional
        //Al asignarle a myVal(una expresión lambda), se crea una instancia de la clase anónima
        //que implementa la interfaz funcional MyValue y define el método getValue()
        myVal =()->3.146;//una sencilla expresión lambda.

        //invocar el método getValue(), proporcionado por la expresión lambda
        //previamente asignada a myValue

        System.out.println("Imprimir el valor definido por la lambda: "+myVal.getValue());

        //Crear ahora una expresión lambda con parametros y asignarle a
        //una referencia a MyParamValue. Esta expresión lambda
        //calcula el reciproco de su argumento
        MyParamValue myPvalue=(n)->1.0/n;//Una expresión lambda con un parámetro

        //Invocar el método getValue(v) a través de la referencia a  myPvalue.
        System.out.println("Imprimir el reciproco de 4 a través de lambda: "+myPvalue.getValue(4));
        System.out.println("Imprimir el reciproco de 8 a través de lambda: "+myPvalue.getValue(8));

        //una expresión lambda debe ser compatible con el método abstracto
        //definito por la interfaz funcional. Por ello lo siguinete no es válido:
        //myVal=()->"Hola mundo";//Error, String no es compatible con el método getValue() que es double
        //myPvalue=()->Math.random()*n;//Error,Falta el parámetro n


    }

}
