package bubbleSorter;
//sorts highest right
import java.util.*;

public class BubbleSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random ();
		int[] nArray = new int[10];
		for ( int i = 0 ; i < nArray.length ; i++ ){
			nArray[ i ] = r.nextInt(30);}
		
	scanAndWriteArrays (nArray);	
	
	}


	public static void scanAndWriteArrays (int [] nArray ) {	
		
		//this variable operator sets up the main while loop and allows us to write an exit condition
		boolean aa = false;
		
		int startVar1 = 0;
		int endVar1 = 0;
		
		
		//outlier use code
		//if ( nArray.length < 1 ){
		//	System.out.println("Add more numbers to sort!");
		//}	
		// outlier use code as well
		//no longer works with redesign,  don't care to fix it since no reason
		//if (nArray.length == 1) {continue;}
		
		//if ( nArray.length > 2 ) {	
		//}
		while (!aa) {
			while (startVar1 < (nArray.length - 1)) {
			int Holder1 = nArray[startVar1];
			int Holder2 = nArray[startVar1 + 1]; 
			int Comparator1 = Holder1;
			int Comparator2 = Holder2;
			
			if ( Comparator1 < Comparator2 ) {
			startVar1++;
			endVar1++;
				
			}
			
			if ( Comparator1 == Comparator2 ) {
				startVar1++;
				endVar1++;
			}
			
			if (Comparator1 > Comparator2) {
				nArray[startVar1] = Holder2;
				nArray[startVar1 + 1] = Holder1;
				startVar1++;
				endVar1 = 0;
				
				
			}
				
			}
			if (endVar1 >= nArray.length ) {
				String output = "";
				for (int i = 0 ; i < nArray.length ; i++) {
					output += nArray[i] + ", ";
					}
				System.out.println(output);
				aa = true ; 
			} else {
				startVar1 = 0;
			}
	}
	
}
}


	
	
 //-  
 //declare variables 
 
 //- -
 //if a change is necessary write the values to arrays, decrease variable?
 
 ///- - 
// if a change is not necessary. increase the value of the initial variable, break?
 
 
