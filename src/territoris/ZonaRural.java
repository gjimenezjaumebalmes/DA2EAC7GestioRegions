package territoris;

public class ZonaRural {    

    private String codi;
    private String nom;
    private int habitants;
    private double densitat;


    public static ZonaRural addZonaRural() {

    }

    public void updateZonaRural() {

    }
    

    public void showZonaRural() {
        System.out.println("\nLes dades de la zona rural amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nHabitants: " + habitants);
        System.out.print("\nDensitat: " + densitat);
    }
}
