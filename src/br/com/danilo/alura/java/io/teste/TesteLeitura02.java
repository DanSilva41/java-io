package br.com.danilo.alura.java.io.teste;

import java.io.*;
import java.util.*;

/**
 *  Fluxo de Entrada - Alto nivel
 */
public class TesteLeitura02 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        String linha;
        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US); // Definindo Locale para evitar diferenca de regiao
            linhaScanner.useDelimiter(",");
            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
//            String[] valores = linha.split(",");
//               System.out.println(valores);
//            System.out.println(Arrays.toString(valores));
//            System.out.println(valores[3]); // Titular
        }

        scanner.close();
    }
}
