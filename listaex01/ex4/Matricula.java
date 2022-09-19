import java.text.SimpleDateFormat;
import java.util.Date;

package listaex01.ex4;
import javax.xml.crypto.Data;

import listaex01.ex4.Disciplina;


public class Matricula {
    
    private int numero;
    private Date data;
    private Aluno aluno;
    private Disciplina disciplinas[];

    public Matricula() {
        this.numero = 0;
        this.data = new Date(System.currentTimeMillis());
        this.aluno = null;
        this.disciplinas = new Disciplina[10];
    }


    public double calculaTotal() {
        double total = 0.0;
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
        sb.append(String.format("\n\t}\n\ttotal: %.2lf", calculaTotal()));
    }
}
