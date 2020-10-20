package ec.edu.ec.control;

public class Coordenada {

    int x;
    int y;
    Coordenada parent;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
        this.parent = null;
    }

    public Coordenada(int x, int y, Coordenada parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    Coordenada getParent() {
        return parent;
    }
}
