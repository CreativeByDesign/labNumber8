import java.util.Scanner;

public class labNumber8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Please pick a number from 1- 10 to learn about a student: ");
		
		String[]name = {"David Boone", "Jack Daniels", "Kate Hudson", "James Bond", "Suzie Que", "Sailor Moon", "Jackie Robinson", "Robert Smith", "Jane Austin"," Tiffany Lane"};
		String [] favoriteFood = {"Steak", "Chicken", "Pasta", "Fish",	"Stir Fry", "Tacos","Burgers","ice cream","Mac & Cheese", "Eggs Benedict"};	
		String [] homeTown = {"Chicago, IL","Richmond,VA", "Detroit, MI", "New York, NY", "Dallas,Town", "Whosville, OK", "Cleveland, OH", "Savannah, GA", "Miami, Florida", "Long Beach, CA","Seattle, WA"}; 
		
		//get user info but user to get 1 userNum -1
		int userNum = scan.nextInt()-1;
		String cont = "Y";
		
		System.out.println("The student name is " + name [userNum]+ ".");
		System.out.println("Would you like to know more about this student? Y or N");
		cont = scan.next();
		while (cont.equalsIgnoreCase("Y")) {
		System.out.println(name [userNum]+ " favorite food is "+ favoriteFood [userNum]+".");
		System.out.println("Would you like to know more about this student? Y or N");
		 
		cont = scan.next();
		if (cont.equalsIgnoreCase("Y")) {
			System.out.println("Also, "+ name[userNum]+ " is from "+ homeTown [userNum]);}
			System.out.println("Would you like to know more about this student? Y or N");
		
			 if(cont.equalsIgnoreCase("Y")) {
				cont = scan.next();
				System.out.println("That's enough! You can't know everything.");
			}System.out.println("Have a great day!");
		}
		
		
		
		
		
		
		
		
		scan.close();
		

	}

	public static String studentInfo(String[] one, String[] two, String three) {

		for (int i = 0; i < one.length; i++) {

		}
		return null;
	}

}
