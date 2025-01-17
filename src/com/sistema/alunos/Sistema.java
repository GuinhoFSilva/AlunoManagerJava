package com.sistema.alunos;

import java.util.HashSet;
import java.util.Set;

public class Sistema {
    private Set<Aluno> alunos = new HashSet<>();

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        System.out.println("O aluno " + aluno.getNomeCompleto() + " foi removido do nosso sistema");
        alunos.remove(aluno);
    }

    public void listarAlunos(){
        System.out.println(alunos);
    }

    public void listarAlunosPorTurma(String turma){
        for(Aluno aluno : alunos){
            if(aluno.getTurma().equals(turma)){
                System.out.println(aluno.getNomeCompleto());
            } else if(aluno.getTurma().isEmpty()){
                System.out.println("Não há nenhuma turma cadastrada!");
            }
        }
    }

    public void listarAlunosAprovados(){
        System.out.println("Alunos aprovados: ");
        for(Aluno aluno : alunos){
            if(aluno.calcularMedia() > 6){
                System.out.println(aluno.getNomeCompleto());
            }
        }
    }
}
