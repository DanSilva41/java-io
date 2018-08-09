package br.com.danilo.alura.java.io.teste;

import java.io.*;

/**
 *  Fluxo de Saida com Arquivo - alto nivel
 */
public class TesteEscrita03 {

    public static void main(String[] args) throws IOException {

//        FileOutputStream fileOutputStream = new FileOutputStream("lorem-escrito.txt");
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem-escrito02.txt"));

//        PrintStream printStream = new PrintStream("lorem-escrito03.txt");
        PrintWriter printWriter = new PrintWriter("lorem-escrito03.txt");

        printWriter.println("Aliquam erat volutpat. Praesent eleifend congue quam.");
        printWriter.println();
        printWriter.println("Sed interdum urna ipsum, sit amet molestie dui fermentum vel.");

        printWriter.close();

        System.out.println("Escrita terminada!");
    }
}
