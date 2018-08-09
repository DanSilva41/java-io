package br.com.danilo.alura.java.io.teste;

import java.io.*;

/**
 *  Fluxo de Saida com Arquivo - alto nivel
 */
public class TesteEscrita02 {

    public static void main(String[] args) throws IOException {

//        FileOutputStream fileOutputStream = new FileOutputStream("lorem-escrito.txt");
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        // Forma mais alto ni'vel
        FileWriter fileWriter = new FileWriter("lorem-escrito02.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Aliquam erat volutpat. Praesent eleifend congue quam.");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("Sed interdum urna ipsum, sit amet molestie dui fermentum vel.");


        bufferedWriter.close();
        fileWriter.close();

        System.out.println("Escrita terminada!");
    }
}
