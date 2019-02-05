package com.company;

public class LockerProblem {

    public static void main(String[] args) {

        boolean[] closedLockers = new boolean[100]; //100 lockers initialized

        int n = closedLockers.length; //declaring array length



           for (int i=1;i<n;i++){

              closedLockers[i]=true;
           }



        for (int i = 1; i < n; i++) {

            for (int j = i; j < n; j += i+1) {

                closedLockers[j] = !closedLockers[j];
            }
        }

        for (int i = 1; i < n ; i++) {

            if(closedLockers[i]){

                System.out.print("Locker\t" + i + "\tis open\n");
            }
        }
    }
}


