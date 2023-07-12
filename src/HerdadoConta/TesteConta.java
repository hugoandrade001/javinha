package HerdadoConta;

public class TesteConta {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100);


        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
        contaPoupanca.deposita(200);


        System.out.println("O valor antes de transferir: " + contaCorrente.getSaldo());
        contaCorrente.transfere(10, contaPoupanca);
        System.out.println("o Valor depois de transferir: " + contaCorrente.getSaldo());
        System.out.println("CC: " + contaCorrente.getSaldo());
        System.out.println("CP: " + contaPoupanca.getSaldo());

    }
}
