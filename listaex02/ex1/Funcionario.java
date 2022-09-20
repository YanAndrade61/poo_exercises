package listaex02.ex1;

public class Funcionario {
    
    private String nome;
    private String email;

    public Funcionario() {
        this.nome = "";
        this.email = "";
    }
    public Funcionario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void exibeDados(){
        System.out.printf("\nNome: %s \nEmail: %s",this.nome,this.email);
    }

}
