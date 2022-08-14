import java.util.Random;

public class InsertionSort {

    public static void main (String[] args) {
            Random randomNumberGenerator = new Random();
            int[] UnsortedIntegerArray = new int[20];

            for (int i = 0; i < UnsortedIntegerArray.length; i++) {
                UnsortedIntegerArray[i] = randomNumberGenerator.nextInt(60);
            }
            String printValue1 = "";
            for (int i = 0; i < UnsortedIntegerArray.length; i++) {
                printValue1 += UnsortedIntegerArray[i] + ", ";
            }
            System.out.println(printValue1);
            int comparisonVariable = 0;
            int passCounter = 1;
            int locationVariable = UnsortedIntegerArray.length - passCounter;
            int iteratorNumber = 0;
            int swapLocation = iteratorNumber;
            comparisonVariable = UnsortedIntegerArray[iteratorNumber];
            while ( locationVariable > 0 ) {
                while ( iteratorNumber < (UnsortedIntegerArray.length +1 )- passCounter ){
                    if( comparisonVariable < UnsortedIntegerArray[iteratorNumber]) {
                        comparisonVariable = UnsortedIntegerArray[iteratorNumber];
                        swapLocation = iteratorNumber;
                    }
                    iteratorNumber ++;
                }
                UnsortedIntegerArray[swapLocation] = UnsortedIntegerArray[locationVariable];
                UnsortedIntegerArray[locationVariable] = comparisonVariable;
                passCounter ++;
                locationVariable = UnsortedIntegerArray.length - passCounter;
                iteratorNumber = 0;
                comparisonVariable =0;

            }
            printValue1 = "";
            for ( int i = 0 ; i < UnsortedIntegerArray.length ; i++ ) {
                printValue1 += UnsortedIntegerArray[i] + ", ";
            }
            System.out.println(printValue1);
        }


}

