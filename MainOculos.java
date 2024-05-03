public class MainOculos {
    public static void main(String[] args) {
        Oculos oculos = new Oculos("Lente de grau", "Gatinho", "Preto");

        oculos.limpar();
        System.out.println("Não enxergo, preciso do meu oculos limpo para que possa enxergar com minha " +oculos.getTipoLente());
    }
    
}
