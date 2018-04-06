package com.freemahn;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Pavel Gordon
 */
public class MainTestClass
{
    @Test
    public void testMid()
    {
        assertEquals(MainClass.mid(Arrays.asList(11, 12), 2), Arrays.asList(11, 12));
        assertEquals(MainClass.mid(Arrays.asList(11, 6, 19, 3, 8, 22, 9), 3), Arrays.asList(8, 9, 11));
        assertEquals(MainClass.mid(Arrays.asList(11, 6, 19, 3, 8, 22, 9, 4, 10, 4, 7, 1), 4), Arrays.asList(6, 7, 8, 9));
    }
}
