package listaex01.ex1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite os termos a e b do 1o numero complexo: ");
        NumeroComplexo nc1 = new NumeroComplexo(sc.nextDouble(), sc.nextDouble());

        System.out.println("\nDigite os termos a e b do 2o numero complexo: ");
        NumeroComplexo nc2 = new NumeroComplexo(sc.nextDouble(), sc.nextDouble());

        sc.close();

        System.out.printf("\n(%s) + (%s) = (%s)",nc1,nc2,nc1.soma(nc2));
        System.out.printf("\n(%s) + (%s) = (%s)",nc1,nc2,nc1.produto(nc2));
        System.out.printf("\n(%s) + (%s) = (%s)",nc1,nc2,nc1.conjugado());
    }

}
