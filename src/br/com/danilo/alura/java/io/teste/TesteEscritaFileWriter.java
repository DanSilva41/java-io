package br.com.danilo.alura.java.io.teste;

import java.io.*;

/**
 *  Fluxo de Saida com Arquivo - alto nivel
 */
public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

//        FileOutputStream fileOutputStream = new FileOutputStream("lorem-escrito.txt");
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        // Forma mais alto ni'vel
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem-escrito02.txt"));

        bufferedWriter.write("Aliquam erat volutpat. Praesent eleifend congue quam.");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("Sed interdum urna ipsum, sit amet molestie dui fermentum vel.");


        bufferedWriter.close();

        System.out.println("Escrita terminada!");
    }
}
