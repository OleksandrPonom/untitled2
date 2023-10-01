package mod6;

class CircleIntersector{
    private int x1; private int y1; private int r1; private int x2; private int y2; private int r2; private int length;

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getR1() {
        return r1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getR2() {
        return r2;
    }

    public int getLength() {
        return length;
    }

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2){
        this.x1 = x1; this.y1 = y1; this.r1 = r1; this.x2 = x2; this.y2 = y2; this.r2 = r2;
        length  = (int) Math.sqrt(Math.pow((y1 - x1), 2) + Math.pow((y2 - x2), 2));
    }

    @Override
    public String toString() {
        if(r2 < length - r1 || r1 < length - r2 && length > r1 + r2){
            return "not intersects";
        }
        return "intersects";
    }
}

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}