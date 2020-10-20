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
public class Sonido2 {
    
    AudioClip tocar;
    Player sonido;
    public Sonido2() {
        tocar = java.applet.Applet.newAudioClip(getClass().getResource("C:\\Program Files (x86)\\Laberinto\\sonido\\sonid.mp3"));
        tocar.play();
    }
  
    public void apagar(){
        tocar.stop();
    }
}
