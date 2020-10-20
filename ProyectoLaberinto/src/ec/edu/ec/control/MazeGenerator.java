package ec.edu.ec.control;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class MazeGenerator {

    private Stack<Node> stack = new Stack<>();
    private Random rand = new Random();
    private int[][] maze;
    private int dimension;

    public MazeGenerator(int dim) {
        maze = new int[dim][dim];
        dimension = dim;
    }

    public int[][] generateMaze() {
        stack.push(new Node(0, 0));
        while (!stack.empty()) {
            Node next = stack.pop();
            if (validNextNode(next)) {
                maze[next.y][next.x] = 1;
                ArrayList<Node> neighbors = findNeighbors(next);
                randomlyAddNodesToStack(neighbors);
            }
        }
        int[][] respaldo = new int[maze.length + 2][maze.length + 2];
        for (int fila = 0; fila < maze.length; fila++) {
            for (int columna = 0; columna < maze[0].length; columna++) {
                respaldo[fila + 1][columna + 1] = maze[fila][columna];
            }
        }
        respaldo[respaldo.length - 2][respaldo.length - 2] = 5;
        respaldo[respaldo.length - 2][respaldo.length - 3] = 1;
        return respaldo;
    }

    private boolean validNextNode(Node node) {
        int numNeighboringOnes = 0;
        for (int y = node.y - 1; y < node.y + 2; y++) {
            for (int x = node.x - 1; x < node.x + 2; x++) {
                if (pointOnGrid(x, y) && pointNotNode(node, x, y) && maze[y][x] == 1) {
                    numNeighboringOnes++;
                }
            }
        }
        return (numNeighboringOnes < 3) && maze[node.y][node.x] != 1;
    }

    private void randomlyAddNodesToStack(ArrayList<Node> nodes) {
        int targetIndex;
        while (!nodes.isEmpty()) {
            targetIndex = rand.nextInt(nodes.size());
            stack.push(nodes.remove(targetIndex));
        }
    }

    private ArrayList<Node> findNeighbors(Node node) {
        ArrayList<Node> neighbors = new ArrayList<>();
        for (int y = node.y - 1; y < node.y + 2; y++) {
            for (int x = node.x - 1; x < node.x + 2; x++) {
                if (pointOnGrid(x, y) && pointNotCorner(node, x, y)
                        && pointNotNode(node, x, y)) {
                    neighbors.add(new Node(x, y));
                }
            }
        }
        return neighbors;
    }

    private Boolean pointOnGrid(int x, int y) {
        return x >= 0 && y >= 0 && x < dimension && y < dimension;
    }

    private Boolean pointNotCorner(Node node, int x, int y) {
        return (x == node.x || y == node.y);
    }

    private Boolean pointNotNode(Node node, int x, int y) {
        return !(x == node.x && y == node.y);
    }
}
