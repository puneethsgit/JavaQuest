/* Print reverse of an array list */

import java.util.ArrayList;
import java.util.Arrays;

public class P3printreverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding multiple elements at once
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        
        //O(n)
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
