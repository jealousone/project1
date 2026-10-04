package bridge;

public final class Circle extends Shape {
    private final double radius;

    public Circle(Renderer renderer, double radius) {
        super(renderer);
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException("Radius must be finite and positive");
        }
        this.radius = radius;
    }

    @Override
    public void draw() {
        getRenderer().renderCircle(radius);
    }
}
