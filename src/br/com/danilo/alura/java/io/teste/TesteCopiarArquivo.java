package br.com.danilo.alura.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        FileOutputStream fileOutputStream = new FileOutputStream("lorem-copia.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String linha = bufferedReader.readLine();

        // Percorrer todas as linhas do arquivo
        while (linha != null) {
            // Escrever em cutro arquivo
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

        System.out.println("Terminado");
    }
}
