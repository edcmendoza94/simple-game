import junit.framework.TestCase;

public class GameMasterTest extends TestCase {
    public void testSingleton() {
        GameMaster firstInstance = GameMaster.instance();
        assertNotNull(firstInstance);

        GameMaster secondInstance = GameMaster.instance();
        assertNotNull(secondInstance);

        assertSame(firstInstance, secondInstance);
    }

    public void testPlayerInit() {
        GameMaster master = GameMaster.instance();
        master.setGameBoard(new SimpleGameBoard());
        master.setNumberOfPlayers(6);
        assertEquals(6, master.getNumberOfPlayers());
        Cell go = master.getGameBoard().getCell(0);

        for(int i = 0; i < 6; i++) {
            Player player = master.getPlayer(i);
            assertSame(go, player.getPosition());
        }
    }
}
