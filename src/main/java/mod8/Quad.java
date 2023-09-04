package mod8;

public class Quad extends Shape {
    @Override
    public void drawFigure() {
        System.out.println("Draw shape is quad");
    }

    @Override
    public void shapeLine() {
        System.out.println("Draw shape is line 0,3 pixel");
    }

    @Override
    public void shapeColor() {
        System.out.println("Draw shape color is yellow");
    }
}
