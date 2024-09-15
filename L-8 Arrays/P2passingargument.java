public class P2passingargument {
    //Arrays are passed to function in form of reference 

    public static void update(int marks[], int nonChangeable){
        nonChangeable = 6;
        for(int i=0; i<marks.length; i++){  //i<=marks.length index out of bound array 0to2 so size = 3
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int nonChangeable = 5;
        int marks[] = {97,98,99};
        update(marks, nonChangeable);
        System.out.println(nonChangeable);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
