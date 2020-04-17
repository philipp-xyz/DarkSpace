package main.darkspace.graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader {  //zum laden von Bildern

    public static BufferedImage loadImage(String path) {    //path wo Bild ist
        try {
            return ImageIO.read(ImageLoader.class.getResource(path));   //Bild mit pfad laden
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);     //wenn es nicht laden konnte Programm beenden
        }
        return null;
    }



}
