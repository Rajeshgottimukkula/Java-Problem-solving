/* 

String Repetition:

Write a program to print the given input word N times in a single line separated by space.

Input

The first line of the input will be a single line containing a string. The second line of the input will be a single line containing a integer (N).

Output

The output should be a single line containing the word printed n
times separated by space.

For example, if the given input is "pen", and N is 2 then you should print pen two times separated by space.

Sample Input 1

pen

2

Sample Output 1

pen pen
has context menu



*/



import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int repeatTimes=sc.nextInt();
        
        String wordWithSpace=word+" ";
        for(int i=0;i<repeatTimes;i++){
            
            System.out.print(wordWithSpace);
        }
       
    }
}