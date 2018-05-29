
package demonpatternbridge;

/**
 *Creation d'une classe Impression qui va impléménter IReporting
 * @author Bouya
 * @since 14/05/2018
 * @version 1.0
 */
public class Impression implements IReporting {

    /**
     * Redefinition de la methode Imprimer de l'interface
     * @param Report 
     */
    @Override
    public void Imprimer(String Report) {
       System.out.println("L'impression du rapport du stock" +Report);
    }

  
}
