public class MainGuardaChuva {
    public static void main(String[] args) {
        GuardaChuva guardaChuva = new GuardaChuva("Grande", "Preto", "Nylon");

        guardaChuva.abrir();
        System.out.println("Meu guarda-chuva me protege bem, pois o tamanho dele é "+guardaChuva.getTamanho());
    }
}
