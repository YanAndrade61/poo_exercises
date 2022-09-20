package listaex02.ex2;

public class ContaEspecial extends ContaBancaria{
    
    protected float limite;

    public ContaEspecial() {
        super();
        limite = 0.0F;
    }
    public ContaEspecial(String cliente,int numConta,float saldo,float limite) {
        super(cliente,numConta,saldo);
        this.limite = limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    public float getLimite() {
        return limite;
    }

    @Override
    public boolean sacar(float valor) {
        if(this.saldo - valor < this.saldo - limite)
            return false;
        this.saldo -= valor;
        return true;
    }

    @Override
    public float getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return String.format(
            "%s\nLimite: %.2f",
            super.toString(),this.limite);
    }

}
