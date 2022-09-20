package listaex01.ex4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Matricula {
    
    private int numero;
    private Date data;
    private Aluno aluno;
    private List<Disciplina> disciplinas;

    public Matricula() {
        this.numero = 0;
        this.data = new Date(System.currentTimeMillis());
        this.aluno = null;
        this.disciplinas = new ArrayList<>();
    }
    public int getNumero() {
        return numero;
    }
    public Date getData() {
        return data;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float calculaTotal() {
        float total = 0.0F;
        for (Disciplina d : this.disciplinas) {
            total += d.getValor();         
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");

        sb.append(String.format("\n\tnumero: %d",this.numero));
        sb.append(String.format("\n\tdata: %s",SimpleDateFormat.getInstance().format(this.data)));
        sb.append(String.format("\n\taluno: %s",aluno));
        sb.append(String.format("\n\tdisciplinas: {"));
        
        for (Disciplina d : this.disciplinas) {
            sb.append(String.format("\n\t\t%s", d));            
        }
        sb.append(String.format("\n\t}\n\ttotal: %.2f\n}", calculaTotal()));

        return sb.toString();
    }
}
