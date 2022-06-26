package modele.entites;

import javafx.beans.property.*;
import javafx.scene.image.Image;

/**
 * Cette classe definit ce qui est une Entite.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public  abstract class Entite {
    /**
     * Attribut qui definit la largeur maximale d'une Entite.
     */
    protected  int maxWidth = 25;
    /**
     * Attribut qui definit la hauteur maximale d'une Entite.
     */
    protected  int maxHeight=25;
    /**
     * Attribut qui definit la position x d'une entite.
     */
    protected DoubleProperty x =new SimpleDoubleProperty();
    public  double getX(){ return x.get();}
    public  DoubleProperty xProperty(){return x;}
    public  void setX(double x) {this.x.set(x);}

    /**
     * Attribut qui definit la position y d'une entite.
     */
    protected  DoubleProperty y =new SimpleDoubleProperty();
    public  double getY(){return y.get();}
    public  DoubleProperty yProperty(){return y;}
    public  void setY(double y){this.y.set(y);}

    /**
     * Attribut qui definit l'Image d'une entite.
     */
    protected ObjectProperty<Image> image=new SimpleObjectProperty();
    public Image getImage() {return image.get();}
    public ObjectProperty<Image> imageProperty() {return image;}
    public void setImage(Image image) {this.image.set(image);}

    /**
     * Attribut qui definit les points donnees par une entite qui est mange.
     */
    protected int point;
    /**
     * Attribut qui definit le chemin de l'image de l'entite.
     */
    protected String cheminImage;

    /**
     * Méthode qui sert a récupere le chemin de l'image.
     * @return le cheminImage d'une Entité.
     */
    public String getCheminImage() {
        return cheminImage;
    }

    /**
     * Permet de créer une entité a une position donnée.
     * @param x Position x de l'entité souhaitée.
     * @param y position y de l'entité souhaitée.
     * @param image Image de l'entité.
     */
    public  Entite(double x , double y, String image){
            this.x.set(x);
            this.y.set(y);
            this.cheminImage=image;
            this.image.set(new Image(image));
            point=0;
        }

    /**
     * Permet de recuperer la largeur maximal d'une entite.
     * @return le maxWidth d'une entite.
     */
    public int getMaxWidth(){
            return maxWidth;
        }

    /**
     * Permet de recuperer la hauteur maximal d'une entite.
     * @return le maxHeight d'une entité.
     */
    public int getMaxHeight(){
            return maxHeight;
        }

    /**
     * Permet de recuperer les points d'une entite.
     * @return le point d'une entite.
     */
    public int getPoint() {
        return point;
    }
}
