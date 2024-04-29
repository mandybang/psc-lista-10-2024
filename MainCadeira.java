/**
 * 1. Cadeira
- Características: Material, cor, altura, peso
- Ações: Sentar, empilhar, mover
 */
public class MainCadeira {
    public static void main(String[] args) {
        Cadeira cadeira = new Cadeira("Madeira", "Preta", 1.40, 05);
        
        cadeira.sentar();
        System.out.println("O material dela é " + cadeira.getMaterial());
        
    }
}
