package br.edu.ifpi.dominio;
public class Certificado{
    Aluno aluno;
    Curso curso;
    public Certificado(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public Curso getCurso() {
        return curso;
    }
}