package codewarstest_01;

import codewars_01.OppositesAttract;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OppositesAttractTest {

    @Test
    public void testEvenAndEven (){

        Assert.assertEquals(true, OppositesAttract.isLove(2,2));
    }

    @Test
    public void testEvenAndOdd () {

        Assert.assertEquals(false, OppositesAttract.isLove(4,1));

    }

    @Test
    public void testOddAndOdd () {

        Assert.assertEquals(true, OppositesAttract.isLove(3,3));

    }

    @Test
    public void testOddAndEven () {

        Assert.assertEquals(false, OppositesAttract.isLove(5,8));

    }


}
