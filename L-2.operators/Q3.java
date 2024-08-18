public class Q3 {
    public static void main(String[] args) {
        int x, y, z; 
        x=y=z=2; //x=2,y=2,z=2
        x += y; // x=2 y=2 x = x+y => 2+2 =4
        y -= z; // y=2 z=2 y=y-z (y-=z) 2-2 =0
        z /= (x+y); // z=2 (x+y) 4+0 = 4 => 2/4 =2
        System.out.println(2/4);
        System.out.println(x + " " + y  + " " + z);
    }
}
