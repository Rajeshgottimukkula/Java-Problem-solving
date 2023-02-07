import java.util.Scanner;

public class ReadingFromKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("May I know your name please?");
		String name=sc.nextLine();
		System.out.println("Hello "+name);

	}

}
