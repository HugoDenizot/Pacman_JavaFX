package modele.collisionneur;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import modele.Monde;
import modele.entites.Entite;

/**
 * La classe Collisionneur est la classe qui va permettre de savoir quand est ce que 2 entite vont se rencontrer afin de pouvoir effectue des actions entre elles lors de leurs rencontres.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public abstract class Collisionneur {
    /**
     * Cet attribut sert a definir la largeur de la fenetre.
     */
    private DoubleProperty width= new SimpleDoubleProperty();
    public double getWidth() {return width.get();}
    public DoubleProperty widthProperty() {return width;}
    public void setWidth(double width) {this.width.set(width);}

    /**
     * Cet attribut sert a definir la hauteur de la fenetre.
     */
    private DoubleProperty height=new SimpleDoubleProperty();
    public double getHeight() {return height.get();}
    public DoubleProperty heightProperty() {return height;}
    public void setHeight(double height) {this.height.set(height);}

    /*
    On a un attribut leMonde qui contiendra la liste de toutes les entites présentes dans la fenetre.
     */
    protected Monde leMonde;

    /**
     * Cette methode retourne un boolean et permet au programme de savoir si il peut faire bouger ou non l'entite qui demande a bouger,en regardant si une entite est presente
     * ou si il est loin du bord de la fenetre.
     * @param x On donne ici la position x de l'entite qui souhaite se deplacer.
     * @param y On donne ici la position y de l'entite qui souhaite se deplacer.
     * @param p On donne l'entite qui souhaite se deplacer.
     * @return On return un boolean pour savoir si il a le droit oui ou non.
     */
    public abstract boolean canMove(double x, double y, Entite p);

    /**
     * Cette methode retourne un boolean qui permet au programme de savoir si une entite peut se deplacer a une position ou non, si jamais une autre entite est deja la et qu'il ne peuvent pas
     * se superposer.
     * @param x On donne ici la position x de l'entite qui souhaite se deplacer.
     * @param y On donne ici la position y de l'entite qui souhaite se deplacer.
     * @param p On donne ici l'entite qui souhaite se deplacer.
     * @return On return un boolean qui dit si oui ou non elle peut se deplacer.
     */
    public abstract boolean isPresent(double x, double y, Entite p);

    /**
     * On construit un Collisionneur en definissant juste sa variable leMonde.
     * @param leMonde
     */
    public Collisionneur(Monde leMonde) {
        this.leMonde = leMonde;
    }
}
