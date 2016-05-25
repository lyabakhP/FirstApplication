package com.company;
//import java.util.Arrays;
//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by : Oleksandr_Kolesnyk
 * Created at : 5/25/2016
 */


public class ArrayService {

    public int[] reverse (int[] arr) {

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

    public int[] reversNew (int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
        return arr;
    }

    public void print (int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr);
        }
        System.out.println("");
    }

}


