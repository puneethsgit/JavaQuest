/* what will be the output (a) Error (b) 0 2 (c) 1 2 (d) 2 2 */
class Book {
    int price;
    static int count;
    /* static variables means for book obj count is same for all obj where price variable will be diff for each obj
     and also if u make change in count variable then all the obj will be changed because count variable created only once and the obj points to same address
     */

    public Book(int price) {
        this.price = price;
        count++;
    }
}
public class Q8oops {
    public static void main(String[] args) {
        System.out.print(Book.count +  " ");
        //the above statement is correct that is static variable can directly be accessed through class
        Book b1 = new Book(500);
        Book b2 = new Book(250);
        System.out.println(Book.count);
    }
}
