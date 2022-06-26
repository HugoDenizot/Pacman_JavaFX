package launch;

import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import modele.Manager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * La classe Launch est la premiere classe qui s'execute lors du lancement de l'application. C'est elle qui gere la gestion des fenetres.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class Launch extends Application {
    /**
     * On donne a la classe Launch un attribut de type Manager qui se chargera de s'occuper de lier toute les classe entre elle.
     */
    private static Manager leManager= new Manager();

    /**
     * La methode start se lance des le debut de l'application. Cette methode récupere en paramètre un stage et ensuite, elle cree une fenetre
     * ici la fenetre de base est la fenetre lancement. C'est aussi cette methode qui va saisir dès que l'utilisateur utilise les touches de son
     * clavier pour appeler la methode deplacer du manager.
     * @param primaryStage C'est la fenetre de base qui contiendra les vues.
     * @throws Exception Elle gere toute les exceptions données par le programme.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Lancement.fxml"));
        Scene laScene=new Scene(root);
        laScene.addEventFilter(KeyEvent.KEY_PRESSED, leManager::deplace);
        primaryStage.setScene(laScene);
        leManager.getLeCollisionneur().heightProperty().bind(primaryStage.heightProperty());
        leManager.getLeCollisionneur().widthProperty().bind(primaryStage.widthProperty());
        primaryStage.setTitle("Pac-Man");
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("/img/Pacman.png"));
        primaryStage.show();
    }

    /**
     * Cette methode sert a remplacer l'interieur de la stage. Elle remplacera l'interieur de la fenetre par une vue donnee lors de l'appel de la fonction.
     * @param e Evenement qui declenche l'appel de la fonction
     * @param chemin Chemin de la nouvelle fenetre.
     */
    public static void charger(Event e, String chemin){
        Parent launch;
        try{
            launch=FXMLLoader.load(Launch.class.getResource(chemin));
            Stage stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
            stage.setResizable(false);
            stage.setHeight(600);
            stage.setWidth(625);
            Scene scene= stage.getScene();
            scene.setRoot(launch);
        }catch (IOException e1){
            e1.printStackTrace();
        }
    }

    /**
     * Cette methode sert a arreter le boucleur puis ensuite a arrete l'application entiere.
     * @throws Exception On throw une Exception si le code a une erreur lors de la fermeture de l'application.
     */
    @Override
    public void stop() throws Exception {
        leManager.stopBoucleur();
        super.stop();
    }

    /**
     * Cette methode sert a recuperer le manager du Launcher.
     * @return On return ici le manager demande.
     */
    public static Manager getLeManager() {
        return leManager;
    }
}
