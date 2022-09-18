package listaex01.ex3;

import java.util.Scanner;

public class UsaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new BancoInterface(new Banco()).menu(sc);
        sc.close();
    }
}
