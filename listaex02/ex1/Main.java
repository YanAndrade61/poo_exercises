package listaex02.ex1;

public class Main {
    
    public static void main(String[] args) {
        Funcionario func = new Funcionario("yan","yan@gmail.com");
        Assistente ass = new Assistente("yan","yan@gmail.com",123);
        Administrativo adm = new Administrativo("yan","yan@gmail.com",123,150,"dia");
        Tecnico tec = new Tecnico("yan","yan@gmail.com",123,150);

        func.exibeDados();
        ass.exibeDados();
        adm.exibeDados();
        tec.exibeDados();
    }

}
