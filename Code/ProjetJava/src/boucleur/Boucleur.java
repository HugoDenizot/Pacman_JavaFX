package boucleur;

import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Le boucleur est une classe permettant d'effectuer une action a un intervalle de temps regulier.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public abstract class Boucleur implements Runnable, Observable {
    /**
     * C'est la liste de tout les objets observes par le boucleur.
     */
    private List<InvalidationListener> lesObservateurs=new ArrayList<>();
    /**
     * L'attribut actif sert a savoir si le boucleur doit continuer de boucler ou non.
     */
    protected boolean actif=false;

    /**
     * Cette fonction sert a savoir si le boucleur est actif ou non (utile pour que le jeu s'arrete a la fin de la partie).
     * @return
     */
    public boolean isActif() {
        return actif;
    }

    /**
     * Sert a changer la variable actif de valeur, notamment en fin de partie ou alors si le bouleur a un probleme.
     * @param actif le boolean que l'on veut définir
     */
    public void setActif(boolean actif) {
        this.actif = actif;
    }

    /**
     * Sert a ajouter un objet a la liste de ce que le boucleur vas écouter.
     * @param Listener L'objet a ajouter.
     */
    @Override
    public void addListener(InvalidationListener Listener) {
        lesObservateurs.add(Listener);
    }

    /**
     * Sert a supprimer un objet de la liste de ce que le boucleur va ecouter.
     * @param Listener L'objet a supprimer.
     */
    @Override
    public void removeListener(InvalidationListener Listener) {
        lesObservateurs.remove(Listener);
    }

    /**
     * Methode appele toute les seconde dans le boucleur. Elle appelle la methode invalidated de chaque element ecoute.
     */
    protected void beep(){
        lesObservateurs.forEach(o-> Platform.runLater(()->o.invalidated(this)));
    }
}
