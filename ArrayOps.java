public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(containsTheSameElements(new int [] {3, -4, 1, 2, 5},new int [] {1, 3, -4, 5}));
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        boolean missing = true;
        /*
            #feedback:
            Basically in your implemantation the retun -1 will be never achived but it required cause the semantic of functions in jave.
            Let's change the implemantation little bit so it won't confuse the reader that -1 is posible result.
        */
        // #feedback: first we define the default value to be returned when there is no missing item to be n;
        int missingNumber = n;
        // #feedback: then we don't have to iterate till n.
        for (int i=0 ; i <n ; i++) {
            for (int j = 0; j < n ; j++){
                if (i == array[j]){
                    missing = false;
                }
            }
            // #feedback: use boolean in condition as they are without compering their values.
            if (missing) {
                // #feedback: instead of return we define missingNumber and break the loop
                missingNumber = i;
                break;
              }
          missing = true;
        }
        // #feedback: finally, we return missingNumber that found (or not, but than it will be n by it initialization as required).
        return missingNumber;
    }
    public static int secondMaxValue(int [] array) {
        int max = array[0] ;
        int secondM = 0 ;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >=max) {
                secondM = max ;     
                max = array[i];
            }
            else {
                if (array[i]>secondM) {
                    secondM = array[i];
                } 
                }
            
        }
        return secondM;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean exist = false ;
        // #feedback: you validated only one direction, when array1 is subset of array2, but not when array2 is subset of array1
        for (int i = 0; i < array1.length ; i++){
            for (int j = 0; j < array2.length ; j++){
                if (array1[i]==array2[j]) {
                    exist = true ; 
                }
            }
            if ( exist == false )
            return false ;
        exist = false ;
        }
        return true ;
    }

    public static boolean isSorted(int [] array) {
        boolean sorted = true;
        if (array[0]>array[1]){
            for (int i = 1 ; i <array.length-1 ; i++){
                if (array[i]< array[i+1]){
                    sorted = false;
                }
            }
        }
        else {
            if (array[0]<array[1]){
                for (int i = 1 ; i <array.length-1 ; i++){
                    if (array[i]> array[i+1]){
                        sorted = false;
                    }
                }
            }
      
        }  return sorted;
    }

}
