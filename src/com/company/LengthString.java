package com.company;

import java.util.Scanner;

public class LengthString {

    public static void main(String[] args){


     String [] inputString = new String[100];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string");

        for (int i=0;i<inputString.length;i++){

            inputString[i]= input.nextLine();

            System.out.println("The length of the string is\t" +inputString[i].length());
        }


    }
}
