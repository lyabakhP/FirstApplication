package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scannerArray = new Scanner(System.in);
        Scanner scannerLength = new Scanner(System.in);

        int arrayLength = scannerLength.nextInt();
        int[] num = new int[arrayLength];
        int[] reverse = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = scannerArray.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        for (int i = 0, j = num.length - 1; i < num.length; i++, j--) {
            int t = num[i];
            reverse[j] = t;
        }

        System.out.println("Reverse array: ");

        for (int i = 0,j = 0; i < reverse.length; i++,j++) {
            int t = reverse[j];
            num[i] = t;
            System.out.print(num[i] + " ");
        }
    }
}
