package com.company;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] str = new int[10];

        int n = str.length;

        System.out.println("Enter num");

        for (int i = 0; i < str.length; i++) {


            str[i] = input.nextInt();
        }

        int odd = 0;
        int even = 0;

        for (int i = 0; i < str.length; i++) {

            if (str[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

            System.out.println("\nThe total number of even values is\t" +even);
            System.out.println("The total number of odd values is\t" + odd);

        }
    }


