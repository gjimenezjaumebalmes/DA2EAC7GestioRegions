/*
* Classe que defineix una ciutat d’una comarca. Es defineixen pel seu codi, nom, 
* nombre d’habitants i densitat de població per Km2
 */
package territoris;


/**
 *
 * @author fta
 */
public class Ciutat { 

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
     - Demanar a l'usuari les dades per consola per crear una nova ciutat. Les dades a demanar 
       són les que necessita el constructor.
     - També heu de tenir en compte que el nom de la ciutat pot ser una frase, per exemple, 
       "Santa Coloma de Gramanet".
     - En el cas del nombre d'habitants i densitat, s'ha de complir que una ciutat
       ha de tenir un mínim de 50.000 habitants i la densitat mai pot ser més gran 
       que el nombre d'habitants, ni un valor negatiu. Si no es compleixen aquests requisits,
       se li demanarà a l'usuari que torni a introduir les dades fins que siguin correctes.
     
     Retorn: La nova ciutat creada.
     */
    public static Ciutat addCiutat() {
      
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de la ciutat actual i
       modificar els atributs corresponents d'aquesta ciutat.
     - També heu de tenir en compte que el nom de la ciutat pot ser una frase, per exemple, 
       "Santa Coloma de Gramanet".
     - En el cas del nombre d'habitants i densitat, s'ha de complir que una ciutat
       ha de tenir un mínim de 50.000 habitants i la densitat mai pot ser més gran 
       que el nombre d'habitants, ni un valor negatiu. Si no es compleixen aquests requisits,
       se li demanarà a l'usuari que torni a introduir les dades fins que siguin correctes.
     
     Retorn: cap
     */
    public void updateCiutat() {
    
    }
    

    public void showCiutat() {
        System.out.println("\nLes dades de la ciutat amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nHabitants: " + habitants);
        System.out.print("\nDensitat: " + densitat);
    }
}
