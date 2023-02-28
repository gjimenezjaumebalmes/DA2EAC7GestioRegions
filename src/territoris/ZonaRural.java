/*
* Classe que defineix una zona rural d’una comarca. Es defineixen pel seu codi, 
* nom, nombre d’habitants, densitat de població per Km2
 */
package territoris;


/**
 *
 * @author fta
 */
public class ZonaRural {    

    private String codi;
    private String nom;
    private int habitants;
    private double densitat;

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */
    

    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */
    

    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova zona rural. Les dades a demanar 
       són les que necessita el constructor.
     - També heu de tenir en compte que el nom de la zona rural pot ser una frase, per exemple, 
       "La Pobla de Lillet".
     - En el cas del nombre d'habitants i densitat, s'ha de complir que una zona rural
       ha de tenir menys de 5000 habitants i la densitat mai pot ser més gran 
       que el nombre d'habitants. Si no es compleixen aquests requisits, se li demanarà 
       a l'usuari que torni a introduir les dades fins que siguin correctes.
     - També heu de pensar que el nombre d'habitants i la densitat no poden ser nombres negatius
     
     Retorn: La nova zona rural creada.
     */
    public static ZonaRural addZonaRural() {

    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de la zona rural actual i
       modificar els atributs corresponents d'aquesta zona rural.
     - També heu de tenir en compte que el nom de la zona rural pot ser una frase, per exemple, 
       "La Pobla de Lillet".
     - En el cas del nombre d'habitants i densitat, s'ha de complir que una zona rural
       ha de tenir menys de 5000 habitants i la densitat mai pot ser més gran 
       que el nombre d'habitants. Si no es compleixen aquests requisits, se li demanarà 
       a l'usuari que torni a introduir les dades fins que siguin correctes.
     - També heu de pensar que el nombre d'habitants i la densitat no poden ser nombres negatius
     
     Retorn: cap
     */
    public void updateZonaRural() {

    }
    

    public void showZonaRural() {
        System.out.println("\nLes dades de la zona rural amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nHabitants: " + habitants);
        System.out.print("\nDensitat: " + densitat);
    }
}
