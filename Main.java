package bridge;

public final class Main {
    public static void main(String[] args) {
        System.out.println("Nurzhan Zeinulla, SE-2506");

        Shape circle = new Circle(new VectorRenderer(), 5.0);
        Shape square = new Square(new VectorRenderer(), 4.0);

        System.out.println("Before switching: VectorRenderer");
        circle.draw();
        square.draw();

        circle.setRenderer(new RasterRenderer());
        square.setRenderer(new RasterRenderer());

        System.out.println("After switching the same shapes: RasterRenderer");
        circle.draw();
        square.draw();
    }
}
