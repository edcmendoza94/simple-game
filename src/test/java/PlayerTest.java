import junit.framework.TestCase;

public class PlayerTest extends TestCase {
    public PlayerTest(String name) {
        super(name);
    }

    public void testStartPosition() {
        GameBoard board = new SimpleGameBoard();
        GameMaster.instance().setGameBoard(board);
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Cell go = board.getCell(0);
        assertSame(go, playerOne.getPosition());
        assertSame(go, playerTwo.getPosition());
    }
}
