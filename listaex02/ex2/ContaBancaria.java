package listaex02.ex2;

public abstract class ContaBancaria {
    
    protected String cliente;
    protected int numConta;
    protected float saldo;

    public ContaBancaria() {
        this.cliente = "";
        this.numConta = 0;
        this.saldo = 0.0F;
    }
    public ContaBancaria(String cliente,int numConta,float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    public boolean sacar(float valor) {
        if(this.saldo-valor > 0){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getCliente() {
        return cliente;
    }
    public int getNumConta() {
        return numConta;
    }
    
    public abstract float getSaldo();

    public String toString() {
        return String.format(
            "/nCliente: %s\nNumero Conta: %d\nSaldo: %.2f", 
            this.cliente,this.numConta,getSaldo());
    }

}
