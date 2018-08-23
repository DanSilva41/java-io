package br.com.danilo.alura.java.io.teste;

import java.io.*;
import java.util.*;

/**
 *  Fluxo de Entrada - Alto nivel
 */
public class TesteLeitura02 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        String linha;
        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US); // Definindo Locale para evitar diferenca de regiao
            linhaScanner.useDelimiter(",");
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String formatada = String.format(new Locale("pt-BR"),"%s - %04d-%d, %s: %05.2f",tipoConta , agencia , numero , titular , saldo);
            System.out.println(formatada);

//            String[] valores = linha.split(",");
//               System.out.println(valores);
//            System.out.println(Arrays.toString(valores));
//            System.out.println(valores[3]); // Titular
        }

        scanner.close();
    }
}
