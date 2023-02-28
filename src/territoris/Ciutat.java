package territoris;

public class Ciutat {

    private String codi;
    private String nom;
    private int habitants;
    private double densitat;

    public int getCodiCiutat()
    {
        return codi;
    }
    public void setCodiCiutat(int codi)
    {
        this.codi = codi;
    }

    public String getNomCiutat()
    {
        return nom;
    }
    public void setNomCiutat(String nom)
    {
        this.nom = nom;
    }

    public int getHabitantsCiutat()
    {
        return habitants;
    }
    public void setHabitantsCiutat(int habitants)
    {
        this.habitants = habitants;
    }

    public double getDensitatCiutat()
    {
        return densitat;
    }
    public void setDensitatCiutat(double densitat)
    {
        this.densitat = densitat;
    }



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

