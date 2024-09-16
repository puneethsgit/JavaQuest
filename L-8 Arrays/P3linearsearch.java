public class P3linearsearch {
    public static int linearSearch(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1; //false
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16};
        int key = 122;
        int index = linearSearch(num, key);
        if(index == -1){
            System.out.println("Not found !");
        }else{
            System.out.println("Key is at index : " + index);
        }
    }
}
