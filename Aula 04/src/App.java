import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Universidade universidade = new Universidade();
        Faculdade faculdade = new Faculdade();
        Departamento departamento = new Departamento();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Disciplina disciplina = new Disciplina();
        JOptionPane ler = new JOptionPane();
        Area area = new Area();
        ServidorAdministrativo servidorAdministrativo = new ServidorAdministrativo();

        aluno.setNome(ler.showInputDialog("Qual o nome do aluno?\n"));
        area.setNome(ler.showInputDialog("Qual area dele?\n"));
        departamento.setNome("Luís");
        disciplina.setNome("Programação");
        disciplina.setFaculdade(faculdade); 
        disciplina.setProfessor(professor);
        faculdade.setNome("Estácio");
        faculdade.setDepartamento(departamento);
        professor.setNome("Anderson");
        professor.setDepartamento(departamento);
        servidorAdministrativo.setNome("Gov");
        universidade.setFaculdade(faculdade);
        universidade.setNome("USP");

        ler.showMessageDialog(null,"Aluno:"+ aluno.getNome()+
        "\nArea:"+ area.getNome()+
        "\nDepartamento:"+ departamento.getNome()+
        "\nDisciplina:"+ disciplina.getNome()+
        "\nDisciplina da faculdade:"+ disciplina.getFaculdade().getNome()+
        "\nDisciplina do professor:"+ disciplina.getProfessor().getNome()+
        "\nFaculdade:"+ faculdade.getNome()+
        "\nDepartamento na faculdade:"+ faculdade.getDepartamento().getNome()+
        "\nProfessor:"+ professor.getNome()+
        "\nDepartamento do professor:"+ professor.getDepartamento().getNome()+
        "\nServidor Administrativo:"+ servidorAdministrativo.getNome()+
        "\nUniversidade da faculdade:"+ universidade.getFaculdade().getNome()+
        "\nNome da Universidade:"+ universidade.getNome()
        );
    }
}