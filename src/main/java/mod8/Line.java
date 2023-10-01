package mod8;

public class Line implements Shape {


    @Override
    public void printShape(Shape shape) {
        shape.drawFigure();
    }

    @Override
    public void drawFigure() {
        System.out.println("Line");
    }
}
