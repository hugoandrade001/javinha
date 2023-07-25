package javaio;

import java.util.Arrays;
import java.util.Scanner;

public class testeScannerEntrada {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner("contas.txt");

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);


            String [] valores = linha.split(",");
            System.out.println(Arrays.toString(valores));
        }

        scanner.close();

    }
}
