package listaex01.ex2;

import java.util.Scanner;

public class UsaConta {
    
    public static void main(String[] args) {
        Conta conta = new Conta(123,10.0);
        Scanner sc = new Scanner(System.in);
        ContaInterface.menu(conta, sc);
        sc.close();        
    }
}
