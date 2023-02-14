// PROBLEM STATEMENT

/* Print the Input - 2
For this problem, you need to write code to read a single line of input and print the line after the message "Given input: ".

Sample Input 1
Happy Coding

Sample Output 1
Given input: Happy Coding

*/


import java.util.*;

class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner sc=new Scanner(System.in);
        String inputValue=sc.nextLine();
        System.out.printf("Given input: %s", inputValue);
        
        
    }
}