package territoris;

import java.util.Scanner;
import territoris.Ciutat;
import territoris.Poble;
import territoris.ZonaRural;

public class Ciutat {

    private String codi;
    private String nom;
    private int habitants;
    private double densitat;


    public Ciutat(String codi, String nom, int habitants, double densitat) {
        this.codi = codi;
        this.nom = nom;
        this.habitants = habitants;
        this.densitat = densitat;
    }

    public void setCodiCiutat(String codi) {
        this.codi = codi;
    }

    public String getCodiCiutat() {
        return codi;
    }

    public void setNomCiutat(String nom) {
        this.nom = nom;
    }

    public String getNomCiutat() {
        return nom;
    }

    public void setHabitantsCiutat(int habitants) {
        this.habitants = habitants;
    }

    public int getHabitantsCiutat() {
        return habitants;
    }

    public void setDensitatCiutat(double densitat) {
        this.densitat = densitat;
    }

    public double getDensitatCiutat() {
        return densitat;
    }

    public static Ciutat addCiutat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntrodueix les dades de la nova ciutat:");

        System.out.print("Codi: ");
        String codi = scanner.nextLine();

        System.out.print("Nom: ");
        String nom = scanner.nextLine();

        System.out.print("Habitants: ");
        int habitants = scanner.nextInt();

        System.out.print("Densitat: ");
        double densitat = scanner.nextDouble();

        return new Ciutat(codi, nom, habitants, densitat);
    }


    public void updateCiutat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduiu les dades actualitzades de la ciutat amb codi " + codi + ":");
        System.out.print("Introduiu el nom de la ciutat (premeu enter si no voleu modificar): ");
        String nom = scanner.nextLine();
        if (!nom.equals("")) {
            setNomCiutat(nom);
        }

        System.out.print("Introduiu el nombre d'habitants de la ciutat (premeu enter si no voleu modificar): ");
        String habitantsStr = scanner.nextLine();
        if (!habitantsStr.equals("")) {
            int habitants = Integer.parseInt(habitantsStr);
            setHabitantsCiutat(habitants);
        }

        System.out.print("Introduiu la densitat de població de la ciutat (premeu enter si no voleu modificar): ");
        String densitatStr = scanner.nextLine();
        if (!densitatStr.equals("")) {
            double densitat = Double.parseDouble(densitatStr);
            setDensitatCiutat(densitat);
        }

    }

    public void showCiutat() {
        System.out.println("\nLes dades de la ciutat amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nHabitants: " + habitants);
        System.out.print("\nDensitat: " + densitat);
    }
}

