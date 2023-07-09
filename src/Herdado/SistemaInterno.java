package Herdado;

public class SistemaInterno {

    private int senha = 2222;
    public void autentica(Autenticavel funcionarioAutenticavel) {
       boolean autentica = funcionarioAutenticavel.autentica(this.senha);
       if (autentica) {
           System.out.println("Pode entrar no sistema");
       } else {
           System.out.println("Não pode entrar no sistema");
       }
    }
}
