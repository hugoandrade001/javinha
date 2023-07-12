package Pilha;

public class TestaConexao {
    public static void main(String[] args) {
        try  (Conexao conexao = new Conexao() ) {
            conexao.anda();
        } catch (IllegalStateException exception) {
            System.out.println("Erro");
        }

    }
}
