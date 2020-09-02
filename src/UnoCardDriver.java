import java.util.ArrayList;
import java.util.Scanner;
public class UnoCardDriver {
	private static ArrayList <UnoCard> player = new ArrayList <UnoCard>(); //arraylist holding uno hand for the player
	private static ArrayList <UnoCard> computer = new ArrayList <UnoCard>(); //arraylist holding uno hand for the computer
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice;
		UnoCard cardPlayed;
		int counter = 0;
		for(int i = 0; i < 7; i++) {
			player.add(new UnoCard());
			computer.add(new UnoCard());
		}
		System.out.println("My hand");
		for(int i = 0; i < player.size();i++) {
			System.out.print((i + 1) + "  ");
		}
		System.out.println();
		for(int i = 0; i < player.size(); i++) {
			System.out.print(player.get(i) + " ");
		}
		System.out.println();
		//System.out.println("Computer Hand");
		//for(int i = 0; i < computer.size(); i++) {
			//System.out.print(computer.get(i) + " ");
		//}
		UnoCard randomCard = new UnoCard();
		System.out.println("The card laying face up is: " + randomCard);
		System.out.print("What card are you going to play, or type 0 to draw a card? ");
		playerChoice = sc.nextInt();
		if(playerChoice == 0) {
			player.add(new UnoCard());
		} else if (playerChoice > 0 && playerChoice < player.size()) {
			cardPlayed = player.remove(playerChoice);
			System.out.println("You laid down " + cardPlayed);
		} else {
			System.out.println("Please enter a valid card!");
		}
		
	}

}
