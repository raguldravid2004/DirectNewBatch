package dravidworkout;

public class SwitchCase {
	public static void main(String[] args) {
		int days=1;
		switch (days) {
		
		case 0:
			System.out.println("sunday");
			
			break;
		case 1:
			System.out.println("monday");
			
			
		case 2:
			System.out.println("tuesday");
			
			
		case 3:
			System.out.println("wednesday");
			
			
		case 4:
			System.out.println("thursday");
			
			
		case 5:
			System.out.println("friday");
			
			break;
		case 6:
			System.out.println("saturday");
			
			break;

		default:
			System.out.println("invalid day...you brain less creature..");
			break;
		}
	}

}
