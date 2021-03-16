package shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.setRadius(radius);
    }

    @Override
    protected void calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * this.radius);
    }

    @Override
    protected void calculateArea() {
        super.setArea(Math.PI * this.radius * this.radius);
    }

    public final Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
