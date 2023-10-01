package mod6;

class Distance{
    int startX;
    int startY;
    int endX;
    int endY;
    int distance;
    public Distance(int startX, int startY, int endX, int endY){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
    public int getDistance(){
            return distance = (int) Math.sqrt(Math.pow((endX - startX), 2) + Math.pow((endY - startY), 2));
            }
    public int getStartX() {
        return startX;
    }
    public int getStartY() {
        return startY;
    }
    public int getEndX() {
        return endX;
    }
    public int getEndY() {
        return endY;
    }
}

class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(-2, -7, -9, -31).getDistance());
    }
}
