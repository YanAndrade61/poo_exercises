package listaex02.ex1;

public class Tecnico extends Assistente{
    
    private float bonuSalarial;

    public Tecnico() {
        super();
        this.bonuSalarial = 0.0F;
    }
    public Tecnico(String nome, String email,int matricula,float bonuSalarial) {
        super(nome,email,matricula);
        this.bonuSalarial = bonuSalarial;
    }
    public void setBonuSalarial(float bonuSalarial) {
        this.bonuSalarial = bonuSalarial;
    }
    public float getBonuSalarial() {
        return bonuSalarial;
    }
    
    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.printf("\nBonus salarial: %.2f",this.bonuSalarial);
    }
}
