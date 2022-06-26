package modele.deplaceur;

import modele.collisionneur.Collisionneur;
import modele.entites.Entite;

/**
 * Cette classe va servir a definir toute les methodes utiles au deplacement d'une entite.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public abstract class Deplaceur {
    /**
     * Le pas correspond au nombre de case dont l'entite va se deplacer.
     */
    protected int pas;
    /**
     * Le collisionneur va servir a definir si l'entite peut bouger ou non.
     */
    protected Collisionneur leCollisionneur;

    /**
     * Le constructeur du deplacement prends en parametre un collisionneur pour savoir si il devra bouger l'entite ou non.
     * @param leCollisionneur Collisionneur donne par le Manager qui contient tout les deplacements possibles.
     */
    public Deplaceur(Collisionneur leCollisionneur){
        this.leCollisionneur=leCollisionneur;
    }

    /**
     * Cette methode sert a deplacer une entité vers le haut.
     * @param e Entite que l'on veut deplacer.
     */
    public abstract void moveUp(Entite e);

    /**
     * Cette methode sert a deplacer une entité vers le bas.
     * @param e Entite que l'on veut deplacer.
     */
    public abstract void moveDown(Entite e);

    /**
     * Cette methode sert a deplacer une entite vers la gauche.
     * @param e Entite que l'on veut deplacer.
     */
    public abstract void moveLeft(Entite e);

    /**
     * Cette methode sert a deplacer une entite vers la droite.
     * @param e Entite que l'on veut deplacer.
     */
    public abstract void moveRight(Entite e);

}
