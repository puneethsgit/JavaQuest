import java.util.LinkedList;
public class P2llcollectn {
    public static void main(String[] args) {
        //create 
        LinkedList<Integer> ll = new LinkedList<>();
        
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //0->1->2->3->4->5

        //print 
        System.out.println(ll);
        
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

        //print head tail
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
    }
}
