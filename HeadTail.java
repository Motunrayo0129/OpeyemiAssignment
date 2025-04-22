import java.util.Scanner;
public class HeadTail {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int computerChoice = (int)(Math.random() * 2);
	//System.out.println(computerChoice);

System.out.print("Choose a number between 0 and 1: ");
	int userGuess = scanner.nextInt();

	if (userGuess == 0 && computerChoice == 0)
System.out.print("The computer is head. You are head. Is draw");

	if (userGuess == 0 && computerChoice == 1)
System.out.print("The computer is head. You are head. You won");

	if (userGuess == 1 && computerChoice == 0)
System.out.print("The computer is head. You are tail. You loss");

	if (userGuess == 1 && computerChoice == 1)
System.out.print("The computer is tail. You are tail. Is draw");



}
}