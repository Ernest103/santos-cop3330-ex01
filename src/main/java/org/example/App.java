package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        //Q_1
        String user_name, message;

        System.out.println("What is your name?");
        user_name = sc.nextLine();

        message = "Hello, " + user_name + " nice to meet you!";
        System.out.println(message);
    }
}
