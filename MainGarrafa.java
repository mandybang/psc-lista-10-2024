public class MainGarrafa {
    public static void main(String[] args) {
        GarrafaAgua garrafaAgua = new GarrafaAgua(2, "Plastico", "Redonda");

        garrafaAgua.beber();
        System.out.println("Minha garrafa d'agua suportar " +garrafaAgua.getCapacidade()+ " litros.");
    }
}
