package br.com.danilo.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        // Fluxo  de Entrada com Arquivo
        FileInputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();

        // Percorrer todas as linhas do arquivo
        while (linha != null) {
                System.out.println(linha);
                linha = bufferedReader.readLine();
        }

        /*
             Fechando BufferedReader.
             Isso faz com que tanto o FileInputStream quanto o InputStreamReader sejam fechados automaticamente.
         */
        bufferedReader.close();
    }
}
