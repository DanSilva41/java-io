package br.com.danilo.alura.java.io.teste;

import java.io.*;

public class TesteFluxosConsole {

    public static void main(String[] args) throws IOException {

        InputStream inputStream =  System.in; //Entrada pelo teclado
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream outputStream = System.out;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
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
