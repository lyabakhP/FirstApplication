package com.company;




public class Main {

    public static void main(String[] args) {

        int[] num = {1, 8, 9, 4, 7};
        ArrayService arrayService = new ArrayService();

        arrayService.print(num);

        arrayService.reverse(num);
        arrayService.print(num);

        arrayService.reversNew(num);
        arrayService.print(num);
    }
}
