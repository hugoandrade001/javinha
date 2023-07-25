package javaio;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //String nome = "Hugo";

        //ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objeto.bin"));

        //outputStream.writeObject(nome);
        //outputStream.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome= (String) ois.readObject();
        ois.close();
        System.out.println(nome);
    }
}
