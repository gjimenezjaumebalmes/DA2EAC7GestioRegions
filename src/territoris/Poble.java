package territoris;

public class Poble {

    private String codi;
    private String nom;
    private int habitants;
    private double densitat;


    public static Poble addPoble() {
        
    }


    public void updatePoble() {
   
    }
    

    public void showPoble() {
        System.out.println("\nLes dades del poble amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nHabitants: " + habitants);
        System.out.print("\nDensitat: " + densitat);
    }
}
