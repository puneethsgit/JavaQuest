/* For a Given String convert each the first letter of each word to uppercase */
public class P8firstlettercapital {
    
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        //firstcharacter uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i)); //space is appended 
                i++; //i incremented
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i)); //append normal character (lower or upper)
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am puneeth";
        System.out.println(toUpperCase(str));
    }
}
