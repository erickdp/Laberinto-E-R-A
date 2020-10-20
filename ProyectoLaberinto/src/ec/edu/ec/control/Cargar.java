/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.control;

import javax.swing.JProgressBar;

/**
 *
 * @author Andy
 */
public class Cargar extends Thread{
    JProgressBar progreso;

    public Cargar(JProgressBar progreso) {
        super();
        this.progreso = progreso;
    }
    
    public void run(){
        for (int i = 1; i <= 100; i++) {
            progreso.setValue(i);
            pausa(75);
        }
    }
    
    public void pausa(int mlseg){
        try {
            Thread.sleep(mlseg);
        } catch (Exception e) {
        }
    }
    
}
