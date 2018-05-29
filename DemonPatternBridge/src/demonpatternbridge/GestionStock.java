
package demonpatternbridge;

/**
 *Definit l'interface de l'abstraction
 * @author Bouya
 * @since 14/05/2018
 * @version 1.0
 */
public abstract class GestionStock {
    
    //Reference vers l'implementation
    private IReporting Report;
    
    public abstract void Imprimer();
  
    /**
     * Constructeur de la classe GestionStock 
     * @param Report1 
     */  
      protected GestionStock(IReporting Report1){
          Report=Report1;
      }
     
     /**
      *  methode Imprimer de l'implementation
      * @param pReport 
      */ 
      protected void Imprimer(String pReport){
          Report.Imprimer(pReport);
      }
}
