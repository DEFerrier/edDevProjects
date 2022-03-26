package bubbleSorter;
//sorts highest right
import java.util.*;

public class BubbleSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random ();
		int[] nArray = new int[20];
		for ( int i = 0 ; i < nArray.length ; i++ ){
			nArray[ i ] = r.nextInt(60);
		}
		
	scanAndWriteArrays (nArray);	
	
	}


	public static void scanAndWriteArrays (int [] nArray ) {	
		
		//this variable operator sets up the main while loop and allows us to write an exit condition
		boolean aa = false;
		
		int startLoc = 0;
		while (!aa) {
			// this variable tracks if a swap has occurred during the array pass
			boolean areWeStop = true;
			while (startLoc < (nArray.length - 1)) {
			//the holder variables hold the data in memory as a reference
			int Holder1 = nArray[startLoc];
			int Holder2 = nArray[startLoc+ 1]; 
			//the comparator variables are the data being manipulated by the program in the array
			int Comparator1 = Holder1;
			int Comparator2 = Holder2;
			
			//swap if necessary
			if (Comparator1 > Comparator2) {
				nArray[startLoc] = Holder2;
				nArray[startLoc + 1] = Holder1;
				startLoc++;
				areWeStop = false;
				
				
				
				
			}
			//pass and increment if no swap
			if ( Comparator1 < Comparator2 ) {
			startLoc++;
				
			}
			
			if ( Comparator1 == Comparator2 ) {
				startLoc++;
			}
			
			
				
			}
			//evaluate the ending conditions and print to console if true
			if (startLoc == nArray.length-1 && areWeStop == true) {
				String output = "";
				for (int i = 0 ; i < nArray.length ; i++) {
					output += nArray[i] + ", ";
					}
				System.out.println(output);
				aa = true ; 
			} else {
				startLoc = 0;
			}
	}
	
}
}
