package modele.entites;

/**
 * Classe qui permet de creer une entite de type Piece.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class Piece extends Entite {
    /**
     * Constructeur qui permet de creer une piece a une position souhaitee.
     * @param x Position x souhaitee.
     * @param y Position y souhaitee.
     * @param image Chemin de l'image de la pièce souhaitee.
     */
    public Piece(double x, double y, String image) {
        super(x, y, image);
        maxHeight=25;
        maxWidth=25;
        point=50;
    }
}