package modele.entites;

/**
 * Cette classe permet de creer des entites de classe Wall.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class Wall extends Entite {
    /**
     * Constructeur qui permet de creer un mur a une position souhaitee.
     * @param x Position x souhaitee.
     * @param y Position y souhaitee.
     * @param image Chemin de l'image souhaitee.
     */
    public Wall(double x, double y, String image) {
        super(x, y, image);
        maxHeight=25;
        maxWidth=25;
        point=0;
    }
}