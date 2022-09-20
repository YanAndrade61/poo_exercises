package listaex02.ex1;

public class Administrativo extends Assistente{
    
    private float addNoturno;
    private String turno;

    public Administrativo() {
        super();
        this.addNoturno = 0.0F;
        this.turno = "";
    }
    public Administrativo(String nome, String email,int matricula,float addNoturno,String turno) {
        super(nome,email,matricula);
        this.addNoturno = addNoturno;
        this.turno = turno;
    }

    public float getAddNoturno() {
        return addNoturno;
    }
    public String getTurno() {
        return turno;
    }
    public void setAddNoturno(float addNoturno) {
        this.addNoturno = addNoturno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.printf("\nAdicional noturno: %.2f\nTurno: %s",this.addNoturno,this.turno);
    }
    
}
