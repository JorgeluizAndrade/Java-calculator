package calculate;

import java.util.Scanner;

public class Calculate {
	
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	public int mult(int num1, int num2) {
		return num1 * num2;
	}
	
	
	public static void main(String[] args) {
		Calculate c = new Calculate();
		
		int option = 5;
		
		int num1;
		int num2;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("-Choose an option-");
		System.out.println("[1]----SUM");
        System.out.println("[2]----SUB");
        System.out.println("[3]----MULT");
        System.out.println("[4]----DIV");
        System.out.println("[0]----EXIT");
		System.out.println("Operation: ");
		
		option = input.nextInt();
		
		while(option != 0) {
			Scanner inp = new Scanner(System.in);
			
			System.out.println("What your first num: ");
			num1 = inp.nextInt();
			System.out.println("What your second num: ");
			num2 = inp.nextInt();
			
			if(option == 1) {
				int res = c.sum(num1, num2);
				System.out.printf("\nO result in Sum is: %d\n", res);
				break;
			} else if(option == 2) {
				int res = c.sub(num1, num2);
				System.out.printf("\nO result in sub is: %d\n", res);
				break;
			} else if(option == 3) {
				int res = c.mult(num1, num2);
				System.out.printf("\nO result in mult is: %d\n", res);
				break;
			} else if(option == 4) {
				int res = c.sub(num1, num2);
				System.out.printf("\nO result in div is: %d\n", res);
				break;
			} else {
				System.out.println("?");
				break;
			}
		}
	}	
}
