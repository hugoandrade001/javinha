package Herdado;

public class Cliente implements Autenticavel {


    public AutenticacaoUtil autenticador;

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
