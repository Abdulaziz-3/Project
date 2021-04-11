package h;
import java.util.Scanner;

public class saddf {

	public static void main(String[] args) {

		String a[] ={"1: Shawarma ", "2: Burger ", "3: Broasted ","4: Rice with chicken ","5: Pasta ","6: Arikah"};
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		Scanner r = new Scanner (System.in);
		System.out.println(" ");

		System.out.println("Choose your number order:");

		double grade;
		if (!r.hasNextDouble()) 
			System.out.println("Error: enter a number!!");
		else {
			grade = r.nextDouble();
			
		      if(grade == 1) 
				System.out.println("Your order price: SAR 7 ");
			
			else if(grade == 2)
				System.out.println("Your order price: SAR 10 ");
			
			else if(grade == 3)
				System.out.println("Your order price: SAR 14 ");
			
			else if(grade == 4)
				System.out.println("Your order price: SAR 23 ");
			else if(grade == 5)
				System.out.println("Your order price: SAR 34 ");
			else if(grade == 6)
				System.out.println("Your order price: SAR 13 ");
			else {
				System.out.println("Error: wrong number!!"); }

		}
		
		
	}
	}
