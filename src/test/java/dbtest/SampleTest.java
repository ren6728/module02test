package dbtest;

import db.dbconsumer.CompareTwoDatabaseTable;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SampleTest {

    @Test
    public void sampleTest(){
        Assert.assertEquals(true, true);
        System.out.println("Sample Test Passed");
    }

}
