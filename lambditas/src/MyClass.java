//Ejemplo de referencia de constructor.
//MyFunc es una interfaz funcional que tiene un método que devuelve uan referencia a MyClass.
interface MyFunction {
    MyClass func(String s);
}


public class MyClass {
    private String str;

    //Este constructor acepta un argumento.
    MyClass(String s) {
        str = s;
    }

    //Es el constructor por defecto.
    MyClass() {
        str = "";
    }

    //...
    String getStr() {
        return str;
    }
}
    class ConstructorRefDemo {
        public static void main(String[] args) {
            //Crea una referencia al constructor de MyClass.
            //Como func() en MyFunc acepta a un argumento, new
            //hace referencia al constructor con parámetros de myClass,
            //no al predeterminado.
            MyFunction myClassCons = MyClass::new;//Una referencia de constructor.

            //Crear una instancia de MyClass mediante el operador de referencia de constructor.
            MyClass mc = myClassCons.func("Testing");


            //Usar la instancia de MyClass recién creada por el constructor de referencia.
            System.out.println("str en mc es " + mc.getStr());
        }
    }

