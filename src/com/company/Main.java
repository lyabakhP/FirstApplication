package com.company;
public class Main {

    public static void main(String[] args) {

        int [] num = {1,2,3,4,5};

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        ArrayService.reverse(num);
        // return [I@1540e19d
        System.out.println(num);

    }
}
