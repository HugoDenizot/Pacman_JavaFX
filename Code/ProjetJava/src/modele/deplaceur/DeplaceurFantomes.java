package modele.deplaceur;

import modele.collisionneur.Collisionneur;
import modele.entites.Entite;

/**
 * Cette classe herite des methode de Deplaceur. Elle est utilise pour deplacer uniquement un fantome.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class DeplaceurFantomes extends Deplaceur {
    /**
     *Cette methode sert a cree un deplaceur fantome. Pour cela nous avons besoin du Collisionneur pour savoir si on peut le déplacer ou non.
     * @param leCollisionneur
     */
    public DeplaceurFantomes(Collisionneur leCollisionneur) {
        super(leCollisionneur);
        pas=25;
    }

    /**
     * Permet de deplacer un fantome vers le haut.
     * @param e Entite que l'on veut deplacer.
     */
    public void moveUp(Entite e){
            if(leCollisionneur.canMove(e.getX(),e.getY()-pas,e)){
                e.setX(e.getX());
                e.setY(e.getY()-pas);
            }
    }

    /**
     * Permet de deplacer un fantome vers le bas.
     * @param e Entite que l'on veut deplacer.
     */
    public void moveDown(Entite e){
            if(leCollisionneur.canMove(e.getX(),e.getY()+pas,e)){
                e.setX(e.getX());
                e.setY(e.getY()+pas);
            }
    }

    /**
     * Permet de deplacer un fantome vers la gauche.
     * @param e Entite que l'on veut deplacer.
     */
    public void moveLeft(Entite e){
            if(leCollisionneur.canMove(e.getX()-pas,e.getY(),e)){
                e.setX(e.getX()-pas);
                e.setY(e.getY());
            }
    }

    /**
     * Permet de deplacer un fantome vers la droite.
     * @param e Entite que l'on veut deplacer.
     */
    public void moveRight(Entite e){
            if(leCollisionneur.canMove(e.getX()+pas,e.getY(),e)){
                e.setX(e.getX()+pas);
                e.setY(e.getY());
            }
    }
}
