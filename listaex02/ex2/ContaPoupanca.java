package listaex02.ex2;

public class ContaPoupanca extends ContaBancaria{
    
    private float rendimento;

    public ContaPoupanca() {
        super();
        rendimento = 0.0F;
    }
    public ContaPoupanca(String cliente,int numConta,float saldo,float rendimento) {
        super(cliente,numConta,saldo);
        this.rendimento = rendimento;
    }

    public float getRendimento() {
        return rendimento;
    }
    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public float getSaldo() {
        this.saldo *= 1 + this.rendimento;
        return this.saldo;
    }

    @Override
    public String toString() {
        return String.format(
            "%s\nTaxa de rendimento: %.2f",
            super.toString(),this.rendimento);
    }

}
