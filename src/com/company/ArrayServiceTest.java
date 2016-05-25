package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anazema on 25.05.2016.
 */
public class ArrayServiceTest {
    @Test
    public void reversNew() throws Exception {
ArrayService arrayService = new ArrayService();
        arrayService.reversNew(new int [] {1,2,3,4,5});
        //Assert.assertArrayEquals(int[] expecteds, int[] actuals);
    }

}