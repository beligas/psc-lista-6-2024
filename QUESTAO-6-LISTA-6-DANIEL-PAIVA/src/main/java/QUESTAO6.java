// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class QUESTAO6 {
  public static void main(String[] args) {
    Scanner enterScanner = new Scanner(System.in);

    double[][] notas = new double[10][4];
    double[] medias = new double[10];
    int alunosAprovados = 0;

    for (int i = 0; i < 10; i++) {
      System.out.println("Digite as quatro notas do aluno " + (i + 1) + ":");
      for (int j = 0; j < 4; j++) {
        notas[i][j] = enterScanner.nextDouble();
      }
    }

    for (int i = 0; i < 10; i++) {
      double soma = 0;
      for (int j = 0; j < 4; j++) {
        soma += notas[i][j];
      }
      medias[i] = soma / 4;
    }

    for (int i = 0; i < 10; i++) {
      if (medias[i] >= 7.0) {
        alunosAprovados++;
      }
    }

    System.out.println("Número de alunos com média maior ou igual a 7.0: " + alunosAprovados);
    enterScanner.close();
  }
}

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }
