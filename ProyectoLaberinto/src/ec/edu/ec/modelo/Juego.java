package ec.edu.ec.modelo;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

public class Juego extends JPanel {

    Laberitno laberinto;
    Personaje personaje;
    private static boolean bandera = true;

    public Juego(int tamanoLaberinto) {
        if (bandera) { //Se vuelve a generar otro laberinto sin esta condicion
            laberinto = new Laberitno(tamanoLaberinto);
            personaje = new Personaje();
            bandera = false;
        }

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e);
            }
        });
        setFocusable(true); //Mantiene el foco de la aplicacion luego de invocar a keyListener
    }

    @Override
    public void paint(Graphics g) {
        laberinto.pintarLaberinto(g);
        personaje.pintarPersonaje(g);
    }

}

//
//if (t == 44) {
//        } else if (t2 == 260) {
//        } else if (t3 == 4) {
//        } else if (t4 == 313) {