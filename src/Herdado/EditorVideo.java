package Herdado;

public class EditorVideo extends Funcionario{


    public EditorVideo(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o metodo do editor de video");
        return 150;
    }
}
