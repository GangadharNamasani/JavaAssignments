package com.gangadhar;

import java.util.Scanner;
public class Season
{
    public static void main(String args[]) {

        int month;
String season;
        System.out.println("Enter the month as number \n 1 for Jan 2 for Feb and so on..");
        Scanner sc = new Scanner(System.in);
         month = sc.nextInt();
        System.out.println("You have selected month\t" + month);
if(month>=1 && month<=4){
    season="Summer";
}
       else if(month>=5 && month<=8){

    season="Winter";
        }

else if(month>=9 && month<=12) {
    season = "Rainy";
}
else
    season = "cannot be displayed due to invalid month";

        System.out.println("The season is\t" + season );
    }
}
