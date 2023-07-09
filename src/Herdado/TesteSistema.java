package Herdado;

public class TesteSistema {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("B", "90899889", 2334334);
        gerente.setSenha(222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);
        sistemaInterno.autentica(cliente);


    }
}
