import java.util.ArrayList;

public class GameMaster {
    static private GameMaster singleton;
    private GameBoard gameboard;
    private ArrayList players;

    public static GameMaster instance() {
        if(singleton == null) {
            singleton = new GameMaster();
        }

        return singleton;
    }

    public void movePlayer(int playerIndex, int diceRoll) {
        Player player = getPlayer(playerIndex);
        Cell playerPosition = player.getPosition();
        int oldIndex = gameboard.getCellIndex(playerPosition);
        int newIndex = (oldIndex + diceRoll) % gameboard.getCellNumber();
        Cell newPosition = gameboard.getCell(newIndex);
        player.setPosition(newPosition);
    }

    public void setGameBoard(GameBoard board) {
        this.gameboard = board;
    }

    public void setNumberOfPlayers(int number) {
        players = new ArrayList(number);

        for(int i = 0; i < number; i++) {
            Player player = new Player();
            players.add(player);
        }
    }

    public GameBoard getGameBoard() {
        return gameboard;
    }

    public int getNumberOfPlayers() {
        return players.size();
    }

    public Player getPlayer(int index) {
        return (Player)players.get(index);
    }
}
