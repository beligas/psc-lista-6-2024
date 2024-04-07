// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

//  Faça um Programa que leia um vetor de 10 caracteres, e diga quantas
// consoantes foram lidas. Imprima as consoantes.

import java.util.Scanner;

public class QUESTAO4 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);

        char[] vetor = new char[10];

        System.out.println("Digite os 10 caracteres:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = enterScanner.next().charAt(0);
        }

        char[] consoantes = new char[10];
        char[] vogais = new char[10];
        int numConsoantes = 0;
        int numVogais = 0;

        for (int i = 0; i < 10; i++) {
            char c = vetor[i];
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vogais[numVogais] = c;
                    numVogais++;
                } else {
                    consoantes[numConsoantes] = c;
                    numConsoantes++;
                }
            }
        }

        System.out.println("As consoantes existentes sao");
        for (int i = 0; i < numConsoantes; i++) {
            System.out.print(consoantes[i] + " ");
        }
        System.out.println("\nContem : " + numConsoantes+ "consoantes");
      
      enterScanner.close();
    }
}