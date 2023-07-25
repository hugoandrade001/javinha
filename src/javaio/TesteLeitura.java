package javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura  {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();
        while(linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
