package utilityClassesForTests;

import java.util.Scanner;

import hackerRank.kit_03_months_preparation.week_01.q05.CamelCase4;

public class ScannerConsoleExemple {

	public static void main(String[] args) {
       
		Scanner sn = new Scanner(System.in);
	    while(sn.hasNextLine()){
	        CamelCase4.camelCase(sn.nextLine());
	       // System.out.println(sn.nextLine());
	    }
	    sn.close();    	    
    }

}
