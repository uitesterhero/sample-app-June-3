package basic.unittests;

import org.junit.jupiter.api.Test;
import org.junit.Ignore;
import static org.junit.Assert.fail;

public class ThirdSuiteTest {
    @Ignore
    @Test
    public void thirdTest1() {
        System.out.println("thirdTest1 successful!");
    }

    @Test
    public void thirdTest2() throws Exception {
        fail("forcing a test failure");
    }

    @Test
    public void thirdTest3() throws Exception {
        throw new Exception("Trying to throw an error");
    }
}
