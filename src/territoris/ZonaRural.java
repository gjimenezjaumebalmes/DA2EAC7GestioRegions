package territoris;

public class ZonaRural {    

    private String codi;
    private String nom;
    private int habitants;
    private double densitat;

    public int getCodiZonaRural()
    {
        return codi;
    }
    public void setCodiZonaRural(int codi)
    {
        this.codi = codi;
    }

    public String getNomZonaRural()
    {
        return nom;
    }
    public void setNomZonaRural(String nom)
    {
        this.nom = nom;
    }

    public int getHabitantsZonaRural()
    {
        return habitants;
    }
    public void setHabitantsZonaRural(int habitants)
    {
        this.habitants = habitants;
    }

    public double getDensitatZonaRural()
    {
        return densitat;
    }
    public void setDensitatZonaRural(double densitat)
    {
        this.densitat = densitat;
    }


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
