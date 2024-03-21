import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.println("Digite o título do livro:");
        String Titulo = ler.nextLine();
        livro.definirTitulo(Titulo);
        
        System.out.println("Digite o autor do livro:");
        String Autor = ler.nextLine();
        livro.definirAutor(Autor);

        System.out.println("Digite a quantidade de páginas do livro:");
        int QuantPaginas = ler.nextInt();
        livro.definirQuantPaginas(QuantPaginas);

        System.out.println("Titulo:"+ livro.verTitulo());
        System.out.println("Autor"+ livro.verAutor());
        System.out.println("Quantidade de páginas"+ livro.verQuantPaginas());
    }
}
