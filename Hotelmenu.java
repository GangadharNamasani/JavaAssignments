package com.gangadhar;

import java.util.Scanner;

public class Hotelmenu
{
    public static void main(String args[]) {

        int itemno,bill=0;
        System.out.println("Please select your menu ");
        System.out.println("Index \tItem \tPrice ");
        System.out.println("1 \t\tDosa \t20 ");
        System.out.println("2 \t\tIdly \t10 ");
        System.out.println("3 \t\tPongal \t30 ");
        System.out.println("Enter item number");
        Scanner sc = new Scanner(System.in);
         itemno = sc.nextInt();
        System.out.println("You have selected Item number\t" + itemno);
        System.out.println("Enter Number of Plates");
        int noofplates = sc.nextInt();
        System.out.println("You have selected\t" + noofplates + "\tplates");
if(itemno==1){

    bill=noofplates*20;
}
       else if(itemno==2){

            bill=noofplates*10;
        }

else
            bill=noofplates*30;


        System.out.println("Your bill is\t" + bill + "\trupees");
    }
}
