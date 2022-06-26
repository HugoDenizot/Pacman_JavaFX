package modele.entites;

/**
 * Cette classe permet de creer une entite de classe Fantome.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class Fantome extends Entite{
    /**
     * Constructeur qui permet de creer un Fantome a une position souhaitee.
     * @param x Position x souhaitee.
     * @param y Position y souhaitee.
     * @param image chemin de l'image de fantome souhaitee.
     */
    public Fantome(double x, double y, String image) {
        super(x, y, image);
        maxHeight=25;
        maxWidth=25;
        point=100;
    }
}
