/* 
Print in Reverse Order

Write a program that reads two lines of input and prints those two lines in the reverse order. (Print the message given in the second line of input before the first line of input)

Sample Input
Book
Pen

Sample Output
Pen Book
*/

import java.util.*;

class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner sc=new Scanner(System.in);
        String firstInput=sc.nextLine();
        String secondInput=sc.nextLine();
        System.out.println(secondInput);
        System.out.println(firstInput);
    }
}