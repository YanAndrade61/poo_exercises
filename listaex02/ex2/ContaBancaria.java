package listaex02.ex2;

public abstract class ContaBancaria {
    
    private String cliente;
    private int numConta;
    private float saldo;

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
    public abstract float getSaldo();


}
