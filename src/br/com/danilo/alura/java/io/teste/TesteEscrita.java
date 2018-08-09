package br.com.danilo.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        // Fluxo de Saida com Arquivo
        FileOutputStream fileOutputStream = new FileOutputStream("lorem-escrito.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Aliquam erat volutpat. Praesent eleifend congue quam.");
        bufferedWriter.newLine();
        bufferedWriter.write("Sed interdum urna ipsum, sit amet molestie dui fermentum vel.");

        bufferedWriter.close();

        System.out.println("Escrita terminada!");
    }
}
