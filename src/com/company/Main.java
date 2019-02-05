package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String[] words = new String[100]; //declare the string for input

        System.out.println("Enter the word to reverse"); // asks to input the word

        for (int i = 0; i < words.length; i++) {

            words[i] = input.nextLine(); // input the word from the user first attempt

            String rev[] = new String[words.length]; //declaring the string to store reverse operation

            rev[i] = new StringBuilder(words[i]).reverse().toString(); //method to print reverse

            System.out.println(rev[i]); //print reverse string


        }
    }
}


