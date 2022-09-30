public class LambdasThree {
    interface StringTest{
        boolean test(String s1,String s2);
    }

    public static void main(String[] args) {
        StringTest isIn=(a,b)->a.indexOf(b)!=-1;
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
