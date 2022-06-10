package summa;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number to Add");
		int num1 = sc.nextInt();
		System.out.println("Enter Secound Number to Add");
		int num2 = sc.nextInt();
		System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));

	}

}
