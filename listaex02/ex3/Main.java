package listaex02.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Geometria> formas = new ArrayList<Geometria>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print(
                "Menu geometria:\n"+
                "[0] - Sair\n"+
                "[1] - Circulo\n"+
                "[2] - Retangulo\n"+
                "[3] - Ver dados\n"+
                "Informe a opção: "
            );
            int op = sc.nextInt();
            switch (op) {
                case 0:
                sc.close();
                    return;
                case 1:
                    System.out.println("Insira o raio:");
                    formas.add(new Circulo(sc.nextDouble()));
                    break;
                case 2:
                    System.out.println("Insira a altura e largura:");
                    formas.add(new Retangulo(sc.nextDouble(),sc.nextDouble()));
                    break;
                case 3:
                    for (Geometria g : formas) {
                        System.out.printf("%s",g);
                    }
                    break;
                default:
                    break;
                }
            }
    }
}
