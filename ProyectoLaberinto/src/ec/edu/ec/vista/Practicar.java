package ec.edu.ec.vista;

import ec.edu.ec.vista.mensajes.Abajo;
import ec.edu.ec.vista.mensajes.Arriba;
import ec.edu.ec.vista.mensajes.Derecha;
import ec.edu.ec.vista.mensajes.Finpractica;
import ec.edu.ec.vista.mensajes.Izquierda;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author Andy
 */
public class Practicar extends javax.swing.JFrame {

    int x, y;
    int ca, cb, ci, cd;
    static UIManager ui;

    public Practicar() {
        initComponents();
        this.setTitle("Laberinto @ERA");
        ui.put("OptionPane.background", new ColorUIResource(153, 153, 153));
        ui.put("Panel.background", new ColorUIResource(153, 153, 153));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/lab.png")).getImage()); //icono de imagen 
//        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/fondoPractica.jpg"));//imagen de fondo de la ventana 
//        JLabel fondo = new JLabel();
//        Icon icono = new ImageIcon(uno.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
//        fondo.setIcon(icono);
//        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
//        fondo.setBounds(0, 0, icono.getIconWidth(), icono.getIconHeight());
        setLocationRelativeTo(null);
        jPanel1.setFocusable(true);
        arriba.setVisible(false);
        abajo.setVisible(false);
        izquierda.setVisible(false);
        derecha.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        arriba = new javax.swing.JLabel();
        abajo = new javax.swing.JLabel();
        izquierda = new javax.swing.JLabel();
        derecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arriba.png"))); // NOI18N
        jPanel1.add(arriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        abajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abajo.png"))); // NOI18N
        jPanel1.add(abajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        izquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda.png"))); // NOI18N
        jPanel1.add(izquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 110, -1));

        derecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecha.png"))); // NOI18N
        jPanel1.add(derecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Completa la practica");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 310, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lab.jpg"))); // NOI18N
        jLabel2.setToolTipText("Presiona las flechas de tu teclado para empezar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed

//        if(KeyEvent.VK_UP==evt.getKeyCode()&&KeyEvent.VK_DOWN==evt.getKeyCode()&&KeyEvent.VK_LEFT==evt.getKeyCode()&&KeyEvent.VK_RIGHT==evt.getKeyCode()){
//             JOptionPane.showMessageDialog(null, "felicidad ha compleado la practica");
//        }
//        if (t == 44 && t2 == 258 && t3 == 0 && t4 == 315) {
//            JOptionPane.showMessageDialog(null, "Felicidad ha compleado la practica");
//        } else {
//        JOptionPane.showMessageDialog(null, "Bienvenido al Juego del Laberinto @ERA." + "\n\nAntes de empezar a jugar vamos a realizar una practica\n"
//                + "para que puedas conocer como moverte en el Juego.", "Practica", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/era.png", 160, 80));
//        System.out.println(derecha.getX());
//        System.out.println(izquierda.getX());
//        System.out.println(arriba.getY());
//        System.out.println(abajo.getY());
//        System.out.println(ca);
//        System.out.println(cb);
//        System.out.println(ci);
//        System.out.println(cd);
        switch (evt.getExtendedKeyCode()) {
            case KeyEvent.VK_UP:
                x = arriba.getX();
                y = arriba.getY();
                if (arriba.getY() > 44) {
                    arriba.setLocation(x, y - 20);//tecla arriba
                    arriba.setVisible(true);
                    abajo.setVisible(false);
                    izquierda.setVisible(false);
                    derecha.setVisible(false);

                }
                ca = arriba.getY();
//                if (KeyEvent.VK_UP == evt.getKeyCode()) {
//                    ca++;
//                }

                if (arriba.getY() == 40) {
//                    JOptionPane.showMessageDialog(null, "Con esta tecla podras moverte hacia arriba", "!Felicidades!", JOptionPane.PLAIN_MESSAGE,icono("/imagenes/arriba.png", 90, 120));
                    new Arriba(this, true).setVisible(true);
                }
//                    else {
//                        JOptionPane.showMessageDialog(null, "Por favor siga desplazandose hacia arriba hasta completar la practica", "!Un Momento!", JOptionPane.PLAIN_MESSAGE);
//                    }

                break;

            case KeyEvent.VK_DOWN:

                x = abajo.getX();
                y = abajo.getY();
//                t2 = abajo.getY();
                if (abajo.getY() < 400) {
                    abajo.setLocation(x, y + 20);//tecla abajo
                    abajo.setVisible(true);
                    arriba.setVisible(false);
                    izquierda.setVisible(false);
                    derecha.setVisible(false);
                }

                cb = abajo.getY();

                if (abajo.getY() == 400) {
//                    JOptionPane.showMessageDialog(null, "Con esta tecla podras moverte hacia abajo", "!Felicidades!", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/abajo.png", 90, 120));
                    new Abajo(this, true).setVisible(true);
                }
//                if (KeyEvent.VK_DOWN == evt.getKeyCode()) {
//                    cb++;
//                }
                break;

            case KeyEvent.VK_LEFT:
                x = izquierda.getX();
                y = izquierda.getY();
//                t3 = izquierda.getX();
                if (izquierda.getX() > 20) {
                    izquierda.setLocation(x - 20, y);//tecla izquierda
                    izquierda.setVisible(true);
                    arriba.setVisible(false);
                    abajo.setVisible(false);
                    derecha.setVisible(false);
                }

                ci = izquierda.getX();

                if (izquierda.getX() == 10) {
//                    JOptionPane.showMessageDialog(null, "Con esta tecla podras moverte hacia la izquierda", "!Felicidades!", JOptionPane.PLAIN_MESSAGE,icono("/imagenes/izquierda.png", 160, 90));
                    new Izquierda(this, true).setVisible(true);
                }
//                if (KeyEvent.VK_LEFT == evt.getKeyCode()) {
//                    ci++;
//                }
                break;

            case KeyEvent.VK_RIGHT:
                x = derecha.getX();
                y = derecha.getY();
//                t4 = derecha.getX();

                if (derecha.getX() <= 400) {
                    derecha.setLocation(x + 20, y);//tecla derecha
                    derecha.setVisible(true);
                    arriba.setVisible(false);
                    abajo.setVisible(false);
                    izquierda.setVisible(false);
                }

                cd = derecha.getX();

                if (derecha.getX() == 410) {
//                    JOptionPane.showMessageDialog(null, "Con esta tecla podras moverte hacia la derecha", "!Felicidades!", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/derecha.png", 160, 90));
                    new Derecha(this, true).setVisible(true);
                }
//                if (KeyEvent.VK_RIGHT == evt.getKeyCode()) {
//                    cd++;
//                }
                break;
        }

        if (ca == 40 && cb == 400 && ci == 10 && cd == 410) {
            //JOptionPane.showMessageDialog(null, "Felicidades ha compleado la practica\n\n Disfruta de La aventura del Laberinto\n\n Puedes digitar el nivel de dificultad del laberinto", "'Bien Hecho'", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/era.png", 180, 90));
            new Finpractica(this, true).setVisible(true);
            Ventana1 v = new Ventana1();
            v.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jPanel1KeyPressed

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
            java.util.logging.Logger.getLogger(Practicar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practicar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practicar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practicar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practicar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abajo;
    private javax.swing.JLabel arriba;
    private javax.swing.JLabel derecha;
    private javax.swing.JLabel izquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
