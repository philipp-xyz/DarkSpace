package main.darkspace.display;


import javax.swing.*;
import java.awt.*;

public class Display { //Klasse für die grafische Oberflaeche

    private JFrame frame;   //Fenster für Spiel
    private Canvas canvas;

    private String title;   //Spieltitel
    private int width, height;  //Breite, Hoehe des Spielfensters

    public Display(String title, int width, int height) {   //Konstruktor
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();    //erstellt Display
    }

    private void createDisplay() {
        frame = new JFrame(title);  //Setzt Fenstertitel auf Spieltitel
        frame.setSize(width, height);   //Setzt groeße des Fensters auf Breite/Hoehe
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Fenster wird geschlossen wenn man auf das Kreuz drueckt
        frame.setResizable(false);  //Fenstergröße unveränderbar
        frame.setLocationRelativeTo(null);  //Fenster oeffnet sich in der Mitte des Bildschirmes beim oeffnen
        frame.setVisible(true);     //Sichtbarkeit des Fensters -> true

        canvas = new Canvas();  //neuer Canvas
        canvas.setPreferredSize(new Dimension(width, height));  //Pref size
        canvas.setMaximumSize(new Dimension(width, height));    //Max size
        canvas.setMinimumSize(new Dimension(width, height));    //Min size

        frame.add(canvas);  //fuegt Canvas zum Frame hinzu
        frame.pack();   //Passt Fenster auf Canvas an
    }

    //getter
    public Canvas getCanvas() {
        return canvas;
    }
}
