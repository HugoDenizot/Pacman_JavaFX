package persistance;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe qui sert a la persistance de l'application.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class FileUtil {
    /**
     * Méthode qui sert a cree un fichier si il n'existe pas.
     * @param path Chemin du fichier que l'on veut cree.
     */
    public static void createIfDoesNotExists(String path) {
        try {
            File file = new File(path);
            if(file.exists()) return;

            if(file.getParentFile() != null) file.getParentFile().mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Methode qui permet de lire un fichier dont le chemin est donne.
     * @param path Chemin du fichier que l'on veut lire.
     * @return Contenu du fichier lu.
     */
    public static String readFile(String path) {
        try {
            return Files.readString(Paths.get(path));
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }

        return "";
    }

    /**
     * Methode qui permet de sauvegarder dans un fichier un contenu.
     * @param path Chemin du fichier dans lequel on veut stocker.
     * @param content Contenu que l'on veut stocker.
     */
    public static void saveFile(String path, String content) {
        try {
            createIfDoesNotExists(path);

            Files.writeString(Paths.get(path), content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}