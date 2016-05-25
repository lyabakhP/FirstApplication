package com.company;




public class Main {

    public static void main(String[] args) {

        int [] num = {1,2,3,4,5};
        ArrayService arrayService = new ArrayService();

        arrayService.print(num);
        arrayService.reverse(num);
        arrayService.print(num);

    }
}
