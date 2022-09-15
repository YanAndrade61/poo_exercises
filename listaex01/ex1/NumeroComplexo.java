package listaex01.ex1;

public class NumeroComplexo{

    private double a;
    private double b;

    public NumeroComplexo() {
        this.a = 0.0;
        this.b = 0.0;
    }

    public NumeroComplexo(double a,double b) {
        this.a = a;
        this.b = b;
    }

    public NumeroComplexo soma(NumeroComplexo that){
        return new NumeroComplexo(
            this.a + that.a,
            this.b + that.b );
    }
    
    public NumeroComplexo produto(NumeroComplexo that){
        return new NumeroComplexo(
            this.a*that.a - this.b*that.b,
            this.b*that.a + this.a*that.b);
    }

    public NumeroComplexo conjugado(){
        return new NumeroComplexo( this.a, -this.b);
    }

    public String toString(){
        return this.a + " + "+this.b+"i";
    }
    
}