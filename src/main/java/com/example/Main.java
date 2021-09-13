package com.example;

import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Richard Nham
 */

public class Main {

    public static void main(String[] args) {
        Scanner scannerUserInput= new Scanner(System.in);
        int l;
        int b;

        System.out.println("What is the length of the ceiling in feet?");
        l =  scannerUserInput.nextInt();

        System.out.println("What is the breadth of the ceiling in feet?");
        b =  scannerUserInput.nextInt();

        int area = l * b;
        double gallons = Math.ceil(area/350.0);

        System.out.println("You will need to buy " + gallons + " gallon/s of paint to cover " + area + " square feet.");

        scannerUserInput.close();
    }

}
