public class Hacer {

    // Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile
    // sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    //
    // Incrementar el valor de la variable en uno cada vez que se ejecute.
    //
    // Mostrarlo por pantalla cada vez que se ejecute.
    //
    // Para el bucle Do While, deberás crear la misma estructura que en el While, pero
    // solo se debe ejecutar una vez.

    public static void main (String[] args){

       int numeroWhile = 0;

       do {
           System.out.println(numeroWhile);
           numeroWhile = numeroWhile + 1;
       }  while (numeroWhile < 0);

    }

}
