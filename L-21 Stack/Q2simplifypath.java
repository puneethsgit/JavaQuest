/*Simplify Path
We hava an absolute path for a file (Unix-style), simplify it. Note that absolute path always begin
with ‘/’ ( root directory ), a dot in path represent current directory and double dot represents
parent directory.
Sample Input 1 : /apnacollege/
Sample Output 1 : /apnacollege
Sample Input 1 : /a/..
Sample Output 1 : /

Time Complexity : o(n) 
Space Complexity: o(1)
---------------------------------------------------------------------------------------------------------
You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

The rules of a Unix-style file system are as follows:
------------------------------------------------------  
A single period '.' represents the current directory.
A double period '..' represents the previous/parent directory.
Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.

The simplified canonical path should follow these rules:
----------------------------------------------------
The path must start with a single slash '/'.
Directories within the path must be separated by exactly one slash '/'.
The path must not end with a slash '/', unless it is the root directory.
The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
Return the simplified canonical path.


 */

import java.util.Stack;

public class Q2simplifypath {
    public static void main(String[] args) {
        String str = new String("/app/./bcd/../../cd"); 
        String res = simplify(str);
        System.out.println(res);
    }

    //Function to simplify the given abosulte path
    public static String simplify(String A) {
        //Stack to store valid directories names
        Stack<String> st = new Stack<>();

        //Resultant simplified path
        String res = "";
        res += "/"; //starts with root directory

        int len_A = A.length();  //length of the input path

        //traverse the input path
        for(int i=0; i<len_A; i++) {
            String dir = "";

            //skip consecutive slashes
            while(i < len_A && A.charAt(i) == '/') {
                i++;
            }

            //exract the directory name
            while(i < len_A && A.charAt(i) != '/') { //single letter folder name eg: a or "puneeth" folder name so dir variable
                dir += A.charAt(i);
                i++;
            }

            //handle '..' (parent directory)
            if(dir.equals("..") == true) {
                if(!st.isEmpty()) {
                    st.pop(); //Go back to the parent directory
                }
            }

            //handle '.' (current directory)
            else if(dir.equals(".") == true) {
                continue; // stay in the current directory
            }

            //push the valid directory name onto the stack
            else if(dir.length() != 0) {
                st.push(dir); //the directory word is pushed here
            }
        }


        //use a temporary stack to reverse the order of directories
        Stack<String> st1 = new Stack<>();
        while(!st.isEmpty()) {
            st1.push(st.pop());
        }

        //Build the simplified path
        while(!st1.isEmpty()) {
            if(st1.size() != 1) { 
                res += (st1.pop() + '/'); //Add directory with trailing slash
            }else {
                res += st1.pop(); //Add the last directory without trailing slash
            }
        }
        return res;
    }
}


/* Processing the input /a/./b/../../c/:

/a/ → Push a onto the stack.
./ → Ignore, as it refers to the current directory.
/b/ → Push b onto the stack.
../../ → Pop b from the stack (go back to the parent directory), then pop a (go back to the root directory).
/c/ → Push c onto the stack. */


/* TC : O(n) although we are using 2 while loop inside for loop but i is increment in both while loop so 2(n) ignore constant

1. Analyzing the Outer for Loop:
The outer loop iterates over the input string A, from i = 0 to i = len_A - 1, where len_A is the length of the input string. The loop runs n times, where n = len_A.

So, the number of iterations of the outer loop is:

Iterations of the outer loop = 𝑂(𝑛)
Iterations of the outer loop = O(n)
2. Analyzing the First while Loop (Skipping Consecutive Slashes):
The first while loop skips over consecutive slashes (/). This loop will run every time it encounters a / in the string and increment i to skip over the slashes.

In the worst case, the string could consist entirely of /, which would mean the loop will run n times (where n is the length of the string).
However, each / is processed only once and skipped, so the total number of iterations for this loop is O(n).
Mathematically, the number of operations performed by this loop is:

Operations for first while loop = 𝑂(𝑛)
Operations for first while loop = O(n)
3. Analyzing the Second while Loop (Extracting Directory Names):
The second while loop extracts directory names between slashes (/). It processes each directory by accumulating characters into the dir variable until it encounters a /.

For each directory name, the loop will iterate over each character of the directory. In the worst case, the directory name could be the entire remaining string.
Since each character in the string is processed exactly once (either as part of a directory name or skipped by the first while loop), the total number of operations in this loop is also O(n).
The number of operations performed by this loop is:

Operations for second while loop = 𝑂(𝑛)
Operations for second while loop = O(n)
4. Combining the Loops:
Both loops are inside the for loop, which runs n times. However, since the operations performed by the first and second while loops are sequential and not nested within each other, we can combine their time complexities:

Total time complexity = 𝑂(𝑛)+𝑂(𝑛)=𝑂(𝑛)
Total time complexity = O(n)+O(n)=O(n)
5. Conclusion:
The overall time complexity is dominated by the number of iterations through the string and the operations within each loop. Since each character in the input string is processed once (either skipped or added to the directory stack), the total time complexity is:
𝑂(𝑛)

O(n)
​

 */