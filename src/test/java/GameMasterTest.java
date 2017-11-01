import junit.framework.TestCase;

public class GameMasterTest extends TestCase {
    GameMaster master;

    public void testSingleton() {
        GameMaster firstInstance = GameMaster.instance();
        assertNotNull(firstInstance);

        GameMaster secondInstance = GameMaster.instance();
        assertNotNull(secondInstance);

        assertSame(firstInstance, secondInstance);
    }

    public void testPlayerInit() {
        master = GameMaster.instance();
        master.setGameBoard(new SimpleGameBoard());
        master.setNumberOfPlayers(6);
        assertEquals(6, master.getNumberOfPlayers());
        Cell go = master.getGameBoard().getCell(0);

        for(int i = 0; i < 6; i++) {
            Player player = master.getPlayer(i);
            assertSame(go, player.getPosition());
        }
    }

    public void testMovePlayerSimple() {
        master = GameMaster.instance();
        master.setGameBoard(new SimpleGameBoard());
        master.setNumberOfPlayers(1);
        Player player = master.getPlayer(0);
        master.movePlayer(0, 2);
        assertEquals("Blue 2", player.getPosition().getName());
        master.movePlayer(0, 3);
        assertEquals("Green 2", player.getPosition().getName());
    }
}
