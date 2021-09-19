/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * A program that reads a hard coded stored password that is case sensitive.
 * It will either present the user with a welcome message or with a negative response. 
 */
package exercise15;
import java.util.*;


public class solution15 {
    public static void main(String [] args){
        String password = "abc$123"; //stored password
        Scanner sc = new Scanner(System.in); //user input

        System.out.print("What's the password? \n");
        String unknownPassword = sc.nextLine(); //user password

        if(password.equals(unknownPassword)){ //calls back stored value
            System.out.println("Welcome!");
        } else { //wrong password
            System.out.println("I do not know you!!!!!!!! ");
        }
    }

}
