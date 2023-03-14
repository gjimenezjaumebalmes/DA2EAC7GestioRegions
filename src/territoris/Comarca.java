package territoris;

import java.util.Scanner;
import territoris.Ciutat;
import territoris.Poble;
import territoris.ZonaRural;

public class Comarca {

    private String nom;
    private String capital;
    private Poble[] pobles = new Poble[100];
    private int pPobles = 0; // Priemra posició buida de l'array de pobles
    private Ciutat[] ciutats = new Ciutat[100];
    private int pCiutats = 0; // Priemra posició buida de l'array de ciutats
    private ZonaRural[] zonesRurals = new ZonaRural[100];
    private int pZonesRurals = 0; // Priemra posició buida de l'array de zones rurals
    private static final Scanner DADES = new Scanner(System.in);

    public Comarca(String nom, String capital) {
        this.nom = nom;
        this.capital = capital;
    }

    public void setNomComarca(String nom) {
        this.nom = nom;
    }

    public String getNomComarca() {
        return nom;
    }

    public void setCapital(String capital) {
        this.nom = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void updateComarca(String newCapital) {
        this.capital = newCapital;
    }



    public int calcularTotalHabitants() {
        int totalHabitants = 0;
        for (int i = 0; i < pPobles; i++) {
            totalHabitants += pobles[i].getHabitantsPoble();
        }
        for (int i = 0; i < pCiutats; i++) {
            totalHabitants += ciutats[i].getHabitantsCiutat();
        }
        for (int i = 0; i < pZonesRurals; i++) {
            totalHabitants += zonesRurals[i].getHabitantsZonaRural();
        }
        return totalHabitants;
    }

    public void showComarca() {
        System.out.println("\nLes dades de la comarca " + nom + " són:");
        System.out.println("\nCapital: " + capital);
        System.out.println("\nTotal habitants: " + calcularTotalHabitants());
    }

    public void addCiutat() {
        if (pCiutats < ciutats.length) {
            ciutats[pCiutats] = ciutat;
            pCiutats++;
        } else {
            System.out.println("No es pot afegir més ciutats.");
        }
    }
    public int selectCiutat(String codi) {
        if (codi == null) {
            System.out.println("\nCodi de la ciutat?:");
            codi = DADES.next();
        }
        for (int i = 0; i < pCiutats; i++) {
            if (ciutats[i].getCodiCiutat().equals(codi)) {
                return i;
            }
        }
        return -1;
    }

    public void addPoble() {
        if (pPobles < pobles.length) {
            pobles[pPobles] = poble;
            pPobles++;
        } else {
            System.out.println("No es pot afegir més pobles.");
        }
    }
    



    public int selectPoble(String codi) {

        if (codi == null) {
            System.out.println("\nCodi del poble?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pPobles; i++) {
            if (pobles[i].getCodiPoble().equals(codi)) {
                return i;
            }
        }

        return -1;
    }


    public void addZonaRural() {
        if (pZonesRurals < zonesRurals.length) {
            zonesRurals[pZonesRurals] = newZone;
            pZonesRurals++;
        }
    }

    public int selectZonaRural(String codi) {

        if (codi == null) {
            System.out.println("\nCodi de la zona rural?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pZonesRurals; i++) {
            if (zonesRurals[i].getCodiZonaRural().equals(codi)) {
                return i;
            }
        }

        return -1;
    }

    public Ciutat[] getCiutats() {
        return ciutats;
    }

    public void setCiutats(Ciutat[] ciutats) {
        this.ciutats = ciutats;
    }

    public Poble[] getPobles() {
        return pobles;
    }

    public void setPobles(Poble[] pobles) {
        this.pobles = pobles;
    }

    public ZonaRural[] getZonesRurals() {
        return zonesRurals;
    }

    public void setZonesRurals(ZonaRural[] zonesRurals) {
        this.zonesRurals = zonesRurals;
    }


}
