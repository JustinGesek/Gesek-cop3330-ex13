package ex13;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;
import java.lang.Math;
//What is the principal amount? 1500
//What is the rate? 4.3
//What is the number of years? 6
//What is the number of times the interest is compounded per year? 4
//$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
//The formula you’ll use for this is A = P(1 + r/n)^(n*t) where

//P is the principal amount.
//r is the annual rate of interest.
//t is the number of years the amount is invested.
//n is the number of times the interest is compounded per year.
//A is the amount at the end of the investment.
public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        long principal = scanner.nextLong();

        System.out.print("What is the rate? ");
        double rate = scanner.nextDouble() / 100.0;

        System.out.print("What is the number of years? ");
        long years = scanner.nextLong();

        System.out.print("What is the number of times the interest is compounded per year? ");
        long period = scanner.nextLong();

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n", principal, rate * 100.0, years, period, principal*Math.pow(1 + rate/period,period*years));

    }
}
