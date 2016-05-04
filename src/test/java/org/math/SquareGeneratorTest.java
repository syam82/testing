package org.math;

import junit.framework.TestCase;

public class SquareGeneratorTest extends TestCase {

    private  SquareGenerator s =null ;
    public void setUp() throws Exception {
        super.setUp();

         s = new SquareGenerator();

    }

    public void tearDown() throws Exception {
        assertEquals(25 , s.squareOf(5));
    }

    public void testSquareOf() throws Exception {
        s = null ;
    }
}