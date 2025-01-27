public class Main {
    public static void main(String[] args) {


        /* ➔ Ejercicio de Calentamiento
         Primero creamos un array de 10 posiciones:
         ◆ sumar: Una función con valor de retorno y con parámetro(s) que devuelva su suma
         de los valores del array.
         ◆ mostrarResultado: Una función sin valor de retorno y con parámetro(s) que imprima
         el resultado de la suma.
         ◆ restaConResultado: Una función sin valor de retorno y con parámetro(s) que muestre
         el resultado de restar todos los elementos del array.
         ◆ saludar: Una función sin valor de retorno y con parámetro(s) que imprima un saludo X
         veces (si, X es el parámetro).*/



        //saludar(5);

        int i = 0;
        //int[] numeros = new int[10];
        int[] numeros = {7,1,3,5,7,4,1,4,6,7};

        //suma
        int capturar_el_valor_que_retorna_la_funcion = sumar(numeros);
        System.out.println("La suma de los valores del array es:" + capturar_el_valor_que_retorna_la_funcion);

        //resta
        restaConResultado(numeros);

    }


    public static void restaConResultado(int[ ] cualquiera){

        int acumular = 0;
        for (int i = 0; i <cualquiera.length ; i++) {

            acumular = acumular - cualquiera[i];

        }
        System.out.println("La resta de los números es:" +acumular);
    }

    public static int sumar(int[] loquesea){
        int almacenar = 0;
        for (int i = 0; i < loquesea.length ; i++) {

            almacenar = almacenar + loquesea[i];
        }
        return almacenar;
    }

    public  static void saludar(int x){
        for (int i = 0; i < x ; i++) {
            System.out.println("Hola");

        }
    }


}