public class GameMaster {
    static private GameMaster singleton;
    private GameBoard gameboard;

    public static GameMaster instance() {
        if(singleton == null) {
            singleton = new GameMaster();
        }

        return singleton;
    }

    public void setGameBoard(GameBoard board) {
        this.gameboard = board;
    }

    public void setNumberOfPlayers(int number) {

    }

    public GameBoard getGameBoard() {
        return gameboard;
    }

    public int getNumberOfPlayers() {
        return 0;
    }

    public Player getPlayer(int index) {
        return null;
    }
}
