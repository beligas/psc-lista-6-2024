// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

// . Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

  import java.util.Scanner;

  public class QUESTAO1 {
      public static void main(String[] args) {

          Scanner enterScanner = new Scanner(System.in);

          int[] vet = new int[5];

          System.out.println ("Digite cinco numeros inteiros");

          for (int i = 0; i < 5 ; i++) {
              vet[i] = enterScanner.nextInt();
          }

          System.out.println ("Os numeros digitados foram: ");
          for (int i = 0; i < 5 ; i++) {
              System.out.print(vet[i] + " ");
          }

          enterScanner.close();
      }
  }


  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
