public class GameMaster {
    static private GameMaster singleton;

    public static GameMaster instance() {
        if(singleton == null) {
            singleton = new GameMaster();
        }

        return singleton;
    }
}
