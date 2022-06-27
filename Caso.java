public class Caso {

    public static void main (String[] args){

        // para el Switch, deberás crear la variable estacion, y distintos case para
        // las cuatro estaciones del año. Dependiendo del valor de la variable estacion se
        // deberá mandar un mensaje por consola informando de la estación en la que está.
        // También habrá que poner un default para cuando el valor de la variable no sea una estación.

        String estacion = "Invierno";

        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Primavera":
                System.out.print("Es Primavera");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("Este es el default");
        }
    }

}
