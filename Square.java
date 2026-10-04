package bridge;

public final class Square extends Shape {
    private final double side;

    public Square(Renderer renderer, double side) {
        super(renderer);
        if (!Double.isFinite(side) || side <= 0) {
            throw new IllegalArgumentException("Side must be finite and positive");
        }
        this.side = side;
    }

    @Override
    public void draw() {
        getRenderer().renderSquare(side);
    }
}
