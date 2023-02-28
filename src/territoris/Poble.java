package territoris;

public class Poble {

    private int codi;
    private String nom;
    private int habitants;
    private double densitat;

    public int getCodiPoble()
    {
        return codi;
    }
    public void setCodiPoble(int codi)
    {
        this.codi = codi;
    }

    public String getNomPoble()
    {
        return nom;
    }
    public void setNomPoble(String nom)
    {
        this.nom = nom;
    }

    public int getHabitantsPoble()
    {
        return habitants;
    }
    public void setHabitantsPoble(int habitants)
    {
        this.habitants = habitants;
    }

    public double getDensitatPoble()
    {
        return densitat;
    }
    public void setDensitatPoble(double densitat)
    {
        this.densitat = densitat;
    }



    public Poble addPoble() {
        this.codi = addPoble().codi;
        this.nom = addPoble().nom;
        this.habitants = addPoble().habitants;
        this.densitat = addPoble().densitat;
        return null;
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
