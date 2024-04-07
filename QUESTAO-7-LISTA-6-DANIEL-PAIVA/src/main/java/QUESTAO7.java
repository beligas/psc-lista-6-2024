// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

// Faça um Programa que leia um vetor de 10 caracteres, e diga quantas
// consoantes foram lidas. Imprima as consoantes.

  import java.util.Scanner;

  public class QUESTAO7 {
      public static void main(String[] args) {

          Scanner enterScanner = new Scanner(System.in);

          int[] vet = new int[5];
          int soma = 0;
          int mult = 1;

          System.out.println ("Digite cinco numeros inteiros");

          for (int i = 0; i < 5 ; i++) {
            vet[i] = enterScanner.nextInt();
            soma += vet[i];
            mult *= vet[i];         
          }
        
          System.out.println ("Os numeros digitados foram: ");
          for (int i = 0; i < 5 ; i++) {
              System.out.print(vet[i] + " ");
          }
          System.out.println ("\nA soma dos numeros digitados é " + soma);
              
          System.out.println("\nA multiplicação dos numero digitados é de " +mult);
          

          enterScanner.close();
      }
  }


  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
