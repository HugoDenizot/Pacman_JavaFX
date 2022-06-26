package modele.entites;

/**
 * Classe qui permet de creer une entite de classe Pacman.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class Pacman extends Entite {
    /**
     * Attribut qui donne le nombre de point de vie de Pacman avant de perdre.
     */
    public int pointDeVie;
    /**
     * Attribut qui donne le temps qu'il reste comme Bonus a Pacman pour pouvoir manger les fantomes.
     */
    public int Bonus;

    /**
     * Constructeur qui permet de creer un Pacman a une position souhaitee.
     * @param x Position x souhaitee.
     * @param y Position y souhaitee.
     * @param image chemin de l'image du pacman souhaitee.
     */
    public Pacman(double x, double y, String image) {
        super(x, y, image);
        maxHeight=25;
        maxWidth=25;
        point=0;
        pointDeVie=3;
        Bonus=0;
    }

    /**
     * Methode qui permet de recuperer le nombre de point de vie du pacman.
     * @return pointDeVie
     */
    public int getPointDeVie() {
        return pointDeVie;
    }

    /**
     * Methode qui permet de definir le nombre de point de vie du pacman.
     * @param pointDeVie nouvelle valeur des points de vie.
     */
    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    /**
     * Methode qui permet de recuperer le nombre de bonus du pacman.
     * @return bonus.
     */
    public int getBonus() {
        return Bonus;
    }

    /**
     * Methode qui permet de definir un nombre de bonus au pacman.
     * @param bonus nouvelle valeur de bonus.
     */
    public void setBonus(int bonus) {
        Bonus = bonus;
    }
}
