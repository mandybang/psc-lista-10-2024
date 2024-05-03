public class MainLivros {
    public static void main(String[] args) {
        Livro livro = new Livro("O pacto de Dalila", "S.M. Silveira", 498, "Dark Romance");

        livro.folhear();
        System.out.println("Estou lendo o livro " + livro.getTitulo());
    }
    
}
