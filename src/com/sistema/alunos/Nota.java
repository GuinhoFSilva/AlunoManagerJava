package com.sistema.alunos;

public class Nota {
    private String disciplina;
    private double nota;

    public Nota(String disciplina, double nota){
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public double getNota() {
        return nota;
    }

    public String toString(){
        return disciplina + " " + nota;
    }


}
