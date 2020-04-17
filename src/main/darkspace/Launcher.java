package main.darkspace;

public class Launcher {

    //Spielobejekt erstellen und starten
    public static void main(String[] args) {

        Game game = new Game("DarkSpace", 1400, 900);   //Neues Game, mit titel, width, height
        game.start();   //startet Spiel

    }

}
