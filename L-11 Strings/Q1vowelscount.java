//vowels count in string
public class Q1vowelscount {
    public static int vowelsCount(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i)); //handel uppercase as well
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.print("Total vowels are : ");
        return count;
    }
    public static void main(String[] args) {
        String str = "puneeths";
        System.out.println(vowelsCount(str));
    }
}
