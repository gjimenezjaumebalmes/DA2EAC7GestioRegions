package territoris;

public class Comarca {

    private String nom;
    private String capital;
    private Poble[] pobles = new Poble[100];
    private int pPobles = 0; //Priemra posició buida de l'array de pobles
    private Ciutat[] ciutats = new Ciutat[100];
    private int pCiutats = 0; //Priemra posició buida de l'array de ciutats
    private ZonaRural[] zonesRurals = new ZonaRural[100];
    private int pZonesRurals = 0; //Priemra posició buida de l'array de zones rurals


    public static Comarca addComarca() {

    }


    public void updateComarca() {

    }


    public int calcularTotalHabitants() {

    }
    
    
    public void showComarca() {
        System.out.println("\nLes dades de la comarca " + nom + " són:");
        System.out.println("\nCapital: " + capital);
        System.out.println("\nTotal habitants: " + calcularTotalHabitants());
    }
    

    public void addCiutat() {

    }

    public int selectCiutat(String codi) {

        if (codi == null) {
            System.out.println("\nCodi de la ciutat?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pCiutats; i++) {
            if (ciutats[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }
    


    public void addPoble() {

    }

    public int selectPoble(String codi) {

        if (codi == null) {
            System.out.println("\nCodi del poble?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pPobles; i++) {
            if (pobles[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }
    
    

    public void addZonaRural() {

    }

    public int selectZonaRural(String codi) {

        if (codi == null) {
            System.out.println("\nCodi de la zona rural?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pZonesRurals; i++) {
            if (zonesRurals[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }

}
