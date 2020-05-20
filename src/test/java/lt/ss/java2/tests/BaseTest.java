package lt.ss.java2.tests;

import org.junit.After;
import org.junit.Before;

public class BaseTest {


    @Before
    public void before() {
    }

    @After
    public void after() {
        DBServiceTest.close();
    }
}
