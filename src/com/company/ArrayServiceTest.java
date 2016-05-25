package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anazema on 25.05.2016.
 */
public class ArrayServiceTest {
    @Test
    public void reverse() throws Exception {
        ArrayService arrayService = new ArrayService();
        int [] arrayPavel = {1,2,3,4,5};
        arrayService.reverse(arrayPavel);
        int [] expectedPavel = {5,4,3,2,1};
        int [] actualPavel = arrayPavel;
        Assert.assertArrayEquals(expectedPavel,actualPavel);
    }

    @Test
    public void reversNew() throws Exception {
        ArrayService arrayService = new ArrayService();
        int [] arrAlexander = {1,2,3,4,5};
        arrayService.reversNew(arrAlexander);
        int [] expectedAlexander = {5,4,3,2,1};
        int [] actualAlexander = arrAlexander;
        Assert.assertArrayEquals(expectedAlexander,actualAlexander);
    }

}