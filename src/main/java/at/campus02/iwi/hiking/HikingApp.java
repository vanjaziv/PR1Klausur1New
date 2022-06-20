package at.campus02.iwi.hiking;

import java.util.Arrays;
import java.util.HashMap;

public class HikingApp {
    public static void main(String[] args) {
        Hiking a = new Hiking();
        a.print();

        System.out.println(a.totalNrObstacles('H'));
        System.out.println(a.totalNrObstacles('L'));

        System.out.println(Arrays.toString(a.countObstaclesPerRow(0)));

        System.out.println(a.energyNeededInRow(2));

        System.out.println(a.ableToFinishHiking(2));


    }
}
