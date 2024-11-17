public class P2increaseorder {
    public static void increasingOrder(int n) {
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n+ " ");
    }
    
    public static void main(String[] args) {
        increasingOrder(5);
    }   
}

