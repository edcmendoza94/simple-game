import junit.framework.TestCase;

public class GameMasterTest extends TestCase {
    public void testSingleton() {
        GameMaster firstInstance = GameMaster.instance();
        assertNotNull(firstInstance);

        GameMaster secondInstance = GameMaster.instance();
        assertNotNull(secondInstance);

        assertSame(firstInstance, secondInstance);
    }
}
