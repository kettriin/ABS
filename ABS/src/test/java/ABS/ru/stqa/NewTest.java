package ABS.ru.stqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

    @Test
    public void testArea(){

        Point C = new Point(0,9);
        Point D = new Point(0,1);
        Assert.assertNotEquals(C.distance(D), 4);
    }

    @Test
    public void equalsOne(){

        Point C = new Point(0,2);
        Point D = new Point(0,1);
        Assert.assertEquals(C.distance(D), 1.0);
    }

    @Test
    public void compareFour(){

        Point C = new Point(0,4);
        Point D = new Point(0,1);
        assert C.distance(D) <= 4;
    }

}
