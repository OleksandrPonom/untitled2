package Quarke;

/*class LevelLoader{
    String load(String levelName){
        return "Loading level " + levelName + " ...";
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        LevelLoader levelLoader = new LevelLoader();

        //Loading level Startlevel ...
        System.out.println(levelLoader.load("StartLevel"));
    }
}*/

/*
class LevelLoader {
    private static LevelLoader instance = new LevelLoader();
    public static LevelLoader getInstance(){
        return instance;
    }
    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}*/

class LevelLoader {
    private static LevelLoader instance = new LevelLoader();

    public static LevelLoader getInstance() {
        return instance;
    }

    private LevelLoader() {
    }

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}