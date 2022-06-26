package view;
import javafx.collections.ListChangeListener;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import launch.Launch;
import modele.Manager;
import modele.entites.Entite;
import modele.entites.Pacman;
import java.util.Iterator;

/**
 * Code Behind de la fenetre FXML FenetrePrincipale.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class FenetrePrincipale {
    /**
     * Attribut Pane qui contient le Jeu.
     */
    @FXML
    private Pane zonedeJeux;
    /**
     * Attribut point qui va recuperer les points fait par le joueur.
     */
    private int point;
    /**
     * Attribut Score qui va mettre a jour le Score sur la vue.
     */
    @FXML
    private Text Score;

    /**
     * Methode qui s'execute lors de la creation de la fenetre FenetrePrincipale Elle permet de mettre a jour la vue entre le code et la vue a chaque changement de la liste Entite
     * dans le manager.
     */
    public  void initialize(){
        point=0;
        Score.setText(Integer.toString(point));
        for (Entite entite : Launch.getLeManager().getListEntite()) {
            updatePanneau(entite);
        }
        Launch.getLeManager().getListEntite().addListener((ListChangeListener.Change<? extends Entite> c) ->{
                c.next();
                for(Entite entite:c.getAddedSubList()){
                    updatePanneau(entite);
                    point=point+entite.getPoint();
                }
                for(Entite entite:c.getRemoved()){
                    Iterator<Node>lIterateur=zonedeJeux.getChildren().iterator();
                    while(lIterateur.hasNext()){
                        Node leNote=lIterateur.next();
                        if(leNote.getUserData()==entite){
                            lIterateur.remove();
                        }
                    }
                    point=point+entite.getPoint();
                }
            Score.setText(Integer.toString(point));
            }
        );
    }

    /**
     * Methode qui est appele a chaque changement et au debut de la creation de la fenetre. Elle permet pour une entite donnee, de mettre a jour l'ImageView de l'entite correspondante
     * et de mettre a jour sa position avant de la mettre dans la zonedeJeux.
     * @param entite
     */
    private void updatePanneau(Entite entite) {
        ImageView entiteAAfficher = new ImageView();
        entiteAAfficher.setUserData(entite);
        entiteAAfficher.setImage(new Image(getClass().getResource(entite.getCheminImage()).toExternalForm()));
        entiteAAfficher.layoutXProperty().bind(entite.xProperty());
        entiteAAfficher.layoutYProperty().bind(entite.yProperty());
        entiteAAfficher.imageProperty().bind(entite.imageProperty());
        entiteAAfficher.setFitWidth(entite.getMaxWidth());
        entiteAAfficher.setFitHeight(entite.getMaxHeight());
        zonedeJeux.getChildren().add(entiteAAfficher);
    }

}
