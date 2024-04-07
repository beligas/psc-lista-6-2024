// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

// Faça um Programa que leia 4 notas, mostre as notas e a média na tela.

  import java.util.Scanner;

  public class QUESTAO3 {
      public static void main(String[] args) {

          Scanner enterScanner = new Scanner(System.in);

        double [] vet = new double[4];
        double media;
        double soma = 0;
        
          System.out.println ("Digite as quatros notas ");

          for (int i = 0; i < 4 ; i++) {
              vet[i] = enterScanner.nextInt();
            soma += vet[i];
          }
            media = soma / 4;
        
          System.out.println ("A media dessas quatro notas foi de " + media);
          

          enterScanner.close();
      }
  }


  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
