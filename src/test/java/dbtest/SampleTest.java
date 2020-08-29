package dbtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void sampleTest(){
        Assert.assertEquals(true, true);
        System.out.println("Sample Test Passed");
    }
}
