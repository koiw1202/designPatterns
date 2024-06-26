package bridgePattern;

public abstract class Brush {
    protected Color color;

    protected Brush(Color color) {
        this.color = color;
    }

    public abstract String draw();
}