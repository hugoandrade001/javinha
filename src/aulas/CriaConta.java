package aulas;

public class CriaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 200;
        conta1.agencia = 12;
        conta1.numero = 495;
        conta1.titular = "Hugo";

        conta1.saldo += 100;
        System.out.println(conta1.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 360;
        segundaConta.agencia = 10;
        segundaConta.numero = 560;
        segundaConta.titular = "Yago";
        System.out.println(segundaConta.titular);



    }
}
