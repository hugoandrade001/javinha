package Projeto;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente hugo = new Cliente();
        hugo.nome = "Hugo";
        hugo.cpf = "222.222.222-22";
        hugo.profissao = "Programador";

        Conta contaDoHugo = new Conta();
        contaDoHugo.deposita(120);

        contaDoHugo.titular = hugo;
        System.out.println(contaDoHugo.titular.nome);
    }
}
