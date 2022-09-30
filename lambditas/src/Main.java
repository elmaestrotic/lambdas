public class Main
{
    public static void main(String[] args) {
        boolean primo = true;
        int i=15;
        for (int j =2; j <=Math.sqrt(i); j++) {
            if (i % j == 0) {// si encuentra otro factor no es primo
                primo = false;
                break;//asi que nos salimos del bucle interno
            }
        }//fin del for interno
        if (primo){
            System.out.print("Es primo");//de lo contrario, si es primo, lo agregamos a la lista
        }else{
            System.out.print("No Es primo");//de lo contrario, si es primo, lo agregamos a la lista
        }
        primo = true;//reiniciamos la variable para el siguiente número
    }//fin del for externo
}