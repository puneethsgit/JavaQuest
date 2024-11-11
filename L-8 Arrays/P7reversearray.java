public class P7reversearray {  //2 pointer algorithm approach
    public static void reverseArray(int num[]){
        int start = 0;
        int end =  num.length-1;
        while(start < end){
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int num[] = {10,9,8,7,6};
        reverseArray(num);
        //System.out.println(num);// array address

        //array print
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }
}
