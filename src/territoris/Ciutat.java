package territoris;


public class Ciutat {

    private String codi;
    private String nom;
    private int habitants;
    private double densitat;


    public static Ciutat addCiutat() {
      
    }

    public void updateCiutat() {
    
    }
    

    public void showCiutat() {
        System.out.println("\nLes dades de la ciutat amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nHabitants: " + habitants);
        System.out.print("\nDensitat: " + densitat);
    }
}
