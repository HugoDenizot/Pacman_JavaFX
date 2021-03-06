package modele;

import modele.Monde;
import modele.createurs.CreateurEntite;
import modele.entites.Wall;

/**
 * Classe abstraite contenant la methode chargerPlateau qui contient toute les creations d'entites pour jouer.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public abstract class Plateau {
    /**
     * Méthode abstraite qui permet de creer un Plateau constitue de Wall, de piece et de Bonus.
     * @param Createur Createur qui doit être passe pour pouvoir creer les entites.
     * @param leMonde Monde dans lequel nous voulons creer les entites.
     */
    public static void chargerPlateau(CreateurEntite Createur, Monde leMonde){
        Wall w=new Wall(0,0,"/img/wall.png");
        int i=0;
        while(i<=500){
            Createur.creerWall(leMonde,0,i);
            i=i+w.getMaxHeight();
        }
        i=0;
        while(i<=500){
            Createur.creerWall(leMonde, 450,i);
            i=i+w.getMaxHeight();
        }
        i=0;
        while(i<=450){
            Createur.creerWall(leMonde,i,0);
            i=i+w.getMaxWidth();
        }
        i=0;
        while(i<=450){
            Createur.creerWall(leMonde,i,500);
            i=i+w.getMaxWidth();
        }
        Createur.creerWall(leMonde,225,25);
        Createur.creerWall(leMonde,225,50);
        Createur.creerWall(leMonde,200,50);
        Createur.creerWall(leMonde,250,50);
        Createur.creerWall(leMonde,275,50);
        Createur.creerWall(leMonde,175,50);
        Createur.creerWall(leMonde,150,50);
        Createur.creerWall(leMonde,300,50);
        Createur.creerWall(leMonde,400,50);
        Createur.creerWall(leMonde,125,50);
        Createur.creerWall(leMonde,325,50);
        Createur.creerWall(leMonde,375,50);
        Createur.creerWall(leMonde,75,50);
        Createur.creerWall(leMonde,50,50);
        Createur.creerWall(leMonde,225,100);
        Createur.creerWall(leMonde,200,100);
        Createur.creerWall(leMonde,250,100);
        Createur.creerWall(leMonde,275,100);
        Createur.creerWall(leMonde,175,100);
        Createur.creerWall(leMonde,400,100);
        Createur.creerWall(leMonde,375,100);
        Createur.creerWall(leMonde,50,100);
        Createur.creerWall(leMonde,75,100);
        Createur.creerWall(leMonde,125,100);
        Createur.creerWall(leMonde,325,100);
        Createur.creerWall(leMonde,225,125);
        Createur.creerWall(leMonde,125,125);
        Createur.creerWall(leMonde,325,125);
        Createur.creerWall(leMonde,225,150);
        Createur.creerWall(leMonde,125,150);
        Createur.creerWall(leMonde,325,150);
        Createur.creerWall(leMonde,25,150);
        Createur.creerWall(leMonde,50,150);
        Createur.creerWall(leMonde,75,150);
        Createur.creerWall(leMonde,425,150);
        Createur.creerWall(leMonde,375,150);
        Createur.creerWall(leMonde,425,150);
        Createur.creerWall(leMonde,175,150);
        Createur.creerWall(leMonde,150,150);
        Createur.creerWall(leMonde,300,150);
        Createur.creerWall(leMonde,275,150);
        Createur.creerWall(leMonde,400,150);
        Createur.creerWall(leMonde,75,175);
        Createur.creerWall(leMonde,125,175);
        Createur.creerWall(leMonde,325,175);
        Createur.creerWall(leMonde,375,175);
        Createur.creerWall(leMonde,225,200);
        Createur.creerWall(leMonde,125,200);
        Createur.creerWall(leMonde,325,200);
        Createur.creerWall(leMonde,25,200);
        Createur.creerWall(leMonde,50,200);
        Createur.creerWall(leMonde,75,200);
        Createur.creerWall(leMonde,425,200);
        Createur.creerWall(leMonde,375,200);
        Createur.creerWall(leMonde,425,200);
        Createur.creerWall(leMonde,175,200);
        Createur.creerWall(leMonde,275,200);
        Createur.creerWall(leMonde,400,200);
        Createur.creerWall(leMonde,175,225);
        Createur.creerWall(leMonde,275,225);
        Createur.creerWall(leMonde,225,250);
        Createur.creerWall(leMonde,125,250);
        Createur.creerWall(leMonde,325,250);
        Createur.creerWall(leMonde,25,250);
        Createur.creerWall(leMonde,50,250);
        Createur.creerWall(leMonde,75,250);
        Createur.creerWall(leMonde,425,250);
        Createur.creerWall(leMonde,375,250);
        Createur.creerWall(leMonde,425,250);
        Createur.creerWall(leMonde,175,250);
        Createur.creerWall(leMonde,275,250);
        Createur.creerWall(leMonde,400,250);
        Createur.creerWall(leMonde,200,250);
        Createur.creerWall(leMonde,250,250);
        Createur.creerWall(leMonde,75,275);
        Createur.creerWall(leMonde,125,275);
        Createur.creerWall(leMonde,325,275);
        Createur.creerWall(leMonde,375,275);
        Createur.creerWall(leMonde,225,300);
        Createur.creerWall(leMonde,125,300);
        Createur.creerWall(leMonde,325,300);
        Createur.creerWall(leMonde,25,300);
        Createur.creerWall(leMonde,50,300);
        Createur.creerWall(leMonde,75,300);
        Createur.creerWall(leMonde,425,300);
        Createur.creerWall(leMonde,375,300);
        Createur.creerWall(leMonde,425,300);
        Createur.creerWall(leMonde,175,300);
        Createur.creerWall(leMonde,275,300);
        Createur.creerWall(leMonde,400,300);
        Createur.creerWall(leMonde,200,300);
        Createur.creerWall(leMonde,250,300);
        Createur.creerWall(leMonde,225,325);
        Createur.creerWall(leMonde,225,350);
        Createur.creerWall(leMonde,200,350);
        Createur.creerWall(leMonde,250,350);
        Createur.creerWall(leMonde,275,350);
        Createur.creerWall(leMonde,175,350);
        Createur.creerWall(leMonde,150,350);
        Createur.creerWall(leMonde,300,350);
        Createur.creerWall(leMonde,400,350);
        Createur.creerWall(leMonde,125,350);
        Createur.creerWall(leMonde,325,350);
        Createur.creerWall(leMonde,375,350);
        Createur.creerWall(leMonde,75,350);
        Createur.creerWall(leMonde,50,350);
        Createur.creerWall(leMonde,75,375);
        Createur.creerWall(leMonde,375,375);
        Createur.creerWall(leMonde,225,400);
        Createur.creerWall(leMonde,200,400);
        Createur.creerWall(leMonde,250,400);
        Createur.creerWall(leMonde,275,400);
        Createur.creerWall(leMonde,175,400);
        Createur.creerWall(leMonde,425,400);
        Createur.creerWall(leMonde,375,400);
        Createur.creerWall(leMonde,25,400);
        Createur.creerWall(leMonde,75,400);
        Createur.creerWall(leMonde,125,400);
        Createur.creerWall(leMonde,325,400);
        Createur.creerWall(leMonde,225,425);
        Createur.creerWall(leMonde,125,425);
        Createur.creerWall(leMonde,325,425);
        Createur.creerWall(leMonde,225,450);
        Createur.creerWall(leMonde,125,450);
        Createur.creerWall(leMonde,325,450);
        Createur.creerWall(leMonde,175,450);
        Createur.creerWall(leMonde,125,450);
        Createur.creerWall(leMonde,150,450);
        Createur.creerWall(leMonde,100,450);
        Createur.creerWall(leMonde,75,450);
        Createur.creerWall(leMonde,50,450);
        Createur.creerWall(leMonde,275,450);
        Createur.creerWall(leMonde,300,450);
        Createur.creerWall(leMonde,325,450);
        Createur.creerWall(leMonde,350,450);
        Createur.creerWall(leMonde,375,450);
        Createur.creerWall(leMonde,400,450);




        Createur.creerBonus(leMonde,25,25);
        Createur.creerPiece(leMonde,50,25);
        Createur.creerPiece(leMonde,75,25);
        Createur.creerPiece(leMonde,100,25);
        Createur.creerPiece(leMonde,125,25);
        Createur.creerPiece(leMonde,150,25);
        Createur.creerPiece(leMonde,175,25);
        Createur.creerPiece(leMonde,200,25);
        Createur.creerPiece(leMonde,250,25);
        Createur.creerPiece(leMonde,275,25);
        Createur.creerPiece(leMonde,300,25);
        Createur.creerPiece(leMonde,325,25);
        Createur.creerPiece(leMonde,350,25);
        Createur.creerPiece(leMonde,375,25);
        Createur.creerPiece(leMonde,400,25);
        Createur.creerBonus(leMonde,425,25);
        Createur.creerPiece(leMonde,25,50);
        Createur.creerPiece(leMonde,100,50);
        Createur.creerPiece(leMonde,350,50);
        Createur.creerPiece(leMonde,425,50);
        Createur.creerPiece(leMonde,25,75);
        Createur.creerPiece(leMonde,50,75);
        Createur.creerPiece(leMonde,75,75);
        Createur.creerPiece(leMonde,100,75);
        Createur.creerPiece(leMonde,125,75);
        Createur.creerPiece(leMonde,150,75);
        Createur.creerPiece(leMonde,175,75);
        Createur.creerPiece(leMonde,200,75);
        Createur.creerBonus(leMonde,225,75);
        Createur.creerPiece(leMonde,250,75);
        Createur.creerPiece(leMonde,275,75);
        Createur.creerPiece(leMonde,300,75);
        Createur.creerPiece(leMonde,325,75);
        Createur.creerPiece(leMonde,350,75);
        Createur.creerPiece(leMonde,375,75);
        Createur.creerPiece(leMonde,400,75);
        Createur.creerPiece(leMonde,425,75);
        Createur.creerPiece(leMonde,25,100);
        Createur.creerPiece(leMonde,100,100);
        Createur.creerPiece(leMonde,150,100);
        Createur.creerPiece(leMonde,300,100);
        Createur.creerPiece(leMonde,350,100);
        Createur.creerPiece(leMonde,425,100);
        Createur.creerBonus(leMonde,25,125);
        Createur.creerPiece(leMonde,50,125);
        Createur.creerPiece(leMonde,75,125);
        Createur.creerPiece(leMonde,100,125);
        Createur.creerPiece(leMonde,150,125);
        Createur.creerPiece(leMonde,175,125);
        Createur.creerPiece(leMonde,200,125);
        Createur.creerPiece(leMonde,250,125);
        Createur.creerPiece(leMonde,275,125);
        Createur.creerPiece(leMonde,300,125);
        Createur.creerPiece(leMonde,350,125);
        Createur.creerPiece(leMonde,375,125);
        Createur.creerPiece(leMonde,400,125);
        Createur.creerBonus(leMonde,425,125);
        Createur.creerPiece(leMonde,100,150);
        Createur.creerPiece(leMonde,200,150);
        Createur.creerPiece(leMonde,250,150);
        Createur.creerPiece(leMonde,350,150);
        Createur.creerPiece(leMonde,100,175);
        Createur.creerPiece(leMonde,200,175);
        Createur.creerPiece(leMonde,250,175);
        Createur.creerPiece(leMonde,350,175);
        Createur.creerPiece(leMonde,150,175);
        Createur.creerPiece(leMonde,175,175);
        Createur.creerPiece(leMonde,275,175);
        Createur.creerPiece(leMonde,300,175);
        Createur.creerPiece(leMonde,225,175);
        Createur.creerPiece(leMonde,100,200);
        Createur.creerPiece(leMonde,150,200);
        Createur.creerPiece(leMonde,300,200);
        Createur.creerPiece(leMonde,350,200);
        Createur.creerBonus(leMonde,25,225);
        Createur.creerPiece(leMonde,50,225);
        Createur.creerPiece(leMonde,75,225);
        Createur.creerPiece(leMonde,100,225);
        Createur.creerPiece(leMonde,125,225);
        Createur.creerPiece(leMonde,150,225);
        Createur.creerPiece(leMonde,300,225);
        Createur.creerPiece(leMonde,325,225);
        Createur.creerPiece(leMonde,350,225);
        Createur.creerPiece(leMonde,375,225);
        Createur.creerPiece(leMonde,400,225);
        Createur.creerBonus(leMonde,425,225);
        Createur.creerPiece(leMonde,100,250);
        Createur.creerPiece(leMonde,150,250);
        Createur.creerPiece(leMonde,300,250);
        Createur.creerPiece(leMonde,350,250);
        Createur.creerPiece(leMonde,100,275);
        Createur.creerPiece(leMonde,150,275);
        Createur.creerPiece(leMonde,300,275);
        Createur.creerPiece(leMonde,350,275);
        Createur.creerPiece(leMonde,175,275);
        Createur.creerPiece(leMonde,200,275);
        Createur.creerPiece(leMonde,250,275);
        Createur.creerPiece(leMonde,275,275);
        Createur.creerPiece(leMonde,100,300);
        Createur.creerPiece(leMonde,150,300);
        Createur.creerPiece(leMonde,300,300);
        Createur.creerPiece(leMonde,350,300);
        Createur.creerBonus(leMonde,25,325);
        Createur.creerPiece(leMonde,50,325);
        Createur.creerPiece(leMonde,75,325);
        Createur.creerPiece(leMonde,100,325);
        Createur.creerPiece(leMonde,125,325);
        Createur.creerPiece(leMonde,150,325);
        Createur.creerPiece(leMonde,300,325);
        Createur.creerPiece(leMonde,325,325);
        Createur.creerPiece(leMonde,350,325);
        Createur.creerPiece(leMonde,375,325);
        Createur.creerPiece(leMonde,400,325);
        Createur.creerBonus(leMonde,425,325);
        Createur.creerPiece(leMonde,175,325);
        Createur.creerPiece(leMonde,200,325);
        Createur.creerPiece(leMonde,250,325);
        Createur.creerPiece(leMonde,275,325);
        Createur.creerPiece(leMonde,25,350);
        Createur.creerPiece(leMonde,100,350);
        Createur.creerPiece(leMonde,350,350);
        Createur.creerPiece(leMonde,425,350);
        Createur.creerPiece(leMonde,25,375);
        Createur.creerPiece(leMonde,50,375);
        Createur.creerPiece(leMonde,100,375);
        Createur.creerPiece(leMonde,125,375);
        Createur.creerPiece(leMonde,150,375);
        Createur.creerPiece(leMonde,175,375);
        Createur.creerPiece(leMonde,200,375);
        Createur.creerBonus(leMonde,225,375);
        Createur.creerPiece(leMonde,250,375);
        Createur.creerPiece(leMonde,275,375);
        Createur.creerPiece(leMonde,300,375);
        Createur.creerPiece(leMonde,325,375);
        Createur.creerPiece(leMonde,350,375);
        Createur.creerPiece(leMonde,400,375);
        Createur.creerPiece(leMonde,425,375);
        Createur.creerPiece(leMonde,300,400);
        Createur.creerPiece(leMonde,150,400);
        Createur.creerPiece(leMonde,100,400);
        Createur.creerPiece(leMonde,350,400);
        Createur.creerPiece(leMonde,400,400);
        Createur.creerPiece(leMonde,50,400);
        Createur.creerPiece(leMonde,25,425);
        Createur.creerPiece(leMonde,50,425);
        Createur.creerPiece(leMonde,75,425);
        Createur.creerPiece(leMonde,100,425);
        Createur.creerPiece(leMonde,150,425);
        Createur.creerPiece(leMonde,175,425);
        Createur.creerPiece(leMonde,200,425);
        Createur.creerPiece(leMonde,250,425);
        Createur.creerPiece(leMonde,275,425);
        Createur.creerPiece(leMonde,300,425);
        Createur.creerPiece(leMonde,350,425);
        Createur.creerPiece(leMonde,375,425);
        Createur.creerPiece(leMonde,400,425);
        Createur.creerPiece(leMonde,425,425);
        Createur.creerPiece(leMonde,25,450);
        Createur.creerPiece(leMonde,200,450);
        Createur.creerPiece(leMonde,250,450);
        Createur.creerPiece(leMonde,425,450);
        Createur.creerBonus(leMonde,25,475);
        Createur.creerPiece(leMonde,50,475);
        Createur.creerPiece(leMonde,75,475);
        Createur.creerPiece(leMonde,100,475);
        Createur.creerPiece(leMonde,125,475);
        Createur.creerPiece(leMonde,150,475);
        Createur.creerPiece(leMonde,175,475);
        Createur.creerPiece(leMonde,200,475);
        Createur.creerPiece(leMonde,225,475);
        Createur.creerPiece(leMonde,250,475);
        Createur.creerPiece(leMonde,275,475);
        Createur.creerPiece(leMonde,300,475);
        Createur.creerPiece(leMonde,325,475);
        Createur.creerPiece(leMonde,350,475);
        Createur.creerPiece(leMonde,375,475);
        Createur.creerPiece(leMonde,400,475);
        Createur.creerBonus(leMonde,425,475);
    }
}
