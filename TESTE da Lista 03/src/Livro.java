public class Livro {
    public String Titulo;
    public String Autor;
    public int QuantPaginas;

    public void definirTitulo(String novoTitulo) {
        this.Titulo = novoTitulo;
    }

    public void definirAutor(String novoAutor) {
        this.Autor = novoAutor;
    }

    public void definirQuantPaginas(int novaQuantPaginas) {
        this.QuantPaginas = novaQuantPaginas;
    }

    public String verTitulo() {
        return this.Titulo;
    }

    public String verAutor() {
        return this.Autor;
    }

    public int verQuantPaginas() {
        return this.QuantPaginas;
    }
}
