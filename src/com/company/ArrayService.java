package com.company;
//import java.util.Arrays;
//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by : Oleksandr_Kolesnyk
 * Created at : 5/25/2016
 */


public class ArrayService {

    public static int[] reverse (int[] arr) {

       for(int i = 0,j = arr.length - 1; i<arr.length; i++,j--) {

           int a = arr[j];
           int b = arr[i];
           arr[i] = a;
           arr[j] = b;

           if (i == j) {
               break;
           }
       }
        return arr;
    }

}


