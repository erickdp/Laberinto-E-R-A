package ec.edu.ec.control;

import java.util.Arrays;
import java.util.List;

public class Maze {

    private static final int CAMINO = 0;
    private static final int PARED = 1;
    private static final int INICIO = 2;
    private static final int SALIDA = 3;
    private static final int PATH = 4;

    private int[][] maze;
    private boolean[][] visited;
    private Coordenada start;
    private Coordenada end;

    public Maze(int[][] replicacion) {
        initializeMaze(replicacion);
    }

    private void initializeMaze(int[][] replicacion) {

        maze = new int[replicacion.length][replicacion[0].length];
        visited = new boolean[replicacion.length][replicacion[0].length];

        for (int row = 0; row < replicacion.length; row++) {
            for (int col = 0; col < replicacion[0].length; col++) {
                if (replicacion[row][col] == 0) {
                    maze[row][col] = PARED;
                } else {
                    maze[row][col] = CAMINO;
                }
            }
        }
        maze[1][1] = INICIO;
        start = new Coordenada(1, 1);
        maze[maze.length - 2][maze[0].length - 2] = SALIDA;
        end = new Coordenada(maze.length - 2, maze[0].length - 2);

    }

    public int getHeight() {
        return maze.length;
    }

    public int getWidth() {
        return maze[0].length;
    }

    public Coordenada getEntry() {
        return start;
    }

    public Coordenada getExit() {
        return end;
    }

    public boolean isExit(int x, int y) {
        return x == end.getX() && y == end.getY();
    }

    public boolean isStart(int x, int y) {
        return x == start.getX() && y == start.getY();
    }

    public boolean isExplored(int row, int col) {
        return visited[row][col];
    }

    public boolean isPARED(int row, int col) {
        return maze[row][col] == PARED;
    }

    public void setVisited(int row, int col, boolean value) {
        visited[row][col] = value;
    }

    public boolean isValidLocation(int row, int col) {
        if (row < 0 || row >= getHeight() || col < 0 || col >= getWidth()) {
            return false;
        }
        return true;
    }

    public int[][] printPath(List<Coordenada> path) {
        int[][] tempMaze = Arrays.stream(maze)
                .map(int[]::clone)
                .toArray(int[][]::new);
        for (Coordenada coordinate : path) {
            if (isStart(coordinate.getX(), coordinate.getY()) || isExit(coordinate.getX(), coordinate.getY())) {
                continue;
            }
            tempMaze[coordinate.getX()][coordinate.getY()] = PATH;
        }
        return toBinary(tempMaze);
    }

    public int[][] toBinary(int[][] maze) {
        int[][] resultado = new int[getWidth()][getHeight()];
        for (int row = 0; row < getHeight(); row++) {
            for (int col = 0; col < getWidth(); col++) {
                if (maze[row][col] == CAMINO) {
                    resultado[row][col] = 1;
                } else if (maze[row][col] == PARED) {
                    resultado[row][col] = 0;
                } else if (maze[row][col] == INICIO) {
                    resultado[row][col] = 2;
                } else if (maze[row][col] == SALIDA) {
                    resultado[row][col] = 2;
                } else {
                    resultado[row][col] = 3;
                }
            }
        }
        return resultado;
    }

    public void reset() {
        for (int i = 0; i < visited.length; i++) {
            Arrays.fill(visited[i], false);
        }

    }

}
