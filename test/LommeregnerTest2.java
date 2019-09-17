import junit.framework.TestCase;

public class LommeregnerTest2 extends TestCase {
    Lommeregner lommeregner = new Lommeregner();

    public void testSum() {
        assertEquals(6, lommeregner.sum(2,4));
    }

    public void testMinus() {
        assertEquals(2, lommeregner.minus(4,2));
    }

    public void testGange() {
        assertEquals(4, lommeregner.gange(2, 2));
    }

    public void testDividere() {
        assertEquals(5, lommeregner.dividere(10, 2));
    }

    public void testSecret() {
        assertEquals(4, lommeregner.secret(1,1));
    }
}