package assesments;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial : ");
		int num = sc.nextInt();
		int result = 1;
		for(int i=num; i>=1;i--) {
			result = result*i;
		}
		System.out.println("Facorial of "+num+ " is : "+result);
		
		sc.close();
	}
}
