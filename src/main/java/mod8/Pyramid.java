package mod8;

public class Pyramid extends Shape {
    @Override
    public void drawFigure() {
        System.out.println("Draw shape is pyramid");
    }

    @Override
    public void shapeLine() {
        System.out.println("Draw shape is line 0,8 pixel");
    }

    @Override
    public void shapeColor() {
        System.out.println("Draw shape color is blue");
    }
}
