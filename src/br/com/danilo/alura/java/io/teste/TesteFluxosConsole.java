package br.com.danilo.alura.java.io.teste;

import java.io.*;

public class TesteFluxosConsole {

    public static void main(String[] args) throws IOException {

        InputStream fileInputStream =  System.in; //Entrada pelo teclado
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        FileOutputStream fileOutputStream = new FileOutputStream("lorem-do-teclado.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String linha = bufferedReader.readLine();

        // Percorrer todas as linhas da entrada
        while (linha != null && !linha.isEmpty()) {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

        System.out.println("Terminado");
    }
}
