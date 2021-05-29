package com.gangadhar;

import java.util.Scanner;

public class Currentbill {

	public static void main(String[] args) {
		int bill=0;
        System.out.println("Enter House/Commercial for generating the current bill\n");
        Scanner sc = new Scanner(System.in);
        String currentBillType = sc.next();
        System.out.println("You have selected\t" + currentBillType);
        System.out.println("Enter units");
int units = sc.nextInt();
        System.out.println("You have consumed" +units+ "units");

if (currentBillType.equalsIgnoreCase("House")) {

if(units>=1 && units<100)
            {
                bill=units*3;
            }
else
bill= units *4;
        }
else if (currentBillType.equalsIgnoreCase("Commercial")) {

if(units>=1 && units<100)
            {
                bill=units*10;
            }
else
bill= units *20;
        }
        System.out.println("Your bill is\t"+  bill  +"rupees");

	}

}
