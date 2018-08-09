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
        fileWriter.write("Aliquam erat volutpat. Praesent eleifend congue quam.");
        fileWriter.write(System.lineSeparator()); //
        fileWriter.write(System.lineSeparator());
        fileWriter.write("Sed interdum urna ipsum, sit amet molestie dui fermentum vel.");

        fileWriter.close();

        System.out.println("Escrita terminada!");
    }
}
