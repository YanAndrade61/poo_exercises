package listaex01.ex3;

import java.util.Scanner;

import listaex01.ex2.Conta;
import listaex01.ex2.ContaInterface;

public class BancoInterface {
    
    private Banco banco;

    public BancoInterface(Banco banco){
        this.banco = banco;
    }

    public void menu(Scanner sc){

        while (true) {
            System.out.print(
                "Menu usuario:\n"+
                "[0] - Sair\n"+
                "[1] - Abrir uma nova conta\n"+
                "[2] - Selecionar conta\n"+
                "Informe a opção: "
            );
            int op = sc.nextInt();
            switch (op) {
                case 0:
                    return;
                case 1:
                    System.out.println("Informe o numero e saldo da conta: ");
                    Conta conta = new Conta(sc.nextInt(),sc.nextDouble());
                    this.banco.addConta(conta);
                    break;
                case 2:
                    System.out.println("Informe o numero da conta: ");
                    int numero = sc.nextInt();
                    for (Conta c : banco.getContas()) {
                        if (c.getNumero() == numero) {
                            ContaInterface.menu(c, sc);
                        }
                    }
                    break;
                default:
                    break;
            }
        }


    }
}
