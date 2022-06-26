package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import launch.Launch;

/**
 * Code Behind de la fenetre FXML Lancement.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class Lancement {
    /**
     * Attribut qui correspond a l'imageView de l'image du Menu.
     */
    @FXML
    private ImageView imageAccueil;
    /**
     * Attribut qui correspond au Bouton Jouer.
     */
    @FXML
    private Button bouton1=new Button();
    /**
     * Attribut qui correspond au Bouton Regle.
     */
    @FXML
    private Button bouton2=new Button();

    /**
     * Methode qui se lance lors de la Creation de la fenetre et qui met a jour les images et les boutons.
     */
    public void initialize(){
        imageAccueil.setImage(new Image("/img/Menu.jpg"));
        bouton1.setText("Jouer");
        bouton2.setText("Règle");
    }

    /**
     * Methode qui se lance lors d'un click sur le bouton Jouer et qui lance le jeu
     * @param actionEvent Click sur le bouton
     */
    @FXML
    private void LancementJeu(ActionEvent actionEvent) {
        Launch.charger(actionEvent,"/fxml/FenetrePrincipale.fxml");
    }

    /**
     * Methode qui se lance lors d'un click sur le bouton CommentJouer
     * @param actionEvent Click sur le bouton
     */
    @FXML
    private void CommentJouer(ActionEvent actionEvent) {
        Launch.charger(actionEvent,"/fxml/CommentJouer.fxml");
    }
}
