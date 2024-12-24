import java.util.ArrayList;
import java.util.Collections;

public class P6sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 7,9,8,1,1,2,3);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); //after , comma its comparitor based on which it sort
        System.out.println(list);
    }
}
