package Herdado;

public class Administrador extends Funcionario {
    private AutenticacaoUtil autenticador;

    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.autenticador = new AutenticacaoUtil();
    }


    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        return 50;
    }
}
