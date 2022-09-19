public class Disciplina {
    
    private int codigo;
    private String nome;
    private double valor;
    
    public Disciplina() {
        this.codigo = 0;
        this.nome = "";
        this.valor = 0.0;
    }

    public Disciplina(int codigo,String nome,Double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

}
