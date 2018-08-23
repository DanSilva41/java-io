package br.com.danilo.alura.java.io.teste;

import br.com.danilo.alura.java.io.teste.herdado.Cliente;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Danilo");
        cliente.setCpf("999.999.999-99");
        cliente.setProfissao("Full Stack Developer");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin")); // lanca NotSerializableException
        oos.writeObject(cliente);
        oos.close();

//        String nome = "Danilo Silva";

        // Serializar
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        oos.writeObject(nome);
//        oos.close();

        //Deserialiizar
//        ObjectInputStream ois = new ObjectInputStream((new FileInputStream("objeto.bin")));
//        String objetoRetornado = (String) ois.readObject();
//        ois.close();
//
//        System.out.println(objetoRetornado);
    }
}
