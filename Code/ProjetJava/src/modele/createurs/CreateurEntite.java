package modele.createurs;

import modele.Monde;
import modele.entites.Fantome;
import modele.entites.Pacman;

/**
 * Cette classe va permettre de creer des entites.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public abstract class CreateurEntite {
    /**
     * Cette methode permet de creer une entite de classe Pacman a une position precise.
     * @param m On donne le monde dans lequel on souhaite ajouter cette entite.
     * @return On retourne l'entite que l'on a cree.
     */
    public abstract Pacman creerPacman(Monde m);

    /**
     * Cette methode permet de creer une entite de classe Piece a une position donnes lors de la creation.
     * @param m Le monde dans lequel on souhaite ajouter la piece.
     * @param x La coordonnee x de la piece.
     * @param y La coordonnee y de la piece.
     */
    public abstract  void creerPiece(Monde m, double x, double y);

    /**
     * Cette methode permet de creer une entite de classe Wall a une position donnes lors de la creation.
     * @param m Le monde dans lequel on souhaite ajouter le Wall.
     * @param x La coordonnee x de le Wall.
     * @param y La coordonnee y de le Wall.
     */
    public abstract  void creerWall(Monde m,double x, double y);

    /**
     * Cette methode permet de creer une entité de classe Bonus a une position donnes lors de la creation.
     * @param m Le monde dans lequel on souhaite ajouter le Bonus.
     * @param x La coordonnee x de le Bonus.
     * @param y La coordonnee y de le Bonus.
     */
    public abstract  void creerBonus(Monde m,double x, double y);

    /**
     * Cette methode permet de creer une entite de classe Fantome a une position precise.
     * @param m On donne le monde dans lequel on souhaite ajouter cette entite.
     * @return On retourne l'entite que l'on a cree.
     */
    public abstract Fantome creerFantome1(Monde m);

    /**
     * Cette methode permet de creer une entite de classe Fantome a une position precise.
     * @param m On donne le monde dans lequel on souhaite ajouter cette entite.
     * @return On retourne l'entite que l'on a cree.
     */
    public abstract  Fantome creerFantome2(Monde m);
    /**
     * Cette methode permet de creer une entite de classe Fantome a une position precise.
     * @param m On donne le monde dans lequel on souhaite ajouter cette entite.
     * @return On retourne l'entite que l'on a cree.
     */
    public abstract  Fantome creerFantome3(Monde m);
    /**
     * Cette methode permet de creer une entite de classe Fantome a une position precise.
     * @param m On donne le monde dans lequel on souhaite ajouter cette entite.
     * @return On retourne l'entite que l'on a cree.
     */
    public abstract  Fantome creerFantome4(Monde m);
}
