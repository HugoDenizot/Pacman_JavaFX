package persistance;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Classe qui sert a serializer ou deserializer un contenu de fichier.
 * @author DENIZOT Hugo, CHAOUKI Nabil
 */
public class SerialisableUtil {
    /**
     * Methode qui permet de serializer un objet en String.
     * @param obj Objet que l'on veut serializer.
     * @return objet serialize.
     */
    public static String serialize(Object obj) {
        try (
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream)
        ) {
            outputStream.writeObject(obj);

            return new String(Base64.getEncoder().encode(byteArrayOutputStream.toByteArray()), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Methode qui permet de deserializer un string en un objet.
     * @param string Contenu que l'on veut transformer en objet.
     * @return Objet transforme
     */
    public static Object deserialize(String string) {
        byte[] data = Base64.getDecoder().decode(string);

        try (
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
                ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream)
        ) {
            return inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
