// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

// /Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
// Armazene os números pares no vetor PAR e os números IMPARES no vetor
// ímpar. Imprima os três vetores..

import java.util.Scanner;

public class QUESTAO5 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);
        int[] num = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            num[i] = enterScanner.nextInt();
        }

        int numPares = 0;
        int numImpares = 0;
        for (int i = 0; i < 20; i++) {
            if (num[i] % 2 == 0) {
                pares[numPares] = num[i];
                numPares++;
            } else {
                impares[numImpares] = num[i];
                numImpares++;
            }
        }

        System.out.println("Números inseridos:");
        for (int i = 0; i < 20; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < numPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < numImpares; i++) {
            System.out.print(impares[i] + " ");
        }

        enterScanner.close();
    }
}

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
