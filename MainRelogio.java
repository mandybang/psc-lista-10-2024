public class MainRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio("Cassio", "Digital", "Ferro");

        relogio.alarmar();
        System.out.println("Para relogio gosto da marca: "+relogio.getMarca());
    }
    
}
