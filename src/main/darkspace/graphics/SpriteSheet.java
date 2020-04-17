package main.darkspace.graphics;

import java.awt.image.BufferedImage;

public class SpriteSheet {  //Klasse um SpriteSheets zu laden

    private BufferedImage sheet;    //SpriteSheet als Bild

    public SpriteSheet(BufferedImage sheet) {   //Konstruktor
        this.sheet = sheet;
    }

    public BufferedImage crop(int x, int y, int width, int height) {    //mit crop Methode kann Bilder aus SpriteSheet ausschneiden
        return sheet.getSubimage(x, y, width, height);  //schneidet Bild aus
    }

}
