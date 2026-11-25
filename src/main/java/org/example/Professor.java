package org.example;

import java.util.ArrayList;

public class Professor {
    ArrayList<Disciplina> disciplinas;
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplinas(Disciplina disciplinas) {
        this.disciplinas.add(disciplinas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
