package mod8;

public class Diamond extends Shape {
    @Override
    public void drawFigure() {
        System.out.println("Draw shape is diamond");
    }

    @Override
    public void shapeLine() {
        System.out.println("Draw shape is line 0,1 pixel");
    }

    @Override
    public void shapeColor() {
        System.out.println("Draw shape color is brown");
    }
}
