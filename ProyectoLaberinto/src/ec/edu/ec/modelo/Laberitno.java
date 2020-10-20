package ec.edu.ec.modelo;

import ec.edu.ec.control.BackTracking;
import ec.edu.ec.control.Coordenada;
import ec.edu.ec.control.Maze;
import ec.edu.ec.control.MazeGenerator;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.List;
import ec.edu.ec.vista.JuegoPerdido;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Laberitno extends Thread {

    public static int tamano = 0;
    private static boolean bandera = true;
    public static int[][] esteLaberinto;
    private int tamanoLaberinto;

    public Laberitno(int tamanoLaberinto) {
        this.tamanoLaberinto = tamanoLaberinto;
        esteLaberinto = obtenerLaberinto();
        tamano = 680 / esteLaberinto.length;
    }

    public Laberitno() {
    }
    
    

    public void verSolucion() {
        Maze maze = new Maze(esteLaberinto);
        BackTracking bsf = new BackTracking();
        List<Coordenada> path = bsf.solucionar(maze);
        Laberitno.esteLaberinto = maze.printPath(path);
    }

    public void pintarLaberinto(Graphics g) {

        //tamano = (754 / laberinto.length) - 5; //Se debe de multiplicar ya sea las filas o las columnas de la matriz y dividir para el tamano de la ventana - 38
        //Pintar filas y columnas
        for (int fila = 0; fila < esteLaberinto.length; fila++) {
            for (int columna = 0; columna < esteLaberinto[0].length; columna++) {
                //Si es posicion 1 en fila columna, pintala
                if (esteLaberinto[fila][columna] == 0) {
                    //Dibujando la pared
                    g.setColor(Color.BLACK);
                    g.fillRect(columna * tamano, fila * tamano, tamano, tamano);
                    //Dibujando el contorno de la pared
                    g.setColor(Color.WHITE);
                    g.drawRect(columna * tamano, fila * tamano, tamano, tamano);
                } else if (esteLaberinto[fila][columna] == 1) {
                    g.setColor(Color.WHITE);
                    g.fillRect(columna * tamano, fila * tamano, tamano, tamano);
                    //Dibujando el contorno de la pared
                    g.setColor(Color.WHITE);
                    g.drawRect(columna * tamano, fila * tamano, tamano, tamano);
                } else {
                    g.setColor(Color.MAGENTA);
                    g.fillRect(columna * tamano, fila * tamano, tamano, tamano);
                    //Dibujando el contorno de la pared
                    g.setColor(Color.white);
                    g.drawRect(columna * tamano, fila * tamano, tamano, tamano);
                }
            }
        }

        g.setColor(Color.red);
        g.fillRect(1 * tamano, 1 * tamano, tamano, tamano);
        //Dibujando el contorno de la pared
        g.setColor(Color.white);
        g.drawRect(1 * tamano, 1 * tamano, tamano, tamano);

        g.setColor(Color.red);
        g.fillRect((esteLaberinto[0].length - 2) * tamano, (esteLaberinto.length - 2) * tamano, tamano, tamano);
        //Dibujando el contorno de la pared
        g.setColor(Color.white);
        g.drawRect((esteLaberinto[0].length - 2) * tamano, (esteLaberinto.length - 2) * tamano, tamano, tamano);

    }

    public int[][] obtenerLaberinto() {
//        int laberinto[][] = {
//            { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
//            { 1,0,0,0,1,0,0,0,0,0,0,1,1,1,0},
//            { 1,1,1,0,1,0,1,0,1,1,1,0,0,0,1},
//            { 1,1,0,0,0,0,1,0,0,1,0,0,1,0,1},
//            { 1,1,0,1,1,1,1,0,1,0,0,1,1,0,1},
//            { 1,1,0,0,0,0,1,0,0,0,1,1,1,0,1},
//            { 1,1,1,0,1,0,1,1,1,1,0,0,0,0,1},
//            { 1,1,0,0,0,1,0,0,0,1,0,1,1,1,0},
//            { 1,1,0,1,1,0,0,1,0,1,0,0,0,0,0},
//            { 1,1,0,1,0,0,1,1,0,1,0,1,1,1,1},
//            { 1,1,0,0,0,1,1,1,0,1,0,0,0,0,0},
//            { 1,1,0,1,0,0,0,1,0,0,0,1,1,1,1},
//            { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};

        return new MazeGenerator(this.tamanoLaberinto).generateMaze();
    }

}
