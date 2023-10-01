package org.example;

public class TriangleDrawer {
    public String drawTriangle(int side){
        String result = "";
        int lines = side;

        while(lines > 0) {


            int columns = lines;
            while(columns > 0) {
                result += "*";
                columns--;
            }
            lines--;
            result += "\n";
        }

        return result;
    }


    public static void main(String[] args) {
        TriangleDrawer helper = new TriangleDrawer();
        System.out.println(new TriangleDrawer().drawTriangle(14));
    }

}
