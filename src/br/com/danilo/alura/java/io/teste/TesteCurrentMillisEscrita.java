package br.com.danilo.alura.java.io.teste;

import java.io.*;

public class TesteCurrentMillisEscrita {

    public static void main(String[] args) throws IOException {

        long inicio = System.currentTimeMillis();

        // Fluxo de Saida com Arquivo
        OutputStream outputStream = new FileOutputStream("lorem-escrito04.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Ola");
        bufferedWriter.newLine();
        bufferedWriter.write("hahahaha");

        bufferedWriter.close();

        long fim = System.currentTimeMillis();

        System.out.println("Passaram "+ (fim - inicio) + " milissegundos");
        System.out.println("Escrita terminada!");
    }
}
