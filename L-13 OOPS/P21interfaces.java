/* INTERFACE -> IS A BLUEPRINT OF A CLASS (WHEREAS CLASS WAS A BLUE PRINT FOR OBJECTS) 
 example - interface CAR, class MARUTI 800, object many 800 cars
 INTERFACES USED FOR 2 PURPOSE 
 1.MULTIPLE INHERITANCE (IN C++ IT CAN BE DEFINED USING CLASS BUT IN JAVA USING CLASS CANT POSSIBLE)
 2. TO ACHIEVE TOTAL ABSTRACTION 
 (previous animal eat & walk method where walk method is absracted but not eat method) so not 100 % abstraction

 -> INTERFACE DEFINED USED INTERFACE KEYWORD AND EXTEND USING IMPLEMENT KEYWORD.
 -> ALL METHODS ARE PUBLIC, ABSTRACT (BYDEFAULT) & WITHOUT IMPLEMENTATION.
 -> VARIABLES IN INTERFACE ARE FINAL, STATIC, & PUBLIC
 (STATIC-> CREATED ONLY ONCE, BELONG TO INTERFACE ITSELF RATHER THAN ANY SPECIFIC INTSTANCE)
 (FINAL-> VALUE WILL BE AS IT IS AND CANT BE CHANGED)
 (PUBLIC-> CAN BE ACCESSED ANYWHERE)
 */
public class P21interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves(); // no - implementaion
}

class Queen implements ChessPlayer {
    public void moves() { // no access keyword bydefalut will be DEFAULT
        System.out.println("up, down, left, right, diagonal (in all 4 direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left, right (by one step)");
    }
}
