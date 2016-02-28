package ru.kurs.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yana on 2/28/2016.
 */
public class PointTests {

    @Test
    public void testDistanse() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 1);
        assert p1.distanceTo(p2) == Math.sqrt(5);
        assert Math.abs(2.23607 - p1.distanceTo(p2)) < 0.0001;
        /*assert Math.abs(2.23 - p1.distanceTo(p2)) < 0.0001;*/
        Assert.assertEquals(p1.distanceTo(p2),Math.sqrt(5));


    }
}

