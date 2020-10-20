/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.vista;

import ec.edu.ec.control.Sonido;
import ec.edu.ec.control.Cargar;
import ec.edu.ec.control.Sonido1;
import ec.edu.ec.vista.mensajes.InformacionInicio;
//import com.sun.awt.AWTUtilities;
import java.applet.AudioClip;
import java.io.FileInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javazoom.jl.player.Player;

/**
 *
 * @author Andy
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    double i = 80, j = 1; // variable para poder manejar la transpariencia de la ventana 
    Cargar hilo;
//    AudioClip sound = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/sonid.wav"));
//    AudioClip sound;
    //Sonido1 S = new Sonido1();
   
    public Inicio() {
        initComponents();
        UIManager.put("OptionPane.background", new ColorUIResource(153, 153, 153));
        UIManager.put("Panel.background", new ColorUIResource(153, 153, 153));
//        sound = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/sonid.wav"));
//        sound.play();
        comenzar();
        this.setTitle("Laberinto @ERA");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/lab.png")).getImage());
        
    }

    public void comenzar() {
        setLocationRelativeTo(null);
        progreso.setVisible(false);
        hilo = new Cargar(getProgreso());
        //s = new Sonido();
        //cargarMusica();
        hilo.start();
        hilo = null;
    }

    public void cargarMusica() {
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progreso = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });
        getContentPane().add(progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 280, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenidos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/laberinto.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-copyright-50.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 50, 50));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("@Erick, Royer, Andy");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged
        // Este metodo se ejecuta cuando la barra de progreso llega al tope 

        if (progreso.getValue() == i) { //se llega a 50 para realizar la accion de transparencia
            if (j != 101) {
                //AWTUtilities.setWindowOpacity(this, Float.valueOf((100 - j) / 100 + "f"));//hace transparente la ventana 
                this.setOpacity(Float.valueOf((100 - j) / 100 + "f"));
                i++;
                j += 2;
            }
        }

        //ui = null;
        if (progreso.getValue() == 100) {
           
            //Ventana1 ve = new Ventana1();
            new Log().setVisible(true);
           // S.apagar();
            this.dispose();
            
//            Object[] options = {"Si", "No"};
//            int opcion=JOptionPane.showOptionDialog(null, "           Bienvenido al Juego del Laberinto @ERA. "
//                    + "\n\nAntes de empezar a jugar vamos a realizar una practica\n"
//                    + " para que puedas conocer como moverte en el Juego."+
//                    "\n\n                          ¿Desea realizar la Practica? ", "Practica",
//                    0,JOptionPane.QUESTION_MESSAGE,
//                    icono("/imagenes/teclas.png", 180, 90), options, "Si");
//            int opcion = JOptionPane.showConfirmDialog(null, "           Bienvenido al Juego del Laberinto @ERA. "
//                    + "\n\nAntes de empezar a jugar vamos a realizar una practica\n"
//                    + " para que puedas conocer como moverte en el Juego."
//                    + "\n\n                          ¿Desea realizar la Practica? ", "Practica",
//                    JOptionPane.YES_NO_OPTION, 0,
//                    icono("/imagenes/teclas.png", 180, 90));
            //p.setVisible(true);
            //System.out.println(opcion);
            //sound.play();
//            if (opcion == 1) {
//                Ventana1 v = new Ventana1();
//                v.setVisible(true);
//                this.dispose();
//            } else {
//                p.setVisible(true);
//                this.dispose();
//            }
        }
    }//GEN-LAST:event_progresoStateChanged

    public Icon icono(String ruta, int alto, int ancho) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(alto, ancho, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JProgressBar getProgreso() {
        return progreso;
    }

    public void setProgreso(javax.swing.JProgressBar progreso) {
        this.progreso = progreso;
    }
}
