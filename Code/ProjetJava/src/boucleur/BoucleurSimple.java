package boucleur;

/**
 * La classe Boucleursimple est une classe qui herite de toute les propriete dans Boucleur.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class BoucleurSimple extends Boucleur {
    /**
     * La fonction run s'execute tout le long du programme.
     * Elle effectue une boucle while pour etre sur que le boucleur soit bien actif et si c'est le cas, elle appelle la methode beep,
     * puis arrete le thread pendant une seconde.
     */
    public void run(){
        while(isActif()){
            beep();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                setActif(false);
            }
        }
    }
}
