public class Aluno {
    
    private int registro;
    private String nome;

    public Aluno() {
        this.registro = 0;
        this.nome = "";
    }
    public Aluno(String nome,int registro) {
        this.registro = registro;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public int getRegistro() {
        return registro;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
}
