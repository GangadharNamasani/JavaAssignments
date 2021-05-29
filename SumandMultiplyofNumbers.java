package com.gangadhar;

import java.util.Scanner;
public class SumandMultiplyofNumbers
{
public static void main(String args[])
{
    int sum = 0;
    int multiplyResult = 1;
    int n=10;
    for(int i = 1;i <= n;i++)
    {
        sum = sum + i;
    }
    System.out.println("The Sum Of "+n+" Numbers are:" + sum);
    for(int i = 1;i <= n;i++)
    {
        multiplyResult = multiplyResult * i;
    }
    System.out.println("The multiplication Of "+n+" Numbers are:" + multiplyResult);

}

}

