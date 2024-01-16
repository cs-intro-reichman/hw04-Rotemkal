public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(camelCase("    Intro to coMPUter   sCIEncE ")); 
    }
    /**
     * @param string
     * @return
     */
    public static String capVowelsLowRest (String string) {
        char [] arr = {'a', 'i', 'o', 'e', 'u', 'A' , 'I', 'O', 'E', 'U'} ;
        boolean isVow ;
            String newS = "" ;
            for (int i = 0 ; i < string.length() ; i++) {
                isVow = false ; 
                char c = string.charAt(i);
                if (c == 32){
                    newS += c;
                }
                else {
                   for (int j = 0 ; j < arr.length ; j++) {
                        if (c == arr[j]){
                            isVow =  true ;
                        }
                    }
                     if (isVow == false) {
                        if (c >= 65 && c<= 90){
                        newS += (char)(c+32);
                        }
                        else {
                            newS+= c;
                        }
                    }
                    else {
                        if (isVow == true){
                            if (c >= 97 && c<= 122){
                                newS += (char)(c-32);
                            }
                            else {
                                newS += c;
                            }
                        }
                    }
                    }
                }
        return newS;
            }

    public static String camelCase (String string) {
        String newS = "" ;
        int index = 0 ;
        char c = string.charAt(index);
        while ( c == 32 ) {
            index ++ ;
            c =  string.charAt(index);
        }
        if (c >= 65 && c<= 90){
            newS += (char)(c+32);
        }
        else {
            newS += c;
        }
        for (int i = index + 1; i < string.length() ; i++ ) {
            c = string.charAt(i);
            if (c == 32){
                continue;
            }
            if (string.charAt(i - 1) == 32) {
                if (c >= 97 && c <= 122) {
                    newS += (char)(c-32);
                }
                else {
                    newS += c;
                }
            }
            else {
                if (c >= 65 && c<= 90){
                    newS += (char)(c+32);
                }
                else {
                    newS += c; 
                }
            }
        }
        return newS;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0 ;
        for (int i = 0 ; i < string.length() ; i++ ){
            if (string.charAt(i) == chr){
                count++ ; 
            }
        }
        int [] arr = new int [count] ;
        int index = 0;
        for (int i = 0 ; i < string.length() ; i++) {
            if (string.charAt(i) == chr){
                arr[index] = i ; 
                index++;
            }
        }
        return arr ;
    }


}
