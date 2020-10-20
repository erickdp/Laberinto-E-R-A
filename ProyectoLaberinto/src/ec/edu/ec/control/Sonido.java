package ec.edu.ec.control;

import ec.edu.ec.vista.Log;
import java.applet.AudioClip;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


/**
 *
 * @author Andy
 */
public class Sonido {
    
    AudioClip tocar;
    Player sonido;
    public Sonido() {
        tocar = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/musica de fondo.wav"));
        tocar.play();
    }
  
    public void apagar(){
        tocar.stop();
    }
}
