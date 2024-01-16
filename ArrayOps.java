public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(findMissingInt (new int [] {3, 0, 1}));
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        boolean missing = true;
        for (int i=0 ; i <=n ; i++) {
            for (int j = 0; j < n ; j++){
                if (i == array[j]){
                    missing = false ; 
                }
            }
            if (missing == true){
            return i;
          }
          missing = true;
        }
        return -1 ;
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
        for (int i = 0; i < array1.length ; i++){
            for (int j = 0; j < array2.length ; j++){
                if (array1[i]==array2[j]) {
                    exist = true ; 
                }
            }
            if ( exist == false )
            return false ;
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
