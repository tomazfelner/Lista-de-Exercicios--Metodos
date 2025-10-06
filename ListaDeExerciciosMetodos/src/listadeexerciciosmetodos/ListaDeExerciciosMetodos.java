package listadeexerciciosmetodos;
import java.util.Scanner;

/**
 * @author tomaz
 */

public class ListaDeExerciciosMetodos {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolha o numero do exercicio de 1 a 4: ");
        opcao = scanner.nextInt();
        
        if (opcao == 1){ // EXERCICIO 1
            
            int n1,n2;
            
            System.out.print("Digite o primeiro numero: ");
            n1 = scanner.nextInt();
            
            System.out.print("Digite o segundo numero: ");
            n2 = scanner.nextInt();
            
            ExercicioUm calculadoraDeSoma = new ExercicioUm();
            calculadoraDeSoma.soma(n1,n2);
            
        }else if (opcao == 2){ // EXERCICIO 2
            
            double n;
            
            System.out.print("Digite o numero que deseja calcular o cubo: ");
            n = scanner.nextDouble();
            
            ExercicioDois calculadorCubo = new ExercicioDois();
            calculadorCubo.cubo(n);
            
        }else if (opcao == 3){ // EXERCICIO 3
            
            int n;
            
            System.out.print("Escolha um numero: ");
            n = scanner.nextInt();
            
            ExercicioTres verificarParImpar = new ExercicioTres();
            ExercicioTres.parOuImpar(n);
            
        }else if (opcao == 4){ // EXERCICIO 4
            
            char e;
            
            System.out.print("Escolha um numero: ");
            e = scanner.next().charAt(0);
            
            ExercicioQuatro analisarEntrada = new ExercicioQuatro();
            analisarEntrada.analisar(e);
            
        }else{
            System.out.printf("Exercicio %d nao existe.",opcao);
        }
        
        scanner.close();
    }
    
}
