package modele;

import boucleur.Boucleur;
import boucleur.BoucleurSimple;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import modele.collisionneur.Collisionneur;
import modele.collisionneur.CollisionneurSimple;
import modele.createurs.CreateurEntite;
import modele.createurs.CreateurEntiteSimple;
import modele.deplaceur.Deplaceur;
import modele.deplaceur.DeplaceurFantomes;
import modele.deplaceur.DeplaceurSimple;
import modele.entites.*;
import java.util.Random;

/**
 * Classe qui va permettre de gerer toute les autres classe et aussi qui va toutes les relier entre elles.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class Manager implements InvalidationListener {
    /**
     * Attribut qui donne le Monde utilise dans l'application.
     */
    private  Monde leMonde = new Monde();
    /**
     * Attribut qui donne le créateur d'entité utilise dans l'application.
     */
    private CreateurEntite Createur = new CreateurEntiteSimple();
    /**
     * Attribut qui donne le Boucleur utilise dans l'application.
     */
    private Boucleur leBoucleur=new BoucleurSimple();
    /**
     * Attribut qui donne le Collisionneur utilise dans l'application.
     */
    private Collisionneur leCollisionneur=new CollisionneurSimple(leMonde);
    /**
     * Attribut qui donne le Pacman de l'application.
     */
    private Pacman pacmanEnCours;
    /**
     * Attribut qui donne un des fantomes utilise dans l'application.
     */
    private Entite fantome2;
    /**
     * Attribut qui donne un des fantomes utilise dans l'application.
     */
    private Entite fantome1;
    /**
     * Attribut qui donne un des fantomes utilise dans l'application.
     */
    private Entite fantome4;
    /**
     * Attribut qui donne un des fantomes utilise dans l'application.
     */
    private Entite fantome3;
    /**
     * Attribut qui donne le Déplaceur utilise dans l'application.
     */
    private Deplaceur leDeplaceur= new DeplaceurSimple(leCollisionneur);
    /**
     * Attribut qui donne le Déplaceur de fantomes utilise dans l'application.
     */
    private Deplaceur deplaceurFantome=new DeplaceurFantomes(leCollisionneur);


    /**
     * Constructeur qui cree une classe Manager en creant un pacman, des fantomes, et qui s'ajoute a la liste des entites observé par le boucleur,qui passe a actif et lance un boucleur
     * et qui cree un plateau.
     */
    public Manager(){
        pacmanEnCours=Createur.creerPacman(leMonde);
        fantome1=Createur.creerFantome1(leMonde);
        fantome2=Createur.creerFantome2(leMonde);
        fantome3= Createur.creerFantome3(leMonde);
        fantome4=Createur.creerFantome4(leMonde);
        leBoucleur.addListener(this);
        leBoucleur.setActif(true);
        new Thread(leBoucleur).start();
        creerPlateau();
    }

    /**
     * Methode qui permet de creer un plateau dans le monde en lui donnant le createur.
     */
    private void creerPlateau() {
        Plateau.chargerPlateau(Createur,leMonde);
    }

    /**
     * Methode permettant de recuperer la liste des entites.
     * @return ListDesEntités.
     */
    public ObservableList<Entite> getListEntite(){
        return  leMonde.getLesEntites();
    }

    /**
     * Cette methode est utilise durant les beeps de la classe boucleur. Elle permet de faire deplacer les fantomes, de changer l'image des fantomes selon le bonus du pacman et de mettre fin
     * au jeu et au boucleur si il n'y a plus de piece dans la fenêtre.
     * @param observable Donne la liste des entités observées par le boucleur.
     */
    @Override
    public void invalidated(Observable observable) {
        deplaceFantome();
        if(pacmanEnCours.getBonus()>0){
            fantome2.setImage(new Image("/img/blueghost.gif"));
            fantome1.setImage(new Image("/img/blueghost.gif"));
            fantome3.setImage(new Image("/img/blueghost.gif"));
            fantome4.setImage(new Image("/img/blueghost.gif"));
            pacmanEnCours.setBonus(pacmanEnCours.getBonus()-1);
        }
        if(pacmanEnCours.getBonus()==0){
            fantome1.setImage(new Image("/img/redghost.gif"));
            fantome2.setImage(new Image("/img/ghost1.gif"));
            fantome3.setImage(new Image("/img/ghost2.gif"));
            fantome4.setImage(new Image("/img/ghost3.gif"));
        }
        if(existPacman(getListEntite())!=true){
            stopBoucleur();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Défaite");
            alert.setHeaderText("Vous avez perdu");
            alert.setContentText("Désolé le jeu est fini");
            alert.showAndWait();
            System.out.println("Le jeu est fini");
        }
        if(existPiece(getListEntite())!=true){
            stopBoucleur();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Victoire");
            alert.setHeaderText("Vous avez gagné");
            alert.setContentText("Bravo le jeu est fini");
            alert.showAndWait();
            System.out.println("Le jeu est fini");
        }
    }

    /**
     * Cette methode permet de stopper le boucleur.
     */
    public void stopBoucleur(){
        leBoucleur.setActif(false);
    }

    /**
     * Cette methode permet de gerer le deplacement du pacman selon l'appuie de touche d'un joueur.
     * @param code Touche qui a été presse.
     */
    public void deplace(KeyEvent code){
        switch (code.getCode()){
            case UP:
                pacmanEnCours.imageProperty().setValue(new Image("/img/pacmanUp.gif"));
                leDeplaceur.moveUp(pacmanEnCours);
                break;
            case DOWN:
                pacmanEnCours.setImage(new Image("/img/pacmanDown.gif"));
                leDeplaceur.moveDown(pacmanEnCours);
                break;
            case LEFT:
                pacmanEnCours.setImage(new Image("/img/pacmanLeft.gif"));
                leDeplaceur.moveLeft(pacmanEnCours);
                break;
            case RIGHT:
                pacmanEnCours.setImage(new Image("/img/pacmanRight.gif"));
                leDeplaceur.moveRight(pacmanEnCours);
                break;
        }
    }

    /**
     * Cette methode permet de retourner le Collisionneur du manager.
     * @return Collisionneur du manageur.
     */
    public Collisionneur getLeCollisionneur() {
        return leCollisionneur;
    }

    /**
     * Cette methode permet de savoir si il a des pieces dans une observableList passe en parametre.
     * @param entite List des entites Observable dans lequel on recherche des pieces.
     * @return vrai si il reste des pieces, false sinon.
     */
    public boolean existPiece(ObservableList entite){
        for(Object e :entite){
            if(e instanceof Piece){
                return true;
            }
        }
        return false;
    }

    /**
     * Methode qui permet de gerer le deplacement des fantomes.
     */
    public void deplaceFantome(){
        Random random=new Random();
        int r=random.nextInt(4);
        int r2= random.nextInt(4);
        int r3= random.nextInt(4);
        int r4= random.nextInt(4);
        if(r==1){
            deplaceurFantome.moveUp(fantome2);
        }
        if(r==2){
            deplaceurFantome.moveLeft(fantome2);
        }
        if(r==3){
            deplaceurFantome.moveRight(fantome2);
        }
        if(r==4){
            deplaceurFantome.moveDown(fantome2);
        }
        if(r2==1){
            deplaceurFantome.moveUp(fantome1);
        }
        if(r2==2){
            deplaceurFantome.moveLeft(fantome1);
        }
        if(r2==3){
            deplaceurFantome.moveRight(fantome1);
        }
        if(r2==4){
            deplaceurFantome.moveDown(fantome1);
        }
        if(r3==1){
            deplaceurFantome.moveUp(fantome3);
        }
        if(r3==2){
            deplaceurFantome.moveLeft(fantome3);
        }
        if(r3==3){
            deplaceurFantome.moveRight(fantome3);
        }
        if(r3==4){
            deplaceurFantome.moveDown(fantome3);
        }
        if(r4==1){
            deplaceurFantome.moveUp(fantome4);
        }
        if(r4==2){
            deplaceurFantome.moveLeft(fantome4);
        }
        if(r4==3){
            deplaceurFantome.moveRight(fantome4);
        }
        if(r4==4){
            deplaceurFantome.moveDown(fantome4);
        }
    }

    /**
     * Methode qui permet de verifier dans une ObservableList si il existe encore un pacman.
     * @param entite ObservableList dans laquelle nous voulons chercher le pacman.
     * @return True si il reste un pacman, false sinon.
     */
    public boolean existPacman(ObservableList entite){
        for(Object e :entite){
            if(e instanceof Pacman){
                return true;
            }
        }
        return false;
    }
}