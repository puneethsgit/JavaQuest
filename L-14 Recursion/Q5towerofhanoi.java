/**
Towers of Hanoi: In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).

You have the following constraints:

(1) Only one disk can be moved at a time.
(2) A disk is slid off the top of one tower onto another tower.
(3) A disk cannot be placed on top of a smaller disk. Write a program to move the disks from the first tower to the
last using Stacks.
 */
public class Q5towerofhanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src+ " to "+ dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src+ " to "+ dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
    
}