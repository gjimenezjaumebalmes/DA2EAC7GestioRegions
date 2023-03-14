package territoris;

import java.util.Scanner;
import territoris.Ciutat;
import territoris.Poble;
import territoris.ZonaRural;

public class Poble {

    private int codi;
    private String nom;
    private int habitants;
    private double densitat;

    public Poble(int codi, String nom, int habitants, double densitat) {
        this.codi = codi;
        this.nom = nom;
        this.habitants = habitants;
        this.densitat = densitat;
    }

    public void setCodiPoble(int codi) {
        this.codi = codi;
    }

    public int getCodiPoble() {
        return codi;
    }

    public void setNomPoble(String nom) {
        this.nom = nom;
    }

    public String getNomPoble() {
        return nom;
    }

    public void setHabitantsPoble(int habitants) {
        this.habitants = habitants;
    }

    public int getHabitantsPoble() {
        return habitants;
    }

    public void setDensitatPoble(double densitat) {
        this.densitat = densitat;
    }

    public double getDensitatPoble() {
        return densitat;
    }

    public static Poble addPoble() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntrodueix les dades del nou poble:");

        System.out.print("Codi: ");
        int codi = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nom: ");
        String nom = scanner.nextLine();

        System.out.print("Habitants: ");
        int habitants = scanner.nextInt();

        System.out.print("Densitat: ");
        double densitat = scanner.nextDouble();

        return new Poble(codi, nom, habitants, densitat);
    }

    public void updatePoble() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduiu les dades actualitzades del poble amb codi " + codi + ":");
        System.out.print("Introduiu el nom del poble (premeu enter si no voleu modificar): ");
        String nom = scanner.nextLine();
        if (!nom.equals("")) {
            setNomPoble(nom);
        }

        System.out.print("Introduiu el nombre d'habitants del poble (premeu enter si no voleu modificar): ");
        String habitantsStr = scanner.nextLine();
        if (!habitantsStr.equals("")) {
            int habitants = Integer.parseInt(habitantsStr);
            setHabitantsPoble(habitants);
        }

        System.out.print("Introduiu la densitat de població del poble (premeu enter si no voleu modificar): ");
        String densitatStr = scanner.nextLine();
        if (!densitatStr.equals("")) {
            double densitat = Double.parseDouble(densitatStr);
            setDensitatPoble(densitat);
        }
    }


    public void showPoble() {
        System.out.println("\nLes dades del poble amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nHabitants: " + habitants);
        System.out.print("\nDensitat: " + densitat);
    }
}
