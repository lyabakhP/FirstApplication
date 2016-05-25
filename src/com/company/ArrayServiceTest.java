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
        int [] arr = {1,2,3,4,5};
        arrayService.reversNew(arr);
        int [] expected = {5,4,3,2,1};
        int [] actual = arr;
        Assert.assertArrayEquals(expected,actual);
    }

}