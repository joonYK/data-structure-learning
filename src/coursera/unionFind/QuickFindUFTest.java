package coursera.unionFind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuickFindUFTest {

    private UnionFind uf = new QuickFindUF(10);

    @Test
    public void connectedTest() {
        assertFalse(uf.connected(0, 5));
    }

    @Test
    public void unionTest() {
        uf.union(0,1);
        uf.union(7,8);
        uf.union(8,9);

        assertTrue(uf.connected(0,1));
        assertTrue(uf.connected(7,8));
        assertTrue(uf.connected(7,9));
    }
}
