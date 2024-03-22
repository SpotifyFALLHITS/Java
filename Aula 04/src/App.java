public class App{
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Teste1","Teste2","Teste3","Teste4");

    pessoa.setNome("Teste5");
    pessoa.setEndereco("Teste6");
    pessoa.setEmail("Teste7");
    pessoa.setTelefone("Teste8");

    System.out.println("Nome: "+ pessoa.getNome());
    System.out.println("Endereço: "+ pessoa.getEndereco());
    System.out.println("Email: "+ pessoa.getEmail());
    System.out.println("Telefone: "+ pessoa.getTelefone());
    }
}