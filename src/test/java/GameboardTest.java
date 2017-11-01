/*
 * Run a test, please
 */

import junit.framework.TestCase;

public class GameboardTest extends TestCase {
    GameBoard gameboard;
    public GameboardTest(String name) {
        super(name);
    }

    public void testAddCell() {
        gameboard = new GameBoard();
        assertEquals(1, gameboard.getCellNumber());
        Cell cell = new Cell();
        gameboard.addCell(cell);
        assertEquals(2, gameboard.getCellNumber());
    }

    public void testFirstCell() {
        gameboard = new GameBoard();
        Cell firstCell = gameboard.getCell(0);
        assertSame(GoCell.class, firstCell.getClass());
    }

    public void testGetCellIndex() {
        GameBoard gameboard = new SimpleGameBoard();
        Cell blueTwo = gameboard.getCell(2);
        int index = gameboard.getCellIndex(blueTwo);
        assertEquals(2, index);
        Cell falseCell = new Cell();
        index = gameboard.getCellIndex(falseCell);
        assertEquals(-1, index);
    }
}
