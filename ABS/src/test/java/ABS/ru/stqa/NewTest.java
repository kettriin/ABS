package ABS.ru.stqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

    @Test
    //проверка, что расчёт идёт не только по Х координате
    public void XYcalc(){

        Point C = new Point(0,0);
        Point D = new Point(0,1);
        Assert.assertNotEquals(C.distance(D), 0);
    }

    @Test
    //проверка, что расчёт учитывает разницу в единицу
    public void OneCalc(){

        Point C = new Point(0,2);
        Point D = new Point(0,1);
        Assert.assertEquals(C.distance(D), 1.0);
    }

    @Test
    //проверка, что расчёт учитывает десятичные, если шкала координат содержит не только целые числа
    public void compareFour(){

        Point C = new Point(0.1,0);
        Point D = new Point(1,0);
        assert C.distance(D) < 1;
    }

}
