package luxoft.interview03.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import luxoft.interview03.filesystem.File;
import luxoft.interview03.filesystem.FileSystem;

/**
 * Test for Java Backend Interview
 * 
 * @author Geraldo Jorge - Full-Stack Developer
 * 		   email: geraldo.gja@gmail.com
 * 		   phone: +55 (88) 9 9999-6947
 */
public class Main {

    public static void main(String[] args){
    	
    	Main m = new Main();
    	
    	//diagonal reverse sort of matrix values
    	List<File> sortFiles = m.diagonalReverseSort( FileSystem.files );

        //search for files
    	List<File> filteredListOfFiles = m.searhForFiles( sortFiles );
    	
        //print list of files found for previous search
    	m.printListFiles(filteredListOfFiles);
    }

    /**
     * List with the already sorted values according to the diagonal reverse scan in the matrix.
     * 
     * @param matrix - original matrix of File
     * @return sortFiles - ordered list of File
     */
    private List<File> diagonalReverseSort( File[][] matrix ){
    	
    	List<File> sortFiles = new ArrayList<File>();
    	
    	//sorting from the beginning to the middle of the array
    	for (int i = 0; i < matrix.length; i++) {	
    		int k = i;
    		for (int j = 0; j <= i; j++) {
    			sortFiles.add(matrix[j][k]);  
    			k--;
			}	
		}	
    	//sorting from the middle to the end
    	for (int i = 1; i < matrix.length; i++) {	
			int k = i;
			for (int j = matrix.length - 1; j >= i; j--) {
				sortFiles.add(matrix[k][j]);
				k++;
			}	
		}   	
    	return sortFiles;
    }
    
    /**
     * Asks if the user wants to filter by one or more file attributes. 
     * Then performs the search by applying the filters.
     * 
     * @param list - ordered list
     * @return filteredListOfFiles
     */
    private List<File> searhForFiles( List<File> list ) {
    	
    	//asking filter questions
    	Scanner read = new Scanner(System.in);
    	String answer = null;
    	Integer maxSize = null;
    	String nameContaing = null;
    	Integer beforeDay = null;
    	String typePermission = null;
    	
    	System.out.printf("would you like to apply filter by file size? Type Y or N: ");
    	answer = read.next();
    	if( answer.equals("Y") ) {
    		System.out.printf("Inform the maximum file size: ");
    		maxSize = read.nextInt();	
    		System.out.println("");
    	}  	
    	System.out.printf("would you like to apply filter by file name? Type Y or N: ");
    	answer = read.next();
    	if( answer.equals("Y") ) {
    		System.out.printf("Inform the characters that the file name must contain: ");
    		nameContaing = read.next();    	
    		System.out.println("");
    	}  	
    	System.out.printf("would you like to apply filter by file date? Type Y or N: ");
    	answer = read.next();
    	if( answer.equals("Y") ) {
    		System.out.printf("Enter the maximum day: (att: just the files before that date will be printed) ");
    		beforeDay = read.nextInt();    	
    		System.out.println("");
    	}    	
    	System.out.printf("would you like to apply filter by file permission? Type Y or N: ");
    	answer = read.next();
    	if( answer.equals("Y") ) {
    		System.out.printf("Inform the type of permission (eg:R, W, RW): ");
    		typePermission = read.next();    	
    		System.out.println("");
    	}   	
    	read.close();
    	
    	//applying the filters
    	List<File> filteredListOfFiles = new ArrayList<File>();
    	
    	for (int i = 0; i < list.size(); i++) {
			
    		File file = list.get(i);
    		boolean b = true;
    		
    		if( maxSize != null && file.getSize() > maxSize ) 
    			b = false;    				
    		if( nameContaing != null && file.getName().contains( nameContaing ) == false )	
    			b = false;		
    		if( beforeDay != null && file.getTimeCreated().getDayOfMonth() > beforeDay)
    			b = false;	
    		if( typePermission != null && file.getPermission().name().equals(typePermission) == false )
    			b = false;
    		
    		if( b )
    			filteredListOfFiles.add(file);  //if it meets all filters, then it is added to the list
		}
    	
    	return filteredListOfFiles;
    }
    
    
    /**
     * Print list files
     * 
     * @param list - list of files found for previous search
     */
    private void printListFiles( List<File> list ) {
    	
    	System.out.println("");
    	System.out.println("- - - - LIST OF FILES - - - - -");
    	System.out.println("");
    	for (int i = 0; i < list.size(); i++) {
			System.out.println( list.get(i).getName() + " / " + 
			                    list.get(i).getSize() + " / " +  
					            list.get(i).getTimeCreated() + " / " + 
					            list.get(i).getPermission());
		}
    }

    /*
    private void test() {
    	
    	//1, 2, 5, 3, 6, 9, 4, 7, 10, 13, 8, 11, 14, 12, 15, 16
    	//int m[][] = new int[][]{ { 1, 2, 3, 4}, { 5, 6, 7, 8}, { 9,10,11,12}, {13,14,15,16} };   
    		                     	   
    	//1, 2, 4, 3, 5, 7, 6, 8, 9
    	int m[][] = new int[][]{ {1,2,3},{4,5,6},{7,8,9} };   	

    	for (int i = 0; i < m.length; i++) {	
    		int k = i;
    		for (int j = 0; j <= i; j++) {
    			System.out.println( m[j][k] );
    			k--;
			}	
		}
    	for (int i = 1; i < m.length; i++) {	
			int k = i;
			for (int j = m.length - 1; j >= i; j--) {
				System.out.println( m[k][j] );
				k++;
			}	
		}
    }
    */
    
    
}
