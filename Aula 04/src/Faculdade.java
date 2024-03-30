public class Faculdade{
    private String codigo;
    private String nome;
    private String endereco;
    private Departamento departamento;
        
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
    public Departamento getDepartamento(){
        return this.departamento;
    }
}
