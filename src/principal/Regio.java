package principal;

import territoris.Comarca;

public class Regio {

    private String nom;
    private String capital;
    private Comarca[] comarques = new Comarca[5];
    private int pComarques = 0; //Priemra posició buida de l'array de comarques


    public static Regio addRegio() {

    }

    public void updateRegio() {

    }


    public int calcularTotalHabitants() {

    }

    public void showRegio() {
        System.out.println("\nLes dades de la regio " + nom + " són:");
        System.out.println("\nCapital: " + capital);
        System.out.println("\nTotal habitants: " + calcularTotalHabitants());
    }

    public void addComarca() {

    }

    public int selectComarca(String nom) {

        if (nom == null) {
            System.out.println("\nNom de la comarca?:");
            nom = DADES.nextLine();
        }

        for (int i = 0; i < pComarques; i++) {
            if (comarques[i].getNom().equals(nom)) {
                return i;
            }
        }

        return -1;
    }
    

    public void addCiutatComarca() {

        int index = selectComarca(null);

        if (index != -1) {

            comarques[index].addCiutat();

        } else {

            System.out.println("\nLa comarca no existeix");

        }

    }

    public void updateCiutatComarca() {

        int indexComarca = selectComarca(null);

        if (indexComarca != -1) {

            int indexCiutat = comarques[indexComarca].selectCiutat(null);

            if (indexCiutat != -1) {

                comarques[indexComarca].getCiutats()[indexCiutat].updateCiutat();

            } else {

                System.out.println("\nLa ciutat no existeix");

            }

        } else {

            System.out.println("\nLa comarca no existeix");

        }

    }

    public void addPobleComarca() {

        int index = selectComarca(null);

        if (index != -1) {

            comarques[index].addPoble();

        } else {

            System.out.println("\nLa comarca no existeix");

        }

    }

    public void updatePobleComarca() {

        int indexComarca = selectComarca(null);

        if (indexComarca != -1) {

            int indexPoble = comarques[indexComarca].selectPoble(null);

            if (indexPoble != -1) {

                comarques[indexComarca].getPobles()[indexPoble].updatePoble();

            } else {

                System.out.println("\nEl poble no existeix");

            }

        } else {

            System.out.println("\nLa comarca no existeix");

        }

    }

    public void addZonaRuralComarca() {

        int index = selectComarca(null);

        if (index != -1) {

            comarques[index].addZonaRural();

        } else {

            System.out.println("\nLa comarca no existeix");

        }

    }

    public void updateZonaRuralComarca() {

        int indexComarca = selectComarca(null);

        if (indexComarca != -1) {

            int indexZonaRural = comarques[indexComarca].selectZonaRural(null);

            if (indexZonaRural != -1) {

                comarques[indexComarca].getZonesRurals()[indexZonaRural].updateZonaRural();

            } else {

                System.out.println("\nLa zona rural no existeix");

            }

        } else {

            System.out.println("\nLa comarca no existeix");

        }

    }

}
