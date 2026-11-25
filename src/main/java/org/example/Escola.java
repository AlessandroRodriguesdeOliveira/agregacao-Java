package org.example;

import java.util.ArrayList;

public class Escola {
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private String nome;

    public Escola(String nome){
        this.nome = nome;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
