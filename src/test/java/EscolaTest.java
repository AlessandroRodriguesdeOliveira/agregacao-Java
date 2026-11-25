import org.example.*;

import java.util.ArrayList;

public class EscolaTest {
    public static void main(String[] args) {
         Aluno aluno = new Aluno("mara");
         Aluno aluno2 = new Aluno("joao");

        Professor professor = new Professor("carlos");
        Disciplina disciplina = new Disciplina("MAtematica");

        professor.adicionarDisciplinas(disciplina);

        disciplina.addAluno(aluno);
        disciplina.addAluno(aluno2);

       Escola escola = new Escola("EJM");
       escola.addAluno(aluno);
       escola.addAluno(aluno2);
       escola.addProfessor(professor);

       ArrayList<Professor> professores =  escola.getProfessores();

       for(Professor pro : professores){
           System.out.println(pro.getNome());
       }

       GeradorRelatorio gerar = new GeradorRelatorio();


       gerar.emitirRelatorio(aluno);


    }
}
