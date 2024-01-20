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
        String vowels = "aioeuAIOEU";
        boolean isVow ;
            String newS = "" ;
            for (int i = 0 ; i < string.length() ; i++) {
                isVow = false ; 
                char c = string.charAt(i);
                if (c == 32){
                    newS += c;
                }
                else {
                    // #feedback: could be done more simple with string
                   isVow = voewls.indexOf(c) != -1;
                    // #feedback: it's better to use boolean with their values instead of comparing them.
                     if (!isVow) {
                        if (c >= 65 && c<= 90){
                        newS += (char)(c+32);
                        }
                        else {
                            newS+= c;
                        }
                    }
                    else {
                        // #feedback: isVow will always be true here, since the else relate to the opposite check (when it false)
                            if (c >= 97 && c<= 122){
                                newS += (char)(c-32);
                            }
                            else {
                                newS += c;
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
