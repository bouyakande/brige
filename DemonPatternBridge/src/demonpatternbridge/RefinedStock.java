
package demonpatternbridge;

/**
 *Sous classe(classe implementé) de l'implementation
 *@author Bouya
 * @since 14/05/2018
 * @version 1.0
 */
public class RefinedStock extends GestionStock {

    /**
     * Creation d'un constructeur
     * @param Report1 
     */
    public RefinedStock(IReporting Report1) {
        super(Report1);
    }

   /*
    * Redefinition de la methode Imprimer
    */
    
    @Override
    public void Imprimer() {
        
        Imprimer("Rapport pour la quantité de stock");
        Imprimer("Rapport pour la quantité d'entrée");
        Imprimer("Rapport pour la quantité de sortie");
    
    }
    
   
}
