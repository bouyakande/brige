
package demonpatternbridge;

/**
 *
 * @author Bouya
 * @since 14/05/2018
 * @version 1.0
 */
public class BridgePatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creation d'une instance de l'implementation
        IReporting RPT = new Impression();
        
        //Creation d'une instance de l'abstraction
        GestionStock Stock1 = new RefinedStock(RPT);
        
        //Appels de la methode Imprimer()
        Stock1.Imprimer();
        
        
    }
    
}
