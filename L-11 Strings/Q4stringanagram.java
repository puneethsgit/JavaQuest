/*determine 2 string is anagrams eachother
Anagrams :- Anagrams means 2 string contain same characters but in a different order*
//String Anagram -> (Anagram means Num of length same and Num of Letter same only arrangment different )
//hello -> 'llheo' -> True
//puneeth -> 'eeethpun' -> false

/* Anagram Condition
1. Length check for both String
2. letter check 'hello' {h:1,e:1,l:2,o:1}  ->  {h:0,e:0,l:0,o:0} True */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q4stringanagram {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "caxe";

        
        //convert string to lowercase so we dont have to check seperately for lower and upper case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Length check for both string
        if(str1.length() == str2.length()){
            //convert string into char array (using method called toCharArray())
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            //sort the char arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other ");
            }else{
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other ");
            }
        }else{ //case when length is only not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other ");
        }
    }
}
