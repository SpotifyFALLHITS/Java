public class Pessoa{
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public Pessoa(){
    }
    public Pessoa(String nome, String endereco, String email, String telefone){
    this.nome = nome;
    this.endereco = endereco;
    this.email = email;
    this.telefone = telefone;
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
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
}