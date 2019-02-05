package com.company;

import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] str = new int[10];

        int n = str.length;

        for (int i = 0; i < n; i++) {

            System.out.println("Enter num");

            str[i] = input.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(str[i]==str[j])
                {
                    for (int k = j+1; k < n; k++) {
                        str[j] = str[k];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println("New Array list");

        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
    }

}



