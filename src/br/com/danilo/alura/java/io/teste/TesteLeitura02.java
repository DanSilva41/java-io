package br.com.danilo.alura.java.io.teste;

import java.io.*;
import java.util.*;

/**
 *  Fluxo de Entrada - Alto nivel
 */
public class TesteLeitura02 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("contas.csv"));
        String linha = scanner.nextLine();
        System.out.println(linha);
    }
}
