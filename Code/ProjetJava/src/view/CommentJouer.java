package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import launch.Launch;

/**
 * Code Behind de la fenetre FXML Comment Jouer.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class CommentJouer {
    /**
     * Attribut correspond a l'image de Clavier.
     */
    @FXML
    private ImageView clavier;
    /**
     * Attribut correspondant a l'image de fantome.
     */
    @FXML
    private ImageView fantome;
    /**
     * Attribut correspondant a l'image de pièce.
     */
    @FXML
    private ImageView piece;
    /**
     * Label correspondant a la première explication.
     */
    @FXML
    private Label l1;
    /**
     * Label correspondant a la deuxième explication.
     */
    @FXML
    private Label l2;
    /**
     * Label correspondant a la dernière explication.
     */
    @FXML
    private Label l3;

    /**
     * Methode qui se déclenche lors de la creation de la fenêtre Comment Jouer. Elle permet de mettre toutes les images et de definir les Wraps des labels.
     */
    public void initialize(){
        clavier.setImage(new Image("/img/flechesclavier.png"));
        fantome.setImage(new Image("/img/redghost.gif"));
        piece.setImage(new Image("/img/smalldot.png"));
        l1.setWrapText(true);
        l2.setWrapText(true);
        l3.setWrapText(true);
    }

    /**
     * Methode qui se declenche lors de l'appuie sur le bouton Menu
     * @param actionEvent Click sur le bouton.
     */
    @FXML
    private void Menu(ActionEvent actionEvent) {
        Launch.charger(actionEvent,"/fxml/Lancement.fxml");
    }

    /**
     * Methode qui se declenche lors de l'appuie sur le bouton Jouer
     * @param actionEvent Click sur le bouton.
     */
    @FXML
    private void Jouer(ActionEvent actionEvent) {
        Launch.charger(actionEvent,"/fxml/FenetrePrincipale.fxml");
    }
}
