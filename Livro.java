public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private String genero;

    public Livro(String titulo, String autor, int numeroPaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void ler() {
        System.out.println("Lendo o livro...");
    }

    public void folhear() {
        System.out.println("Folheando o livro...");
    }

    public void marcarPaginas() {
        System.out.println("Marcando páginas do livro...");
    }
}
