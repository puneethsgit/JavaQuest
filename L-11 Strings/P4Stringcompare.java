public class P4Stringcompare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1==s2){ //Equal becuase both are created using string literals (string pool) s2 points to same value s1
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        if(s1==s3){ //Not Equal s1 is created as string literals and s3 is created using string object
             System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        if(s1.equals(s3)){ // .equals() functions checks only the value irrespective of their type
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
