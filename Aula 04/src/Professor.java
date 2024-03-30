public class Professor extends Pessoa{
    private Departamento departamento;
    private Area areAtuacao;

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
    public Departamento getDepartamento(){
        return this.departamento;
    }
    public void setareAtuacao(Area areaAtuacao){
        this.areAtuacao = areaAtuacao;
    }
    public Area getareAtuacao(){
        return this.areAtuacao;
    }
}
