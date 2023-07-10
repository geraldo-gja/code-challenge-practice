package amazon;

public class Teste_Exemplo {

	
	/* 
    SDE Interview Coding Example
	https://www.youtube.com/watch?v=yKz2kPip4sg&t=131s
	
	- - -	
	Given a grid of robot positions, indicate IF it is a valid time series
	FOR the number of robots specified IF robots can only travel 
	up to 1 index further than their positon 1 step before
	
	input format: an array of arrays, of which each index can be 0 or 1.
	an index corresponds to the physical location which is either occupied by a robot (1) or empety (0)
	
	Ex: 
	Grid: [[1,0,0,1],[0,1,1,0]] is a valid series FOR 2 robots because 
	the first robot moved from index 0 to index 1 and robot 2 moved from index 3 to index 2)
	
	Grid: [[1,0,0,0,1],[1,0,1,0,0]] is not valid because the second robot
	started at index 4 but did not have a valid position on the sext step 
	
	* OBS: ele da 3 solu��es poss�veis 
	       1� solu��o, minuto 04:00 do video
	       2� solu��o, minuto 08:20 e 09:00 do video
	       3� solu��o, minuto 11:00 do video
	
	 */
	
	public static void main(String[] args) {
		// Auto-generated method stub
		
		Teste_Exemplo teste = new Teste_Exemplo();

		teste.questao_01();
	}
	
	public void questao_01(){	
		
		int[][] grid1 = {{1,0,0,1},{0,1,1,0}};
		int[][] grid2 = {{1,0,0,0,1},{1,0,1,0,0}};
		
		int[][] grid3 = {{1,0,0,1},{1,0,0,1}};
		
		isValidPath(2, grid1);
					
	//	System.out.println( isValidPath_1(grid1, numRobots) );
	//	System.out.println( isValidPath_1(grid2, numRobots) );
		
		System.out.println( isValidPath(numRobots, grid1) );
		System.out.println( isValidPath(numRobots, grid2) );
		System.out.println( isValidPath(numRobots, grid3) );
	
	}

	int numRobots = 2;
	
	//1� solu��o, minuto 04:00 do video
	boolean isValidPath_1( int[][] grid, int numRobots) {
		//not using numRobots, not verifying robot count
		//start from row 0
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if( grid[row][col] == 1) {
					//out of bounds
					if(  !(grid[row - 1][col - 1] == 1 || grid[row - 1][col] == 1 || grid[row - 1][col + 1] == 1) )
						return false;
				}
			}
		}	
		return true;
	}
	

	

	//2� solu��o, minuto 09:00 do video
	public boolean isValidPath( int numRobots, int[][] grid ) {
		
		for (int row = 0; row < grid.length; row++) {
			
			int robotsPerRow = 0;
			
			for (int col = 0; col < grid[0].length; col++) {
				if( grid[row][col] == 1) {
					robotsPerRow++;
				}
			}
			if( robotsPerRow != numRobots ) {
				return false;
			}
		}			
		int[] robotIndecesCur = getRobotIndeces( grid[0]); 
		for (int row = 1; row < grid.length; row++) {
			
			int[] robotIndecesNex = getRobotIndeces( grid[row]); 
			
			if( ! validPath( robotIndecesCur, robotIndecesNex ) ){
				return false;
			}			
			robotIndecesCur = robotIndecesNex;
		}
		return true;
	}
	
	//indices 8:20
	public int[] getRobotIndeces( int[] gridRow ) {
		
		int[] robotPositions = new int[numRobots];
		int curRobot = 0;
		
		for (int i = 0; i < gridRow.length; i++) {
			if( gridRow[i] == 1) {
				robotPositions[curRobot++] = i;
			}
		}
		
		return robotPositions;
	}
	
	
	//minuto 08:20 do video
	//OBS: biblioteca Math.abs (minuto 8:40), garante sempre retonar n�mero positivo
	public boolean validPath( int[] curPosition, int[] nexPosition ) {
		
		for (int i = 1; i < curPosition.length; i++) {	
			if( Math.abs( curPosition[i] - nexPosition[i] ) > 1  ){
				return false;
			}			
		}
		return true;
	}
	
	
	
	
}
