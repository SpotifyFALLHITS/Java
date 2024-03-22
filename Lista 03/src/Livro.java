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

    public class Emprestimo {
        public String data_emprestimo;
        public String data_devolucao_prevista;
        public String data_devolucao_efetiva;
        public int codigoLivro;
        public Livro livro;

        public Emprestimo(String data_emprestimo, String data_devolucao_prevista, Livro livro) {
            this.data_emprestimo = data_emprestimo;
            this.data_devolucao_prevista = data_devolucao_prevista;
            this.livro = livro;
            this.codigoLivro = 543758;
        }

        public void lerData_devolucao_efetiva(String data_devolucao_efetiva) {
            this.data_devolucao_efetiva = data_devolucao_efetiva;
        }

        public String lerData_emprestimo() {
            return data_emprestimo;
        }

        public String lerData_devolucao_prevista() {
            return data_devolucao_prevista;
        }

        public String lerData_devolucao_efetiva() {
            return data_devolucao_efetiva;
        }

        public int lerCodigoLivro() {
            return codigoLivro;
        }

        public Livro lerLivro() {
            return livro;
        }
    }

    public void emprestimo(Livro livro, String data_emprestimo, String data_devolucao_prevista) {
        Emprestimo emprestimo = new Emprestimo(data_emprestimo, data_devolucao_prevista, livro);
        System.out.println("Livro emprestado cadastrado com sucesso:");
        System.out.println("Título: " + livro.verTitulo());
        System.out.println("Autor: " + livro.verAutor());
        System.out.println("Quantidade de páginas: " + livro.verQuantPaginas());
    }
}
