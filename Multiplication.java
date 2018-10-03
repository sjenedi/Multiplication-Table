/**
 * @author Sami Jenedi
 * This program will call a method that displays a simple multiplication table.
 */

import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int rows = 0;
		int columns = 0;
		
		System.out.print("Number of rows: "); 
		rows = input.nextInt();
		
		System.out.print("Number of colums: "); 
		columns = input.nextInt();	
		
		displayTable(rows, columns);
	}
	
	public static void displayTable(int rows, int cols) {
		 
		for (  int i = 1; i <= rows; i++ ) {
			
			for ( int j = 1 ; j <= cols; j++) {
				System.out.printf("%-4d",  i * j );
				//System.out.print( i * j ); 
			}
			System.out.println(" "); 
		}
		
		
		   
		}

}
