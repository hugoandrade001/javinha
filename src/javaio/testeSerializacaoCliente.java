package javaio;

import java.io.*;

public class testeSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Cliente cliente = new Cliente();
        //cliente.setNome("Nico");
        //cliente.setProfissao("Dev");
        //cliente.setCpf("23413131");

        //ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        //outputStream.writeObject(cliente);
        //outputStream.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getCpf());
    }
}
