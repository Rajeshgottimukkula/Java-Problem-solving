import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Revision1 {

	
	
    public static void main(String[] args) {
    	
    	
    	//Revision 1
    	
    	/////////////////// String Methods//////////////////////
    	
    	//Taking the user Input
    	Scanner sc=new Scanner(System.in);
    	//int age=sc.nextInt();
    	int age=24;
    	//System.out.println("age is: "+age);
    	
    	
    	
    	
    	
    	
    	
    	
    	String name="Rajesh Gottimukkula";
    	System.out.println(name);
    	
    	//Removing the leading and tailing spaces
    	String nameWithSpaces="     Rajesh ";
    	String nameWithoutSpaces=nameWithSpaces.trim();
    	System.out.println(nameWithoutSpaces);
    	
    	//To check whether two strings are same
    	
    	String duplicateName="Rajesh";
    	
    	System.out.println(duplicateName.equalsIgnoreCase(nameWithoutSpaces));
    	
    	
    	// String formatting
    	
    	
    	
    	System.out.printf("Name is %s",name);
    	System.out.printf("Age is %d",age);
    	
    	
    	
    	
    	//TO substring or to slice the string
    	System.out.println(name.substring(0,7));
    	//To know the length
    	System.out.println(name.length());
    	System.out.println(name.concat(" BFSI"));
    	System.out.println(name.toUpperCase());
    	//To convert a string to an array
    	String[] nameArray;
    	nameArray=name.split("");
    	System.out.println(nameArray.length);
    	for(String s:nameArray) {
    		System.out.println(s);
    	}
    	
    	//////////////// Character methods ////////////////////
    	// We use Character class
    	char c='R';
    	
    	System.out.println(Character.isLetter(c));
    	System.out.println(Character.isDigit(c));
    	System.out.println(Character.toString(c));
    	String s=Character.toString(c);
    
    	
    	
    	
    	///////////// Prefix and Postfix//////////////
    	
    	int number=10;
    	++number;
    	System.out.println(number);
    	
    	
    	
    	
    	///////////////////////////////////Revision 2 ////////////////////////////
    	
    	/// Working with Arrays //////////////
    	
    	//Arrays class
    	
    	
    	// The size of the array is fixed
    	Integer numbers[]= {1,2,4,3,8};
    	
    	
    	String names[]= {"Rajesh","Kalyan","Siri","Dhamu"};
    	
    	System.out.println(Arrays.toString(names));
    	
    	
    	//Iterating over an array
    	
    	for(int i=0;i<names.length;i++) {
    		
    		
    		
    		System.out.println(names[i]);
    	}
    	
    	// Using for each loop
    	
    	for(String n:names) {
    		System.out.println(n);
    	}
    	
    	
    	
    	// Array concatination ////
    	
    	// System class
    	
    	
    	String list1[]= {"Rajesh","Siri"};
    	
    	String list2[]= {"Kalyan","Dhamu"};
    	String finalList[]=new String[list1.length+list2.length];
    	
    	System.arraycopy(list1, 0, finalList, 0, list1.length);
    	System.arraycopy(list2, 0, finalList, list1.length, list2.length);
    	
    	System.out.println(Arrays.toString(finalList));
    	
    	
    	
    	
    	
    	//// Array slicing ///
    	
    	String slicedArray[]=Arrays.copyOfRange(finalList, 0, 2);
    	System.out.println(Arrays.toString(slicedArray));
    	
    	
    	/// Multi dimensional skills ////
    	
    	int numbersList[][]= {{1,2,3},{9,4,6}};
    	
    	System.out.println(numbersList[1][1]);
    	
    	
    	
    	
    	// Reversing of Arrays
    	
    	// Using Collection class
    	
    	Collections.reverse(Arrays.asList(numbers));
    	
    	System.out.println(Arrays.toString(numbers));
    	
    	
    	// Sorting the Arrays
    	
    	Arrays.sort(numbers);
    	System.out.println(Arrays.toString(numbers));
    	
    	// Sorting in Reverse order
    	
    	Arrays.sort(numbers,Collections.reverseOrder());
    	System.out.println(Arrays.toString(numbers));
    	
    	
    	
    	// Dealing with big numbers Using BigInteger class
    	
    	
    	
    	String b1="72871763762672";
    	String b2="8328391129391";
    	BigInteger bigNumber1=new BigInteger(b1);
    	BigInteger bigNumber2=new BigInteger(b2);
    	
    	System.out.println(bigNumber1.add(bigNumber2));
    	System.out.println(bigNumber1.subtract(bigNumber2));
    	
    	/// Nested loops and loop control statements
    	
    	int number1=2;
		for(int i=0;i<number1;i++) {
    		
    		System.out.println("Outer loop is executed "+ i+" time");
if(i==1) {
    			
    		continue;	
    		}
    		int number2=2;
			for(int j=0;j<number2;j++) {
    			
    			System.out.println("Inner loop is executed "+j+" time");
    			
    		}
    		
    		
    		
    		
    	}
    	
    	
    	
    }
	
}
