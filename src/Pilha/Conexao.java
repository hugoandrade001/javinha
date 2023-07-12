package Pilha;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo");
        throw new IllegalStateException();
    }
    public void anda() {
        System.out.println("andando");
        throw new IllegalStateException();
    }


    @Override
    public void close()  {
        System.out.println("Fechando");
    }
}
