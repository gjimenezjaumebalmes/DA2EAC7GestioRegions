package principal;

public class Application {

    private static Regio[] regions = new Regio[10];
    private static int pRegions = 0; //Priemra posició buida del vector regions
    private static Regio regioActual = null;

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        int opcio = 0;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Gestió de regions");
            System.out.println("\n2. Gestió de comarques");
            System.out.println("\n3. Gestió de ciutats");
            System.out.println("\n4. Gestió de pobles");
            System.out.println("\n5. Gestió de zones rurals");
            opcio = DADES.nextInt();

            switch (opcio) {
                case 0:
                    break;
                case 1:
                    menuRegions();
                    break;
                case 2:
                    if (regioActual != null) {
                        menuComarques();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la regió al menú Gestió de regions");
                    }
                    break;
                case 3:
                    if (regioActual != null) {
                        menuCiutats();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la regió al menú Gestió de regions");
                    }
                    break;
                case 4:
                    if (regioActual != null) {
                        menuPobles();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la regió al menú Gestió de regions");
                    }
                    break;
                case 5:
                    if (regioActual != null) {
                        menuZonesRurals();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la regió al menú Gestió de regions");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static void menuRegions() {
        int opcio;

        do {
            int indexSel;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Seleccionar");
            System.out.println("\n3. Modificar");
            System.out.println("\n4. Llista de regions");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    Regio novaRegio = Regio.addRegio();

                    indexSel = selectRegio(novaRegio);

                    if (indexSel == -1) {
                        regions[pRegions] = novaRegio;
                        pRegions++;
                    } else {
                        System.out.println("\nLa regió ja existeix");
                    }

                    break;
                case 2:
                    indexSel = selectRegio(null);
                    if (indexSel >= 0) {
                        regioActual = regions[indexSel];
                    } else {
                        System.out.println("\nNo existeix aquesta regió");
                    }
                    break;
                case 3:
                    indexSel = selectRegio(null);
                    if (indexSel >= 0) {
                        regions[indexSel].updateRegio();
                    } else {
                        System.out.println("\nNo existeix aquesta regió");
                    }
                    break;
                case 4:
                    for (int i = 0; i < pRegions; i++) {
                        regions[i].showRegio();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }


    public static void menuComarques() {
        int opcio;

        do {
            int indexSel;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Seleccionar");
            System.out.println("\n3. Modificar");
            System.out.println("\n4. Llista de comarques");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    addComarca()
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

            }
        } while (opcio != 0);
    }



    public static void menuCiutats() {

        int opcio;

        do {
            int indexSel;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Seleccionar");
            System.out.println("\n3. Modificar");
            System.out.println("\n4. Llista de ciutats");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

            }
        } while (opcio != 0);
    }




    public static void menuPobles() {
        int opcio;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llista de pobles");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    regioActual.addPobleComarca();
                    break;
                case 2:
                    regioActual.updatePobleComarca();
                    break;
                case 3:
                    for (int i = 0; i < regioActual.getpComarques(); i++) {

                        for (int j = 0; j < regioActual.getComarques()[i].getpPobles(); j++) {

                            regioActual.getComarques()[i].getPobles()[j].showPoble();

                        }
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
     TODO Heu de desenvolupar el menuZonesRurals amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut regioActual no és null

     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea una zona rural de la regió actual afegint-la a una comarca.
                               Penseu que Regio sap afegir una zona rural a una comarca seleccionada.
     Opció 2. Modificar -->    Permet modificar una zona rural de la regió actual. Penseu que totes les
                               zones rurals d'una regió pertanyen a una comarca d'aquesta regió i que
                               Regio sap modificar una zona rural que pertany a una de les seves comarques.
     Opció 3. Llista de zones rurals--> Imprimeix les dades de totes les zones rurals de la regió actual.

     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida

     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
    public static void menuZonesRurals() {
        int opcio;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llista de zones rurals");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    regioActual.addZonaRuralComarca();
                    break;
                case 2:
                    regioActual.updateZonaRuralComarca();
                    break;
                case 3:
                    for (int i = 0; i < regioActual.getpComarques(); i++) {

                        for (int j = 0; j < regioActual.getComarques()[i].getpZonesRurals(); j++) {

                            regioActual.getComarques()[i].getZonesRurals()[j].showZonaRural();

                        }
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static Integer selectRegio(Regio regio) {

        String nom;

        if (regio == null) {
            System.out.println("\nNom de la regió?:");
            DADES.nextLine(); //Neteja buffer
            nom = DADES.nextLine();
        }

        nom = regio.getNom();

        for (int i = 0; i < pRegions; i++) {
            if (regions[i].getNom().equals(nom)) {
                return i;
            }
        }
        
        return -1;
    }
}
