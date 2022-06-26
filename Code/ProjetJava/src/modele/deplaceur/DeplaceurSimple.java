package modele.deplaceur;

import modele.collisionneur.Collisionneur;
import modele.entites.Entite;

/**
 * Cette classe permet de deplacer les pacmans. Elle herite des methodes de sa classe mere Déplaceur.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class DeplaceurSimple extends Deplaceur {
    /**
     * Cet attribut permet de définir le nombre de case que le pacman va pouvoir parcourir durant un deplacement.
     */
    private int vitesse;

    /**
     * Cette methode permet de construire un DeplaceurSimple grace a un Collisionneur donne, en appelant la methode de la classe mere.
     * @param leCollisionneur Le collisionneur donne sert a savoir si il y a des entites a cote et si on peut deplacer un pacman.
     */
    public DeplaceurSimple(Collisionneur leCollisionneur) {
        super(leCollisionneur);
        pas=1;
        vitesse=5;
    }

    /**
     * Permet de deplacer un pacman vers le haut.
     * @param e Pacman que l'on veut deplacer.
     */
    public void moveUp(Entite e){
        for(int i=0;i<vitesse;i++){
            if(leCollisionneur.canMove(e.getX(),e.getY()-pas,e)){
                e.setX(e.getX());
                e.setY(e.getY()-pas);
            }
        }
    }

    /**
     * Permet de deplacer un pacman vers le bas.
     * @param e Pacman que l'on veut deplacer.
     */
    public void moveDown(Entite e){
        for(int i=0;i<vitesse;i++){
            if(leCollisionneur.canMove(e.getX(),e.getY()+pas,e)){
                e.setX(e.getX());
                e.setY(e.getY()+pas);
            }
        }
    }

    /**
     * Permet de deplacer un pacman vers la gauche.
     * @param e Pacman que l'on veut deplacer.
     */
    public void moveLeft(Entite e){
        for(int i=0;i<vitesse;i++){
            if(leCollisionneur.canMove(e.getX()-pas,e.getY(),e)){
                e.setX(e.getX()-pas);
                e.setY(e.getY());
            }
        }
    }

    /**
     * Permet de deplacer un pacman vers la droite.
     * @param e Pacman que l'on veut deplacer.
     */
    public void moveRight(Entite e){
        for(int i=0;i<vitesse;i++){
            if(leCollisionneur.canMove(e.getX()+pas,e.getY(),e)){
                e.setX(e.getX()+pas);
                e.setY(e.getY());
            }
        }
    }
}
