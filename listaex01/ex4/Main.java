package listaex01.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;
    private List<Matricula> matriculas;

    public Main() {
        alunos = new ArrayList<>();
        disciplinas = new ArrayList<>();
        matriculas = new ArrayList<>();
    }
    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
    public void addMatricula(Matricula matricula){
        this.matriculas.add(matricula);
    }
    public Aluno buscarAluno(int registro){
        for (Aluno aluno : this.alunos)
            if(aluno.getRegistro() == registro)
                return aluno;
        return null;
    }
    public Disciplina buscarDisciplina(int codigo){
        for (Disciplina d : this.disciplinas)
            if(d.getCodigo() == codigo)
                return d;
        return null;
    }
    public Matricula buscarmatricula(int numero){
        for (Matricula matricula : this.matriculas)
            if(matricula.getNumero() == numero)
                return matricula;
        return null;
    }

    public static void main(String[] args) {
        
        Main main = new Main();
        Matricula m = new Matricula();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print(
                "Menu usuario:\n"+
                "[0] - Sair\n"+
                "[1] - Cadastrar aluno\n"+
                "[2] - Cadastrar disciplina\n"+
                "[3] - Cadastrar matricula\n"+
                "[4] - Visualizar matricula\n"+
                "Informe a opção: "
            );
            int op = sc.nextInt();
            switch (op) {
                case 0:
                    sc.close();
                    return;
                case 1:
                    System.out.println("Informe o registro e nome do aluno: ");
                    main.addAluno(new Aluno(sc.nextInt(), sc.next()));
                    break;
                case 2:
                    System.out.println("Informe o codigo, nome  e valor da disciplina: ");
                    main.addDisciplina(new Disciplina(sc.nextInt(), sc.next(), sc.nextFloat()));
                    break;
                case 3:
                    m = new Matricula();
                    Aluno a = null;
                    
                    System.out.println("Informe o numero de matricula: ");
                    m.setNumero(sc.nextInt());

                    System.out.println("Informe o registro do aluno: ");
                    a = main.buscarAluno(sc.nextInt());
                    if(a == null)
                        System.out.println("Nao existe aluno com este registro");
                    else
                        m.setAluno(a);
                    while (true) {
                        System.out.println("Informe o codigo da disciplina ou 0 para sair: ");
                        int codigo = sc.nextInt();
                        if(codigo == 0)break;
                        Disciplina d = main.buscarDisciplina(codigo);
                        if(d == null)
                            System.out.println("Nao existe disciplina com este codigo");
                        else
                            m.getDisciplinas().add(d);
                    }
                    main.addMatricula(m);

                    break;
                case 4:
                    System.out.println("Informe o numero da matricula: ");
                    m = main.buscarmatricula(sc.nextInt());
                    if (m == null)
                        System.out.println("Nao existe matricula com esse numero");
                    else
                        System.out.println(m);
                    break;
                default:
                    break;
            }
        }
    }
}
