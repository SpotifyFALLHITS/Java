public class Disciplina{
    private String nome;
    private Faculdade faculdade;
    private Professor professor;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setFaculdade(Faculdade faculdade){
        this.faculdade = faculdade;
    }
    public Faculdade getFaculdade(){
        return this.faculdade;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public Professor getProfessor(){
        return this.professor;
    }
}
