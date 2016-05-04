package org.math;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by deepak on 14/2/15.
 * Project Name : ${PROJECT_NAME}
 */
public class CalculatorTest {
    @Test
    public  void addTest(){
        // this is comment
        Calculator c = new Calculator();
        Assert.assertEquals(5, c.add(3, 2));
        Assert.assertEquals(3, c.add(1, 2) );
        c =null ;
    }

    @Test
    public void subTest(){
        // this is comment
        Calculator s = new Calculator();
        Assert.assertEquals(2 , s.sub(5,3));
        s = null ;
    }
}
