package ec.edu.ec.modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Personaje extends Thread{

    private int x = Laberitno.tamano;
    private int y = Laberitno.tamano;
    private int movimiento = 0;
    public static boolean fin;

    public void pintarPersonaje(Graphics g) {
        if (ban) {
            x = Laberitno.tamano;
            y = Laberitno.tamano;
            movimiento = Laberitno.tamano;
            ban = false;
        }
        //Dibujando el ovalo
        g.setColor(Color.blue);
        g.fillRect(x, y, Laberitno.tamano, Laberitno.tamano);
        //Dibujando el contorno
        g.setColor(Color.black);
        g.drawRect(x, y, Laberitno.tamano, Laberitno.tamano);
    }

    public static boolean ban = true;

    public void teclaPresionada(KeyEvent evento) {
        int[][] laberinto = Laberitno.esteLaberinto;
        if (evento.getKeyCode() == 37) {//IZQ X
            if (laberinto[y / Laberitno.tamano][(x / Laberitno.tamano) - 1] != 0) {
//                System.out.println(y/Laberitno.tamano + " " + ((x/Laberitno.tamano) - 1));
//                System.out.println(laberinto[y / Laberitno.tamano][(x / Laberitno.tamano) - 1]);
                x -= movimiento;
            }
        } else if (evento.getKeyCode() == 39) {//DERECHA
            if (laberinto[y / Laberitno.tamano][(x / Laberitno.tamano) + 1] != 0) {
//                System.out.println(y/Laberitno.tamano + " " + ((x/Laberitno.tamano) + 1));
//                System.out.println(laberinto[y / Laberitno.tamano][(x / Laberitno.tamano) + 1]);
                x += movimiento;
            }
        } else if (evento.getKeyCode() == 40) {
            if (laberinto[(y / Laberitno.tamano) + 1][x / Laberitno.tamano] != 0) {
//                System.out.println((y/Laberitno.tamano + 1 )+ " " + ((x/Laberitno.tamano)));
//                System.out.println(laberinto[(y / Laberitno.tamano) + 1][(x / Laberitno.tamano)]);
                y += movimiento;
            }
        } else if (evento.getKeyCode() == 38) {
            if (laberinto[(y / Laberitno.tamano) - 1][x / Laberitno.tamano] != 0) {
//                System.out.println((y/Laberitno.tamano - 1 )+ " " + ((x/Laberitno.tamano)));
//                System.out.println(laberinto[(y / Laberitno.tamano) - 1][(x / Laberitno.tamano)]);
                y -= movimiento;

            }
        }

        if (laberinto[(y / Laberitno.tamano)][(x / Laberitno.tamano)] == 5) {
//            System.out.println("ganaste");
            fin = true;
//            new JuegoGanado().setVisible(true);   

        }
    }

   
}
