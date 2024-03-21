import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Livro livro = new Livro();
        
        livro.definirTitulo("Uma crônica de uma morte anunciada");
        livro.definirAutor("Gabriel García Márquez");
        livro.definirQuantPaginas(136);
        
        System.out.println("Título: " + livro.verTitulo());
        System.out.println("Autor: " + livro.verAutor());
        System.out.println("Quantidade de páginas: " + livro.verQuantPaginas() + "\n");
        
        Livro.Emprestimo emprestimo = livro.new Emprestimo("2024-03-16", "2024-03-23", livro);
        
        System.out.println("Data do empréstimo: " + emprestimo.lerData_emprestimo());
        System.out.println("Data de devolução prevista: " + emprestimo.lerData_devolucao_prevista());
        System.out.println("Código do livro: " + emprestimo.lerCodigoLivro());
        
        emprestimo.lerData_devolucao_efetiva("2024-03-22");
        System.out.println("\nLivro devolvido em: " + emprestimo.lerData_devolucao_efetiva());
    }
}
