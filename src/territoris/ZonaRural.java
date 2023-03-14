package territoris;

import java.util.Scanner;
import territoris.Ciutat;
import territoris.Poble;
import territoris.ZonaRural;

public class ZonaRural {

    private int codi;
    private String nom;
    private int habitants;
    private double densitat;

    public ZonaRural(int codi, String nom, int habitants, double densitat) {
        this.codi = codi;
        this.nom = nom;
        this.habitants = habitants;
        this.densitat = densitat;
    }

    public void setCodiZonaRural(int codi) {
        this.codi = codi;
    }

    public int getCodiZonaRural() {
        return codi;
    }

    public void setNomZonaRural(String nom) {
        this.nom = nom;
    }

    public String getNomZonaRural() {
        return nom;
    }

    public void setHabitantsZonaRural(int habitants) {
        this.habitants = habitants;
    }

    public int getHabitantsZonaRural() {
        return habitants;
    }

    public void setDensitatZonaRural(double densitat) {
        this.densitat = densitat;
    }

    public double getDensitatZonaRural() {
        return densitat;
    }

    public static ZonaRural addZonaRural() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntrodueix les dades de la nova Zona Rural:");

        System.out.print("Codi: ");
        int codi = scanner.nextInt();

        System.out.print("Nom: ");
        String nom = scanner.nextLine();

        System.out.print("Habitants: ");
        int habitants = scanner.nextInt();

        System.out.print("Densitat: ");
        double densitat = scanner.nextDouble();

        ZonaRural newZone = new ZonaRural(codi, nom, habitants, densitat);
        return newZone;
    }

    public void updateZonaRural() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduiu les dades actualitzades de la Zona Rural amb codi " + codi + ":");
        System.out.print("Introduiu el nom de la Zona Rural (premeu enter si no voleu modificar): ");
        String nom = scanner.nextLine();
        if (!nom.equals("")) {
            setNomZonaRural(nom);
        }

        System.out.print("Introduiu el nombre d'habitants de la Zona Rural (premeu enter si no voleu modificar): ");
        String habitantsStr = scanner.nextLine();
        if (!habitantsStr.equals("")) {
            int habitants = Integer.parseInt(habitantsStr);
            setHabitantsZonaRural(habitants);
        }

        System.out.print("Introduiu la densitat de població de la Zona Rural (premeu enter si no voleu modificar): ");
        String densitatStr = scanner.nextLine();
        if (!densitatStr.equals("")) {
            double densitat = Double.parseDouble(densitatStr);
            setDensitatZonaRural(densitat);
        }

    }


    public void showZonaRural() {
        System.out.println("\nLes dades de la Zona Rural amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nHabitants: " + habitants);
        System.out.print("\nDensitat: " + densitat);
    }
}
