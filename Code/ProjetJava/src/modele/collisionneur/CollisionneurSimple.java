package modele.collisionneur;

import modele.Monde;
import modele.entites.*;
import java.util.Iterator;

/**
 * La classe CollisionneurSimple herite des methodes de la classe Collisionneur mais cette fois ci en les definissant.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class CollisionneurSimple extends Collisionneur {
    /**
     * On construit ici un ColliosionneurSimple en lui donnant un attribut monde.
     * @param leMonde Le monde que l'on donnne au collisionneur.
     */
    public CollisionneurSimple(Monde leMonde) {
        super(leMonde);
    }

    /**
     * Comme pour sa classe mere cette methode definit si oui ou non l'entite peut se deplacer en verifiant qu'aucune autre entite n'est presente et que sa position est loin du bord
     * de la fenetre.
     * @param x On donne ici la position x de l'entite qui souhaite se deplacer.
     * @param y On donne ici la position y de l'entite qui souhaite se deplacer.
     * @param pacmanEnCours On donne ici l'entite qui souhaite se deplacer.
     * @return Et on return un boolean precisant si elle peut se deplacer ou non.
     */
    @Override
    public boolean canMove(double x, double y,Entite pacmanEnCours) {
        if(isPresent(x,y,pacmanEnCours)==false){
            return false;
        }
        return x>0 && x<=getWidth()-25 && y>0 && y<=getHeight()-25;
    }

    /**
     * Comme pour sa classe mere cette methode definit si oui ou non l'entite peut se deplacer en verifiant que si il existe une entite a cote, celle-ci peut etre passe ou non.
     * Dans un premier temps nous allons verifier que l'entite est un pacman ou un fantome (les deux seuls entites qui puisse se deplacer) puis nous allons regarder suivant le cas,
     * quelles entites elle essaye de passer, si une entite proche est un mur elles ne pourront pas le passer, si une entite pacman rencontre un fantome il perdra une vie ou mourra, ou alors
     * il la mangera dans certains cas. Si il rencontre une piece ou un bonus il le mangera.
     * @param x On donne ici la position x de l'entite qui souhaite se deplacer.
     * @param y On donne ici la position y de l'entite qui souhaite se deplacer.
     * @param pacman Entite qui souhaite se deplacer.
     * @return Return un boolean qui precise si elle peut se deplacer ou non.
     */
    @Override
    public boolean isPresent(double x, double y, Entite pacman) {
        Iterator<Entite> lIterateur=leMonde.getLesEntites().iterator();
        while(lIterateur.hasNext()){
            Entite entite=lIterateur.next();
            if(pacman instanceof Pacman){
                if(entite instanceof Wall&&entite.getX()>x-25 && entite.getX()<x+25 && entite.getY()>y-25 && entite.getY()<y+25){
                    return false;
                }
                if(entite instanceof Bonus &&entite.getX()>x-25 && entite.getX()<x+25 && entite.getY()>y-25 && entite.getY()<y+25){
                    ((Pacman) pacman).setBonus(30);
                    leMonde.supprimerEntite(entite);
                    return true;
                }
                if(entite instanceof Pacman){
                    continue;
                }
                if(entite instanceof Fantome && entite.getX()>x-25 && entite.getX()<x+25 && entite.getY()>y-25 && entite.getY()<y+25){
                    if(((Pacman) pacman).getBonus()>0){
                        entite.setY(225);
                        entite.setX(225);
                        return true;
                    }else{
                        if(((Pacman) pacman).getPointDeVie()!=1){
                            pacman.setX(225);
                            pacman.setY(275);
                            ((Pacman) pacman).setPointDeVie(((Pacman) pacman).getPointDeVie()-1);
                        }else{
                            leMonde.supprimerEntite(pacman);
                        }
                    }
                    return true;
                }
                if(entite.getX()-25<x && entite.getX()+25>x && entite.getY()-25<y && entite.getY()+25>y){
                  leMonde.supprimerEntite(entite);
                  return true;
                }
            }
            if(pacman instanceof Fantome){
                if(entite instanceof Wall&&entite.getX()>x-25 && entite.getX()<x+25 && entite.getY()>y-25 && entite.getY()<y+25){
                    return false;
                }
            }
        }
        return true;
    }
}
