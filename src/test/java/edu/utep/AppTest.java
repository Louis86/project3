package edu.utep;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import edu.utep.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Control Test
     */
    public void testApp()
    {
        String[] args = {"arg1","arg2","arg3"};
        edu.utep.App.main(args);
        assertTrue( true );
    }

    public void testApp1() {
        TestingObject testingObject = new TestingObject(1);
        assertEquals(1, testingObject.inAndOutTester(1,1));
        assertEquals(2, testingObject.inAndOutTester(1,2));
        assertEquals(3, testingObject.inAndOutTester(1,3));
        assertEquals(4, testingObject.inAndOutTester(1,4));
        assertEquals(0, testingObject.inAndOutTester(1,5));

    }
    public void testApp2() {
        TestingObject testingObject = new TestingObject(1);
        assertEquals(-1, testingObject.inAndOutTester(2,-1));
        assertEquals(0, testingObject.inAndOutTester(2,0));
        assertEquals(1, testingObject.inAndOutTester(2,1));

    }
    public void testApp3() {
        TestingObject testingObject = new TestingObject(1);
        assertEquals(31, testingObject.inAndOutTester(3,1));
        assertEquals(32, testingObject.inAndOutTester(3,2));
        assertEquals(33, testingObject.inAndOutTester(3,3));
        assertEquals(0, testingObject.inAndOutTester(3,4));

    }
    public void testApp4() {
        TestingObject testingObject = new TestingObject(1);
        assertEquals(41, testingObject.inAndOutTester(4,1));
    }
    public void testApp5() {
        TestingObject testingObject = new TestingObject(1);
        assertEquals(5, testingObject.inAndOutTester(5,0));
    }
}
