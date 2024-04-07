// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

// . Faça um Programa que leia um vetor de 10 números reais e mostre-os na
// ordem inversa.

  import java.util.Scanner;

  public class QUESTAO2 {
      public static void main(String[] args) {

          Scanner enterScanner = new Scanner(System.in);

          double[] vet = new double[10];

          System.out.println ("Digite dez numeros reais");

          for (int i = 0; i < 10 ; i++) {
              vet[i] = enterScanner.nextInt();
          }

          System.out.println ("Os numeros digitados foram: ");
          for (int i = 10 - 1; i >= 0 ; i--) {
              System.out.print(vet[i] + " ");
          }

          enterScanner.close();
      }
  }


  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
