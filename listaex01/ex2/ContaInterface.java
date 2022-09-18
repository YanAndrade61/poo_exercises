package listaex01.ex2;

import java.util.Scanner;

public class ContaInterface {
    
    public static void menu(Conta conta,Scanner sc){

        while (true) {
            System.out.print(
                "Menu usuario:\n"+
                "[0] - Sair\n"+
                "[1] - Depositar\n"+
                "[2] - Sacar\n"+
                "[3] - Ver saldo\n"+
                "Informe a opção: "
            );
            int op = sc.nextInt();
            switch (op) {
                case 0:
                    return;
                case 1:
                    System.out.println("Informe o valor do deposito: ");
                    conta.setSaldo(conta.getSaldo()+sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Informe o valor do saque: ");
                    conta.setSaldo(conta.getSaldo()-sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Saldo: R$"+conta.getSaldo());
                    break;
                default:
                    break;
            }
        }


    }

}
