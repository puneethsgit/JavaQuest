/* Arraylist - Syntax */
import java.util.ArrayList; //import java.util.*;
public class P1arraylistsyntax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();


        //ADD ELEMENT - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        /*int a[] = {1,2,3};
        System.out.println(a); //prints address */

        //GET ELEMENT - O(1)
        System.out.println(list.get(1));

        //REMOVE ELEMENT - O(n) linear time
        System.out.println(list.remove(1));
        System.out.println(list);

        //SET ELEMENT AT INDEX - O(n)
        list.set(0, 10);
        System.out.println(list);

        //CONTAINS ELEMENT - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(10));

        //ADDING ELEMENT WITH RESPECT TO INDEX - O(n)
        list.add(1,9);
        System.out.println(list);
    }
}
