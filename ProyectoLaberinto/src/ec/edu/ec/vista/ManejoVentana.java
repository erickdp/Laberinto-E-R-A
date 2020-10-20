package ec.edu.ec.vista;

import java.io.FileInputStream;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Andy
 */
public class ManejoVentana {

    /**
     * @param args the command line arguments
     */
    UIManager ui;
    static Player sonido;
  
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        
        UIManager.put("OptionPane.background", new ColorUIResource(153, 153, 153));
        UIManager.put("Panel.background", new ColorUIResource(153, 153, 153));
        Inicio i = new Inicio();
        i.setVisible(true);
        
        
        sonido = new Player(new FileInputStream("C:\\Program Files (x86)\\Laberinto\\inicio.mp3"));
        sonido.play();
        

//            try{
//                FileInputStream direccion;
//                JFileChooser fileChoser = new JFileChooser();
//                if (fileChoser.showOpenDialog(fileChoser)==JFileChooser.APPROVE_OPTION){
//                    File file = fileChoser.getSelectedFile();
//                    direccion = new FileInputStream(file.getAbsolutePath());
//                    Player player;
//                    BufferedInputStream bis = new BufferedInputStream(direccion);
//                    player = new Player(bis);
//                    player.play();
//                }else{
//                    JOptionPane.showMessageDialog(null, "No hay selecicion");
//                }
//            }catch(FileNotFoundException e){
//                e.printStackTrace();
//            } catch (JavaLayerException ex) {
//            Logger.getLogger(ManejoVentana.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    }

}
