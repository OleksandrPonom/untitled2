package mod8;

public class Circle extends Shape {

    @Override
    public void drawFigure() {
        System.out.println("Draw shape is circle");
    }

    @Override
    public void shapeLine() {
        System.out.println("Draw shape is line 0,5 pixel");
    }

    @Override
    public void shapeColor() {
        System.out.println("Draw shape color is red");
    }
}
