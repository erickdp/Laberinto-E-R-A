package ec.edu.ec.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BackTracking {

    private static final int[][] DIRECCIONES = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public List<Coordenada> solucionar(Maze maze) {
        LinkedList<Coordenada> nextToVisit = new LinkedList<>();
        Coordenada start = maze.getEntry();
        nextToVisit.add(start);

        while (!nextToVisit.isEmpty()) {
            Coordenada cur = nextToVisit.remove();

            if (!maze.isValidLocation(cur.getX(), cur.getY()) || maze.isExplored(cur.getX(), cur.getY())) {
                continue;
            }

            if (maze.isPARED(cur.getX(), cur.getY())) {
                maze.setVisited(cur.getX(), cur.getY(), true);
                continue;
            }

            if (maze.isExit(cur.getX(), cur.getY())) {
                return backtrackCamino(cur);
            }

            for (int[] direction : DIRECCIONES) {
                Coordenada Coordenada = new Coordenada(cur.getX() + direction[0], cur.getY() + direction[1], cur);
                nextToVisit.add(Coordenada);
                maze.setVisited(cur.getX(), cur.getY(), true);
            }
        }
        return Collections.emptyList();
    }

    private List<Coordenada> backtrackCamino(Coordenada cur) {
        List<Coordenada> camino = new ArrayList<>();
        Coordenada iter = cur;

        while (iter != null) {
            camino.add(iter);
            iter = iter.parent;
        }

        return camino;

    }
}
