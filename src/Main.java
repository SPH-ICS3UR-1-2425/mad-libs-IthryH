import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		//done
		System.out.println("Name an Athelete: ");
		String athelete=in.nextLine();
		//done
		System.out.println("Name an Event: ");
		String event = in.nextLine();

		//done
		System.out.println("Name a food: ");
		String food = in.nextLine();
		
		
		
		//done
		System.out.println("Name a clothing brand: ");
		String clothes = in.nextLine();
		
		System.out.println("Name a city: ");
		String city = in.nextLine();
		
		System.out.println("Name a Country: ");
		String country = in.nextLine();
		
		System.out.println("Name a Planet: ");
		String planet = in.nextLine();
		
		
		//done
		System.out.println("Give me a decimal number: ");
		Double num = in.nextDouble();

		//done
		System.out.println("What is your favourite number: ");
		int num1 = in.nextInt();
		

		System.out.println("What year is it: ");
		int year = in.nextInt();
		
		
		
		System.out.print(athelete + " Participated in "+ event + " and had "+ food+ ","+ athelete+" ate their dish in "+num+ " seconds, while wearing a " + clothes + " tracksuit."+ num1+" Is the Users favourite number, This story was written in, "+ year+" ," + city+" ," + country+" ," + planet);
				
		
		
		
		
		
		
		
		in.close();
	}

}
