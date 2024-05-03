public class MainChaves {
    public static void main(String[] args) {
        Chaves chaves = new Chaves("Média", "Quadrado", "Ferro");

        chaves.abrirFechaduras();
        System.out.println("Para abrir a fechadura dessa porta é necessário que tenha o formato " + chaves.getFormato());
    }
}
