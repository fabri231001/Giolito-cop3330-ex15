/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    System.out.println("What is the password? ");
        Scanner s1 = new Scanner(System.in);
        String p = s1.nextLine();
        String rp = "abc$123";
        if(p.equals(rp))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you!");
    }
}
