package br.com.danilo.alura.java.io.teste;

import java.io.*;
import java.util.*;

public class TesteProperties {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        // Escrita de arquivo .properties
//        properties.setProperty("login", "alura");
//        properties.setProperty("senha", "alurapass");
//        properties.setProperty("endereco", "www.alura.com.br");
//
//        // Grava o arquivo
//        properties.store(new FileWriter("arquivo-config.properties"), "de teste..");

        // Leitura de arquivo .properties
        properties.load(new FileReader("arquivo-config.properties"));
        String login = properties.getProperty("login");
        String senha = properties.getProperty("senha");
        String endereco = properties.getProperty("endereco");

        System.out.println(login + " , " + senha + " , " + endereco);

        System.out.println("Terminado");
    }
}
