package modele.createurs;

import modele.entites.*;
import modele.Monde;

/**
 * Cette classe herite de la classe CreateurEntite et permet de definir les methodes de façon plus precise.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class CreateurEntiteSimple extends  CreateurEntite {
    /**
     * Cette methode sert a cree un pacman, on lui donne une image et une position defini.
     * @param m On donne le monde dans lequel on souhaite ajouter cette entite.
     * @return On return le Pacman cree afin de le recuperer dans le manager.
     */
    @Override
    public Pacman creerPacman(Monde m){
        Pacman retour=new Pacman(225,275,"/img/pacmanRight.gif");
        m.ajouterEntite(retour);
        return retour;
    }

    /**
     * Cette methode sert a cree une piece selon une position defini lors de l'appel de la methode.
     * @param m Le monde dans lequel on souhaite ajouter la piece.
     * @param x La coordonnee x de la piece.
     * @param y La coordonnee y de la piece.
     */
    @Override
    public void creerPiece(Monde m, double x, double y) {
      m.ajouterEntite(new Piece(x,y,"/img/smalldot.png"));
    }

    /**
     * Cette methode sert a cree une bonus selon une position defini lors de l'appel de la methode.
     * @param m Le monde dans lequel on souhaite ajouter le bonus.
     * @param x La coordonnee x du bonus.
     * @param y La coordonnee y du bonus.
     */
    @Override
    public void creerBonus(Monde m, double x, double y) {
        m.ajouterEntite(new Bonus(x,y,"/img/whitedot.png"));
    }

    /**
     * Cette methode sert a cree un Wall a une position defini lors de l'appel de la methode.
     * @param m Le monde dans lequel on souhaite ajouter le Wall.
     * @param x La coordonnee x de le Wall.
     * @param y La coordonnee y de le Wall.
     */
    @Override
    public void creerWall(Monde m,double x, double y){
        m.ajouterEntite(new Wall(x,y,"/img/wall.png"));
    }

    /**
     * Cette methode sert a cree un fantome rouge a une position definit.
     * @param m On donne le monde dans lequel on souhaite ajouter cette entite.
     * @return Retourne le fantome cree pour pouvoir le récuperer dans le Manager.
     */
    @Override
    public Fantome creerFantome1(Monde m){
        Fantome f=new Fantome(25, 25, "/img/redghost.gif");
        m.ajouterEntite(f);
        return f;
    }

    /**
     * Cette méthode sert a cree un fantome rose a une position definit.
     * @param m On donne le monde dans lequel on souhaite ajouter cette entite.
     * @return Retourne le fantome cree pour pouvoir le récuperer dans le Manager.
     */
    @Override
    public Fantome creerFantome2(Monde m){
        Fantome f=new Fantome(425, 25, "/img/ghost1.gif");
        m.ajouterEntite(f);
        return f;
    }

    /**
     * Cette méthode sert a cree un fantome orange a une position definit.
     * @param m On donne le monde dans lequel on souhaite ajouter cette entite.
     * @return Retourne le fantome cree pour pouvoir le recuperer dans le Manager.
     */
    @Override
    public Fantome creerFantome3(Monde m){
        Fantome f=new Fantome(25, 500, "/img/ghost2.gif");
        m.ajouterEntite(f);
        return f;
    }

    /**
     * Cette méthode sert a cree un fantome cyan a une position definit.
     * @param m On donne le monde dans lequel on souhaite ajouter cette entite.
     * @return Retourne le fantome cree pour pouvoir le recuperer dans le Manager.
     */
    @Override
    public Fantome creerFantome4(Monde m){
        Fantome f=new Fantome(425, 500, "/img/ghost3.gif");
        m.ajouterEntite(f);
        return f;
    }
}
