/* String Compression
  "aaabbcccdd" = "a3b2c3d2"
  "abc" = "a1b1c1" (x) decompress "abc"
 */
public class P9stringcompress { 
    //using String literals
    public static String compress(String str){
        String newStr = "";
        
        for(int i=0; i<str.length(); i++){
            Integer count = 1; //used object integer so that we can use this method toString()
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){  //decompress
                newStr += count.toString();
            }   
        }
        return newStr;
    }

    //using string builder
    public static String compress2(String str){
        StringBuilder newStr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
            //i++ (for loop inside increment)
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "aaaabbbbbbbbcccc";
        System.out.println(compress1(str));
    }
}
