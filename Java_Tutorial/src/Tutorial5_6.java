/*This tutorial covers Interfaces and inheritance of Interfaces*/
import java.util.Scanner;
public class Tutorial5_6 implements Cukoo{
	Tutorial5_6(){
		System.out.println(Cukoo.NAME);
		System.out.println("Enter Choice:-");
		int choice = (new Scanner(System.in)).nextInt();
		switch (choice) {
		case 1:
			Eats();
			break;
		case 2:
			BuildNests();
			break;
		case 3:
			Sings();
			break;
			
		}
	}
	@Override
	public void Eats() {
		System.out.println("A bird eats");
		
	}

	@Override
	public void BuildNests() {
		System.out.println("A bird builds nest");
		
	}

	@Override
	public void Sings() {
		System.out.println("A bird sings");
		
	}
	public static void main(String[] args) {
		new Tutorial5_6();
	}
	
}