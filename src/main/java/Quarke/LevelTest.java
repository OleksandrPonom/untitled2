package Quarke;

/*class Level{
    String s;

    public Level(Object s) {
        this.s = (String) s;
    }

    @Override
    public String toString() {
       return "Quarke level, name is " + s;
    }
}



class LevelTest {
    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level("Test"));
    }
}*/

/*
class Level {
    private String levelName;
    private Point[] points;

    public Point[] getPoints() {
        return points;
    }

    public Level(String levelName, Point[] points) {
        this.levelName = levelName;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelName + ", point count is " + points.length;
    }
    static class Point{
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        System.out.println(new Level("Test", points));
    }
}*/

/*
class Level {
    private LevelInfo levelInfo;
    private Point[] points;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.levelName + ", difficulty is " + levelInfo.difficulty + ", point count is " + points.length;
    }


    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static class LevelInfo{
        private String levelName;
        private String difficulty;

        public String getName() {
            return levelName;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String levelName, String difficulty) {
            this.levelName = levelName;
            this.difficulty = difficulty;
        }
    }

}

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level(info, points));
    }
}*/

class Level {
    private LevelInfo levelInfo;
    private Point[] points;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.getName() + ", difficulty is " + levelInfo.getDifficulty() + ", point count is " + points.length;
    }

    public int calculateLevelHash() {
        int result = 0;
        int hash = 0;
        for (int i = 0; i < points.length; i++) {
            result = points[i].x * points[i].y;
            hash += result;
         }
        return hash;
    }




    static class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }
}

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}