package mod8;

public class Pyramid implements Shape {

    @Override
    public void printShape(Shape shape) {
        shape.drawFigure();
    }

    @Override
    public void drawFigure() {
        System.out.println("Pyramid");
    }
}
