package com.company;

public class SumPair {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 7, 6, 5, 9};
        int[] arr2 = new int[]{2,7,6,3,4};


        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] + arr2[j] == 13) {

                    System.out.println("(" + arr1[i] + "," + arr2[j] + ")");
                }
            }

        }
    }
}
