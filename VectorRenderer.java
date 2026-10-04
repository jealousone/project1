package bridge;

public final class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Vector circle: radius=" + radius + " (geometric outline)");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Vector square: side=" + side + " (geometric outline)");
    }
}
