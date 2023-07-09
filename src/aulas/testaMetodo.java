package aulas;

import java.util.Locale;

public class testaMetodo {
    public static void main(String[] args) {
        Conta contaDoHugo = new Conta();
        contaDoHugo.saldo = 100;
        contaDoHugo.deposita(50);


        boolean conseguiuRetirar = contaDoHugo.saca(20);
        System.out.println(contaDoHugo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaLaura = new Conta();
        contaDaLaura.deposita(1000);


        boolean transferiuCerto = contaDaLaura.transfere(300, contaDoHugo);
        if(transferiuCerto) {
            System.out.println("Deu certo a transferencia");
        } else {
            System.out.println("Não deu certo a transferencia");
        }
        System.out.println(transferiuCerto);
        System.out.println(contaDaLaura.saldo);
        System.out.println(contaDoHugo.saldo);

        contaDoHugo.titular = "hugo";
        System.out.println(contaDoHugo.titular);

    }
}
