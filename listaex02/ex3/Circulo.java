package listaex02.ex3;

public class Circulo implements Geometria{
    
    private double raio;

    public Circulo() {
        this.raio = 0.0;
    }
    public Circulo(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    public double area() {
        return 3.14 * this.raio * this.raio;
    }
    @Override
    public double comprimento() {
        return 2 * 3.14 * this.raio;
    }

    public String toString() {
        return String.format(
            "\nCirculo: Raio: %.2f, Area: %.2f, Comprimento: %.2f"
            , this.raio,area(),comprimento());
    }
}
