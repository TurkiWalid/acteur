import junit.framework.TestCase;

public class MyTestRunner extends TestCase {

    public void testx(){
        int result = Main.testc();
        assertTrue(result == 2);
    }
}
