/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        System.out.println("Password: ");
        String password = jb.nextLine();
        String sonk;
        int numbC = 0;
        int charC = 0;
        int specialC = 0;
        int letterC = 0;
        for(int i = 0; i < password.length(); i++)
        {
            char first = password.charAt(i);
            if(Character.isAlphabetic(first))
            {
                letterC++;
            }
            else if(Character.isDigit(first))
            {
                numbC++;
            }
            else
            {
                specialC++;
            }
            charC++;
        }
        if(charC >= 8)
        {
            if (numbC == 0)
            {
                sonk = ("weak");
            }
            else if(specialC == 0)
            {
                sonk = ("strong");
            }
            else
            {
                sonk = ("very strong");
            }
        }
        else
        {
            if(letterC == 0)
            {
                sonk = ("very weak");
            }
            else
            {
                sonk = ("weak");
            }
        }
        System.out.println("Your password '" + password + "' is " + sonk);
    }
}