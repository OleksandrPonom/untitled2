package mod6;

import java.util.Objects;

class Rectangle{
    int a;
    int b;
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

       public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
       }

    public boolean canPlaceInto(Rectangle anotherRect) {
        if (anotherRect.a >= a && anotherRect.b >= b || anotherRect.a >= b && anotherRect.b >= a) {
            return true;
        }
        return false;
    }
}

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(135, 162);
        Rectangle r2 = new Rectangle(27, 810);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}
