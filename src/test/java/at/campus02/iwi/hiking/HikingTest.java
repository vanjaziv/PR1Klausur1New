package at.campus02.iwi.hiking;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HikingTest {

    @Test
    public void testTotalNrObstacles() {
        Hiking a = new Hiking();

        assertEquals(11, a.totalNrObstacles('H'));
        assertEquals(3, a.totalNrObstacles('L'));
    }
    @Test
    public void testObstaclesPerRow() {
        Hiking a = new Hiking();
        int[] erg = new int[2];

        erg = a.countObstaclesPerRow(0);

        assertEquals(1, erg[0]);
        assertEquals(1, erg[1]);

        erg = a.countObstaclesPerRow(2);

        assertEquals(3, erg[0]);
        assertEquals(0, erg[1]);


        erg = a.countObstaclesPerRow(6);

        assertEquals(1, erg[0]);
        assertEquals(0, erg[1]);
    }
    @Test
    public void testEnergyNeeded() {
        Hiking a = new Hiking();

        assertEquals(-1, a.energyNeededInRow(0));
        assertEquals(6, a.energyNeededInRow(2));
        assertEquals(-1, a.energyNeededInRow(5));
        assertEquals(2, a.energyNeededInRow(1));

    }
    @Test
    public void testFinish() {
        Hiking a = new Hiking();
        assertEquals(5, a.ableToFinishHiking(6));
        assertEquals(4, a.ableToFinishHiking(5));
        assertEquals(4, a.ableToFinishHiking(2));

    }


}
