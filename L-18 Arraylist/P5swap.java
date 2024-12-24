/* Swap Number */

import java.util.ArrayList;
import java.util.Collections;

public class P5swap {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

        int idx1 = 1;
        int idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
