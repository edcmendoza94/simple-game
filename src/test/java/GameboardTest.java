/*
 * Run a test, please
 */

import junit.framework.TestCase;

public class GameboardTest extends TestCase {
    public GameboardTest(String name) {
        super(name);
    }

    public void testAddCell() {
        GameBoard gameboard = new GameBoard();
        assertEquals(1, gameboard.getCellNumber());
        Cell cell = new Cell();
        gameboard.addCell(cell);
        assertEquals(2, gameboard.getCellNumber());
    }

    public void testFirstCell() {
        GameBoard gameboard = new GameBoard();
        Cell firstCell = gameboard.getCell(0);
        assertSame(GoCell.class, firstCell.getClass());
    }
}
