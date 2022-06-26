package modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modele.entites.Entite;

/**
 * Classe qui permet de creer un Monde contenant des entites.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class Monde {
        /**
         * ObservableList contenant des entites.
         */
        private ObservableList<Entite> lesEntites = FXCollections.observableArrayList();

        /**
         * Méthode qui permet d'ajouter une entite a l'ObservableList.
         * @param e Entité que l'on souhaite ajouter.
         */
        public  void ajouterEntite(Entite e){
                lesEntites.add(e);
        }

        /**
         * Méthode qui permet de recuperer l'ObservableList.
         * @return l'ObservableList d'entite.
         */
        public ObservableList<Entite> getLesEntites(){
         return FXCollections.unmodifiableObservableList(lesEntites);
        }

        /**
         * Methode qui permet de supprimer une entite de l'ObservableList.
         * @param e Entite que l'on souhaite supprimer.
         */
        public void supprimerEntite(Entite e){
                lesEntites.remove(e);
        }
}
