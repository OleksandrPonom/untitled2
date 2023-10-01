package mod6;

class RectangleArea {
    int x1;
    int x2;
    int y1;
    int y2;
    int a;
    int b;
    public RectangleArea(int[] coords) {

        this.x1 = coords[0];
        this.y1 = coords[2];
        this.x2 = coords[1];
        this.y2 = coords[3];

    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getArea() {

        a = y1 - x1;
        b = y2 - x2;

        return Math.abs(a * b);
    }
}

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
