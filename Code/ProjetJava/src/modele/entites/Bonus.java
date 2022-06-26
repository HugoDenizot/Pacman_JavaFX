package modele.entites;

/**
 * Cette classe herite de la classe Entite et contient juste un constructeur pour construire un bonus.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class Bonus extends Entite{
    /**
     * Permet de construire un Bonus a une position voulue avec le chemin de l'image que l'on veut lui attribuer.
     * @param x Position x que l'on veut lui donner.
     * @param y Position y que l'on veut lui donner.
     * @param image Chemin de l'image du Bonus.
     */
    public Bonus(double x, double y, String image) {
        super(x, y, image);
        maxHeight=25;
        maxWidth=25;
        point=50;
    }
}
