package bridge;

import java.util.Objects;

public abstract class Shape {
    private Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer, "Renderer is required");
    }

    public final void setRenderer(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer, "Renderer is required");
    }

    protected final Renderer getRenderer() {
        return renderer;
    }

    public abstract void draw();
}
