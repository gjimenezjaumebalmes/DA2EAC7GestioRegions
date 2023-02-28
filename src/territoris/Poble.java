/*
* Classe que defineix un poble d’una comarca. Es defineixen pel seu codi, nom, 
* nombre d’habitants i densitat de població per Km2.
 */
package territoris;


/**
 *
 * @author fta
 */
public class Poble {

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
     - Demanar a l'usuari les dades per consola per crear un nou poble. Les dades a demanar 
       són les que necessita el constructor.
     - També heu de tenir en compte que el nom del poble pot ser una frase, per exemple, 
       "Sant Feliu de Codines".
     - En el cas del nombre d'habitants i densitat, s'ha de complir que un poble
       ha de tenir un mínim de 5000 habitants i la densitat mai pot ser més gran 
       que el nombre d'habitants, ni un valor negatiu. Si no es compleixen aquests requisits,
       se li demanarà a l'usuari que torni a introduir les dades fins que siguin correctes.
     - També heu de pensar que amb un mínim de 50.000 habitants, ja no és un poble, és una ciutat.
     
     Retorn: El nou poble creat.
     */
    public static Poble addPoble() {
        
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades del poble actual i
       modificar els atributs corresponents d'aquest poblel.
     - També heu de tenir en compte que el nom del poble pot ser una frase, per exemple, 
       "Sant Feliu de Codines".
     - En el cas del nombre d'habitants i densitat, s'ha de complir que un poble
       ha de tenir un mínim de 5000 habitants i la densitat mai pot ser més gran 
       que el nombre d'habitants, ni un valor negatiu. Si no es compleixen aquests requisits,
       se li demanarà a l'usuari que torni a introduir les dades fins que siguin correctes.
     - També heu de pensar que amb un mínim de 50.000 habitants, ja no és un poble, és una ciutat.
     
     Retorn: cap
     */
    public void updatePoble() {
   
    }
    

    public void showPoble() {
        System.out.println("\nLes dades del poble amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nHabitants: " + habitants);
        System.out.print("\nDensitat: " + densitat);
    }
}
