package Herdado;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Oi", "232323232", 2780);

        EditorVideo f = new EditorVideo("Huge", "243343456", 5000);

        EditorVideo ev = new EditorVideo("A", "3435435345345", 2500);
        ControleBonificacao controle  = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }
}
