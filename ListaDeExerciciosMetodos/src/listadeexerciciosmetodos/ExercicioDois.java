package listadeexerciciosmetodos;

/**
 * @author tomaz
 */

public class ExercicioDois {
    public static void cubo(double numero){
        double resultado;
        resultado = Math.pow(numero, 3);
        
        System.out.printf("O cubo de %.3f = %.3f.",numero,resultado);
    }
}
