package com.sistema.alunos;

public class Teste {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Aluno alunoUm = new Aluno(123, "Mark Zuckenberg", "Turma A", 2025);
        Aluno alunoDois = new Aluno(124, "Bill Gates", "Turma A", 2025);
        Aluno alunoTres = new Aluno(124, "Steve Jobs", "Turma B", 2025);

        sistema.adicionarAluno(alunoUm);
        sistema.adicionarAluno(alunoDois);
        sistema.adicionarAluno(alunoTres);

        alunoUm.adicionarNota("Matemática", 10);
        alunoUm.adicionarNota("História", 10);
        alunoUm.adicionarNota("Geografia", 3);
        
        alunoDois.adicionarNota("Matemática", 10);
        alunoDois.adicionarNota("História", 10);
        alunoDois.adicionarNota("Geografia", 0);
        
        alunoTres.adicionarNota("Matemática", 5);
        alunoTres.adicionarNota("História", 10);
        alunoTres.adicionarNota("Geografia", 7);

        alunoUm.mostrarNotas();
        alunoUm.calcularMedia();
        alunoUm.atualizarNota("História", 7);
        alunoUm.mostrarNotas();
        alunoUm.verificarSituacao();

        sistema.removerAluno(alunoUm);
        sistema.listarAlunos();
        sistema.listarAlunosPorTurma("Turma B");
        sistema.listarAlunosAprovados();



    }
}
