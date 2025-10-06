package listadeexerciciosmetodos;

/**
 * @author tomaz
 */

public class ExercicioTres {
    public static void parOuImpar(int numero){
        if (numero % 2 == 0){
            System.out.printf("O numero %d e par.",numero);
        }else{
            System.out.printf("O numero %d e impar.",numero);
        }
    }
}
