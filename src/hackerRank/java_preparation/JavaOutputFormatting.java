package hackerRank.java_preparation;

import java.util.Scanner;

public class JavaOutputFormatting {

	/*
	 * Link: https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
	 * 
java 100
cpp 65
python 50
	 
================================
java           100 
cpp            065 
python         050 
================================
	 */

	private static Scanner sc;

	public static void main(String[] args) {
		
        sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();
            
           
            int len = 15 - s1.length();
            String space = "";
            for(int j=0; j<len; j++) {
            	space = space + " ";
            }
            
            if( x < 100 )
            	space = space + "0";
            if( x < 10)
            	space = space + "0";
            
            System.out.println(s1 + space + x);
        }
        System.out.println("================================");

	}

}
