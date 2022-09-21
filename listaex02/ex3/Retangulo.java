package listaex02.ex3;

public class Retangulo implements Geometria{
    
    private double altura;
    private double largura;

    public Retangulo() {
        this.altura = this.largura = 0.0;
    }
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public double getLargura() {
        return largura;
    }
    @Override
    public double area() {
        return this.largura * this.altura;
    }
    @Override
    public double comprimento() {
        return (this.altura*2) + (this.largura*2);
    }

    public String toString() {
        return String.format(
            "\nRetangulo: Altura: %.2f, Largura: %.2f, Area: %.2f, Comprimento: %.2f"
            , this.altura,this.largura,area(),comprimento());
    }
}
