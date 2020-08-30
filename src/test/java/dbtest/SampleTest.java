package dbtest;

import db.dbconsumer.CompareTwoDatabaseTable;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SampleTest {
    CompareTwoDatabaseTable compareTwoDatabaseTable=new CompareTwoDatabaseTable();
    @Test
    public void validateFirstName() throws IOException, SQLException {
        List<String> actorsFirstNameListFromDB = compareTwoDatabaseTable.getActorsFirstNameFromDB();
        List<String> customersFirstNameListFromDB = compareTwoDatabaseTable.getCustomersFirstNameFromDB();

        for(int i =0; i<actorsFirstNameListFromDB.size(); i++){
            Assert.assertEquals(actorsFirstNameListFromDB.get(i), customersFirstNameListFromDB.get(i));
            System.out.println(actorsFirstNameListFromDB.get(i) + "==" + customersFirstNameListFromDB.get(i));
       //Assert.assertNotEquals(actorsFirstNameListFromDB.get(i),customersFirstNameListFromDB.get(i));
        }
    }
    @Test
    public void sampleTest(){
        Assert.assertEquals(true, true);
        System.out.println("Sample Test Passed");
    }
}
