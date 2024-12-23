/* Printing max element */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P4maxfind {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements using loops
        int elements[] = {7,9,2,5,7,6};
        for(int element : elements) {
            list.add(element);
        }
        /* Adding elements using Collections.addAll - O(n)
        Collections.addAll(list, 1, 2, 3, 4, 5); */

        // Max find - O(n)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            // if(max < list.get(i)) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }

        System.out.println("max = " + max);
    }
}
