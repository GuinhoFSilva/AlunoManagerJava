package com.sistema.alunos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int ra;
    private String nomeCompleto;
    private String turma;
    private int anoLetivo;
    private List<Nota> notas;

    public Aluno(int ra, String nomeCompleto, String turma, int anoLetivo){
        this.ra = ra;
        this.nomeCompleto = nomeCompleto;
        this.turma = turma;
        this.anoLetivo = anoLetivo;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(String disciplina, double nota){
        if(nota < 0 || nota > 10){
            System.out.println("A nota deve ser um número de 0 a 10!");    
        }else{
            notas.add(new Nota(disciplina, nota));
        }
    }

    public double calcularMedia(){
        double soma = 0;
        int i;
        for(i = 0; i < notas.size(); i++){
            double notaAtual = notas.get(i).getNota();
            soma += notaAtual;
        }
        double resultado = soma / i;
        // System.out.println("A média do aluno " + nomeCompleto + " é: " + resultado);
        return resultado;
    }

    public void mostrarNotas(){
        if(!notas.isEmpty()){
            System.out.println(notas);
        } else {
            System.out.println("Nenhuma nota registrada!");
        }
    }

    public void verificarSituacao(){
        double media = this.calcularMedia();
        if(media >= 7){
            System.out.println("O aluno " + nomeCompleto + " está aprovado! Sua média é: " + media);
        } else if (media >= 6){
            System.out.println("O aluno " + nomeCompleto + " está em recuperação! Sua média é: " + media);
        } else {
            System.out.println("O aluno " + nomeCompleto + " infelizmente foi reprovado D: Sua média é: " + media);
        }

    }

    public void atualizarNota(String disciplina, double novaNota){
        for(Nota nota : notas){
            if(nota.getDisciplina().equals(disciplina)){
                nota.setNota(novaNota);
                System.out.println("A nota de " + disciplina + " do aluno " + nomeCompleto + " foi alterada com sucesso! Nova nota: " + novaNota);
                break;
            }
        }
    }

    public int getRa() {
        return ra;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public String toString(){
        return "O Aluno " + nomeCompleto + " pertencente ao RA " + ra + " da turma " + turma + " do ano letivo de " + anoLetivo + " tem as seguintes notas: " + notas;
    }

}
