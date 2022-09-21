package listaex02.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;


public class Contas {
    public static void main(String[] args) {
        
        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();
        Scanner sc = new Scanner(System.in);

        

        while (true) {
            System.out.print(
                "Menu banco:\n"+
                "[0] - Sair\n"+
                "[1] - Criar conta\n"+
                "[2] - Entrar na conta\n"+
                "Informe a opção: "
            );
            int op = sc.nextInt();
            switch (op) {
                case 0:
                sc.close();
                    return;
                case 1:
                    System.out.println("Informe o tipo de conta 0-Poupanca 1-Especial: ");
                    int tipo = sc.nextInt();
                    System.out.println("Informe nome, numero da conta, saldo, rendimento/limite: ");
                    if(tipo == 0)
                        contas.add(new ContaPoupanca(sc.next(),sc.nextInt(),sc.nextFloat(),sc.nextFloat()));       
                    else
                        contas.add(new ContaEspecial(sc.next(),sc.nextInt(),sc.nextFloat(),sc.nextFloat()));       
                    break;
                case 2:
                    System.out.println("Informe o numero da conta: ");
                    int numConta = sc.nextInt();
                    for (ContaBancaria c : contas){
                        if (c.getNumConta() == numConta) {
                            menuUsuario(c,sc);
                        }
                        
                    }
                    break;
                default:
                    break;
            }
        }

    }

    public static void menuUsuario(ContaBancaria c,Scanner sc){
        
        while (true) {
            System.out.print(
                "Menu usuario:\n"+
                "[0] - Sair\n"+
                "[1] - Depositar\n"+
                "[2] - Sacar\n"+
                "[3] - Ver dados\n"+
                "Informe a opção: "
            );
            int op = sc.nextInt();
            switch (op) {
                case 0:
                    return;
                case 1:
                    System.out.println("Informe o valor a depositar: ");
                    c.depositar(sc.nextFloat());
                    break;
                case 2:
                    System.out.println("Informe o valor a sacar: ");
                    c.sacar(sc.nextFloat());
                    break;
                case 3:
                    System.out.printf("%s",c);
                    break;
                default:
                    break;
            }
        }

    }
}
