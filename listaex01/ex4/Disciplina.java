package listaex01.ex4;

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

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return String.format(
            "{codigo: %d, nome: %s, valor: %.2lf }",
            this.codigo,this.nome,this.valor);
    }
}
