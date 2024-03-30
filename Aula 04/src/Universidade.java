public class Universidade{
    private String nome;
    private String endereco;
    private Faculdade faculdade;

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
    public void setFaculdade(Faculdade faculdade){
        this.faculdade = faculdade;
    }
    public Faculdade getFaculdade(){
        return this.faculdade;
    }
}
