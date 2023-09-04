package mod8;

public class Line extends Shape {
    @Override
    public void drawFigure() {
        System.out.println("Draw shape is line");
    }

    @Override
    public void shapeLine() {
        System.out.println("Draw shape is line 1 pixel");
    }

    @Override
    public void shapeColor() {
        System.out.println("Draw shape color is green");
    }
}
