import java.util.ArrayList;
import java.util.Scanner;
public class UnoCardDriver {
	private static ArrayList <UnoCard> player = new ArrayList <UnoCard>(); //arraylist holding uno hand for the player
	private static ArrayList <UnoCard> computer = new ArrayList <UnoCard>(); //arraylist holding uno hand for the computer
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UnoCard firstCard = new UnoCard();
		UnoCard topCard = firstCard;
		int playerChoice;
		UnoCard cardPlayed;
		UnoCard computerCardPlayed;
		int counter = 0;
		for(int i = 0; i < 7; i++) {
			player.add(new UnoCard());
			computer.add(new UnoCard());
		}
		//System.out.println("Computer Hand");
		//for(int i = 0; i < computer.size(); i++) {
			//System.out.print(computer.get(i) + " ");
		//}
		while(player.size() > 0 || computer.size() > 0) {
			//player loop
			System.out.println("Here is your hand");
			for(int i = 0; i < player.size();i++) {
				//prints out the indexes of the cards
				System.out.print((i + 1) + "  ");
			}
			System.out.println();
			for(int i = 0; i < player.size(); i++) {
				//prints out the cards themselves
				System.out.print(player.get(i) + " ");
			}
			System.out.println();
			System.out.println("The card laying face up is: " + topCard);
			System.out.print("What card are you going to play, (enter index number or type 0 to draw a card)? ");
			playerChoice = sc.nextInt();
			if(playerChoice == 0) {
				player.add(new UnoCard());
			} else if (playerChoice > 0 && playerChoice <= player.size()) {
				cardPlayed = player.remove(playerChoice - 1);
				if(topCard.toString().charAt(0) == cardPlayed.toString().charAt(0) || topCard.toString().charAt(1) == cardPlayed.toString().charAt(1)) {
					topCard = cardPlayed;
					System.out.println("You laid down " + cardPlayed);
				} else {
					System.out.println("Please enter a valid card!");
				}
				
			} else {
				System.out.println("Please enter a valid card!");
			}
			
			//computer loop
			for(int i = 0; i < computer.size(); i++) {
				//goes through computer hand, checking for compatible card
				UnoCard computerCard = computer.get(i);
				//if they match, remove the UnoCard object from the computer's hand
				if(topCard.toString().charAt(0) == computerCard.toString().charAt(0) || topCard.toString().charAt(1) == computerCard.toString().charAt(1)) {
					computerCardPlayed = computer.remove(i);
					System.out.println("Computer Played: " + computerCardPlayed);
					break;
				}
				if(i == computer.size() - 1) {
					computer.add(new UnoCard());
				}
			}
			System.out.println("The computer has " + computer.size() + " cards");
			System.out.println();
		}
		System.out.println("Game Over!");
		if(player.size() == 0) {
			System.out.println("Congratulations! You Won!");
		} else {
			System.out.println("You Lost!");
		}
		
	}

}
