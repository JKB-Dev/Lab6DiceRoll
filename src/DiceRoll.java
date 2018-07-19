import java.util.Scanner;
import java.util.Random;

public class DiceRoll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");

		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("How many sides should each die have?");

			int sides = scan.nextInt();
			int die1 = random1(sides);
			int die2 = random2(sides);

			System.out.println(die1);
			System.out.println(die2);

			if ((die1 == 1) && (die2 == 1)) {
				System.out.println("Snake eyes!");
			}

			else if ((die1 == 6) && (die2 == 6)) {
				System.out.println("Boxcars!");
			}

			else if ((die1 + die2 == 7) || (die1 + die2 == 11)) {
				System.out.println("Craps!");
			}

			scan.nextLine();
			System.out.println("Roll again? (y/n): ");
			cont = scan.nextLine();
		}
		scan.close();
	}

	public static int random1(double sides) {
		int num1 = (int) (Math.random() * sides) + 1;
		return num1;
	}

	public static int random2(int sides) {
		Random rand = new Random();
		int num2 = (rand.nextInt(sides) + 1);
		return num2;
	}
}
